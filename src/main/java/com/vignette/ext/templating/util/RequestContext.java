package com.vignette.ext.templating.util;

import com.vignette.as.client.api.bean.ChannelBean;
import com.vignette.as.client.api.bean.ManagedObjectBean;
import com.vignette.as.client.api.bean.SiteBean;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.ref.AsLocaleRef;
import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.AsLocale;
import com.vignette.as.client.javabean.Channel;
import com.vignette.as.client.javabean.ContentInstance;
import com.vignette.as.client.javabean.ContentType;
import com.vignette.as.client.javabean.IPagingList;
import com.vignette.as.client.javabean.ManagedObject;
import com.vignette.as.client.javabean.Segment;
import com.vignette.as.client.javabean.Site;
import com.vignette.as.client.javabean.TargetingRule;
import com.vignette.as.server.logic.service.IProviderResolver;

import com.vignette.as.server.pluggable.service.Provider;
import com.vignette.as.server.pluggable.service.SessionOriented;
import com.vignette.cms.client.common.ObjectId;

import com.vignette.ext.templating.cache.CachingDetail;
import com.vignette.ext.templating.cache.IObjectCache;
import com.vignette.ext.templating.cache.rules.IInvalidationRule;

import com.vignette.ext.templating.client.javabean.ComponentFragment;
import com.vignette.ext.templating.client.javabean.ContentComponentContainer;

import com.vignette.ext.templating.client.javabean.Format;

import com.vignette.ext.templating.client.javabean.PageLayout;
import com.vignette.ext.templating.client.javabean.PresentationFormat;
import com.vignette.ext.templating.client.javabean.Region;
import com.vignette.ext.templating.client.javabean.RegionFragment;
import com.vignette.ext.templating.client.javabean.Template;
import com.vignette.ext.templating.client.javabean.Theme;

import com.vignette.ext.templating.link.LinkSpec;

import com.vignette.ext.templating.profile.IProfile;
import com.vignette.ext.templating.segment.TargetingRuleEvalResult;
import com.vignette.hpd.api.CachingContext;

import com.vignette.hpd.api.DependencyName;

import com.vignette.logging.LoggingManager;
import com.vignette.logging.context.ContextLogger;
import com.vignette.util.MsgObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

public abstract class RequestContext implements Serializable {
  public static final String REQUEST_ATTRIBUTE_REQUEST_CONTEXT = "";
  
  public static final String BASE_SESSION_KEY = "";
  
  public static final String BASE_ATTRIBUTE_NAME = "";
  
  public static final String PARENT_OBJECT = "";
  
  public static final String PREVIEW_XML_PARAMETER = "";
  
  public static final String CONTENT_TYPE_NAME_PARAMETER = "";
  
  public static final String ELIGIBLE_CONTENT_TYPES_PARAMETER = "";
  
  public static final String PORTAL_SELECTED_MENU_ITEM = "";
  
  public static final String PORTAL_SELECTED_MENU_ITEM_ID = "";
  
  public static final String PORTAL_HIDDEN_MENU_ITEM = "";
  
  public static final String PORTAL_PORTLET_INTERACTION = "";
  
  public static final String FURL_HPD_REGISTRATION_INFO_ATTR = "";
  
  public static final String DEFAULT_FORMAT_NAME = "";
  
  public static final String PORTAL_NEXT_URL_FOR_PAGINATION = "";
  
  public static final String PORTAL_NAME_SPACE_FOR_PAGINATION = "";
  
  public static final String VGN_EXT_TEMPLATING_CONTEXT = "";
  
  public static final String TEMPLATING_SCOPE_ID = "";
  
  protected static final String INVALID_OID = "";
  
  protected static final String RECORD_CMS_TYPE = "";
  
  private static final String RENDER_OBJECT = "";
  
  protected static final String CACHED_REGION_HASHTABLE = "";
  
  private static final String CURRENT_LINK = "";
  
  private static final String PORTAL_PORTLET_CUSTOM_PROEPRTY = "";
  
  public static final String CURRENT_USER_PROFILE = "";
  
  public static final String IGNORE_TARGETING_RULES_PROFILE = "";
  
  public static final String MANUAL_SETTINGS_PROFILE = "";
  
  public static final String EXTERNAL_CONTENT_CONNECTION_ID_PARAM = "";
  
  private static ContextLogger LOG = LoggingManager.getContextLogger(RequestContext.class);
  
  transient PageContext pageContext;
  
  transient PrintWriter altWriter;
  
  transient IObjectCache objectCache;
  
  Date requestTime;
  
  String formatName;
  
  String siteDefaultFormat;
  
  String requestedOid;
  
  String requestedPath;
  
  String externalItemId;
  
  String externalParentId;
  
  String externalItemType;
  
  boolean externalContentConnection;
  
  boolean externalObjectRequest;
  
  ManagedObjectVCMRef requestedChannelId;
  
  String requestedExternalContentConnectionId;
  
  ArrayList<String> renderingDependenciesList = new ArrayList<String>();
  
  transient CachingContext cachingContext;
  
  Map actionData;
  
  protected List<String> trackedItems;
  
  protected Set<String> currentRegionDependencies;
  
  protected Set<String> aggregatedRegionDependencies = new ConcurrentSkipListSet<String>();
  
  protected boolean processingComplete;
  
  protected boolean noCache;
  
  protected String regionName;
  
  protected String overrideTTL = null;
  
  protected String parentSiteTTL = null;
  
  protected Theme theme = null;
  
  protected PageLayout pageLayout = null;
  
  protected List<String> renderedThemeLinks;
  
  protected List<String> renderedRegionLayoutFileLinks;
  
  protected List<String> renderedPageLayoutLinks;
  
  protected List<RegionFragment> regionFragments;
  
  protected Map<String, VisibilityStatus> visibilityStatusMap = new HashMap<String, VisibilityStatus>();
  
  protected List<ComponentFragment> componentFragments = new ArrayList<ComponentFragment>();
  
  protected Region region = null;
  
  protected static ArrayList<String> sSiteTypeList = new ArrayList<String>();
  
  protected static ArrayList<String> sTemplateTypeList = new ArrayList<String>();
  
  protected static ArrayList<String> sPageTypeList = new ArrayList<String>();
  
  protected static ArrayList<String> sSiteCTFormatMapTypeList = new ArrayList<String>();
  
  protected ContentComponentContainer pageObject;
  
  protected boolean defaultChannelUsed = false;
  
  protected Map<String, Boolean> segmentEvaluationStatus;
  
  protected Set<ManagedObjectVCMRef> aggregatePageTargetingRule;
  
  protected List<Segment> effectivePageSegments;
  
  protected Map<String, List<Segment>> aggregatePageSegments;
  
  private boolean requestedOidNotFound = false;
  
  private static final String PORTAL_LOCALE = "com.vignette.ext.templating.portal.locale";
  
  public static final String PROPERTY_PORTAL_SEGMENT_EVALUATION_STATUS = "Portal_Segment_Eval_Status";
  
  public static final String PROPERTY_PORTAL_SEGMENT_TYPE = "Portal";
  
  public static final String SEGMENT_PROFILE_REQ_PARAM = "vgnExtSegProfileId";
  
  Locale locale;
  
  AsLocaleRef localeRef;
  
  Boolean useLocalizedReferences = Boolean.valueOf(false);
  
  transient IProfile profile;
  
  private boolean ignoreTargetingRules;
  
  protected Set<String> hiddenCompIds = new HashSet<String>();
  
  protected Map<String, String> currentComponentRuleConditionIds = new HashMap<String, String>();
  
  protected Map<String, String> currentComponentRuleDisplayViewIds = new HashMap<String, String>();
  
  protected static Set<String> systemProfiles = new HashSet<String>();
  
  private Map<Boolean, Set<ManagedObjectVCMRef>> segments;

  public IProfile getProfile() {
    return null;
  }
  
  public HttpServletRequest getRequest() {
    return null;
  }
  
  public ManagedObjectBean getPrimaryRequestedObjectBean() throws ApplicationException {
    return null;
  }
  
  public ChannelBean getRequestedChannelBean() throws ApplicationException {
    return null;
  }
  
  public Object getRequestedChannelAttrVal(String attrName) throws ApplicationException {
    return null;
  }
  
  public SiteBean getCurrentSiteBean() throws ApplicationException {
    return null;
  }
  
  public void setRequestedChannelId(String channelIdString) {

  }
  
  public void setLocale(Locale locale) {
  }
  
  private Locale getLocaleFromString(String localeParam) {
    return null;
  }
  
  public AsLocaleRef getLocaleRef() {
    return null;
  }
  
  public void setLocaleRef(AsLocaleRef localeRef) {
  }
  
  public String getFormatName() {
    return null;
  }
  
  public String getSiteDefaultFormat() {
    return null;
  }
  
  public String getFormat() {
    return null;
  }
  
  public void setFormat(String format) {
  }
  
  public String getExternalItemId() {
    return null;
  }
  
  public void setExternalItemId(String externalItemId) {
  }
  
  public void setExternalParentId(String externalParentId) {
  }
  
  public String getExternalParentId() {
    return null;
  }
  
  public String getExternalItemType() {
    return null;
  }
  
  public void setExternalItemType(String externalItemType) {
  }
  
  public void setExternalObjectRequest(boolean externalObjectRequest) {
  }
  
  public boolean isExternalObjectRequest() {
    return true;
  }
  
  public boolean isExternalContentConnection() {
    return true;
  }
  
  public void setExternalContentConnection(boolean externalContentConnection) {
  }
  
  public void setSiteDefaultFormat(String format) {
  }
  
  public List<Segment> getEffectivePageSegments() {
    return null;
  }
  
  private List<Segment> getEffectivePortalSegments() {
    return null;
  }
  
  private List<Segment> getEffectiveDeviceSegments() {
    return null;
  }
  
  public Map<String, List<Segment>> getAggregatePageSegments() {
    return null;
  }
  
  public void setAggregatePageSegments(Map<String, List<Segment>> aggregatePageSegments) {
  }
  
  public ManagedObjectBean getTemplateBean() throws ApplicationException {
    return null;
  }
  
  public ContentComponentContainer getPageObject() {
    return null;
  }
  
  public void setPageObject(ContentComponentContainer pageObject) {
  }
  
  public IObjectCache getObjectCache() throws ApplicationException {
    return null;
  }
  
  public String getMetaTitle() throws ApplicationException {
    return null;
  }
  
  public String getMetaDescription() throws ApplicationException {
    return null;
  }
  
  public String getMetaKeywords() throws ApplicationException {
    return null;
  }
  
  public boolean processingComplete() {
    return true;
  }
  
  public void setProcessingComplete(boolean processingComplete) {

  }
  
  public boolean isNoCache() {
    return true;
  }
  
  public void setNoCache(boolean noCache) {
  }
  
  public void clearSegmentCache() {
  }
  
  public void clearSegmentCache(List<ManagedObjectVCMRef> segmentIds) {
  }
  
  public boolean inMgmtCDS() throws ApplicationException {
    return true;
  }
  
  public void registerDependenciesWithHPD(HttpServletRequest request) throws ApplicationException {
  }
  
  public DependencyName getDependencyName(String dependencyId) {
    return null;
  }
  
  public List<DependencyName> getDependencyNames(List dependencies) {
    return null;
  }
  
  private CachingDetail getCurrentFormatCachingDetail(Format[] formats) throws ApplicationException {
    return null;
  }
  
  public void invokeRenderingDependencyPlugin() throws ApplicationException {
  }
  
  public void startRenderedManagedObjectOutput() {
  
  }
  
  public List<String> getRegionDependencies() {
    return null;
  }
  
  public List<String> getRegionTrackingList() {
    return null;
  }
  
  public void endRenderedManagedObjectOutput() {
  }
  
  public void processTrackList(List trackables) throws ApplicationException {

  }
  
  public void track(ManagedObjectVCMRef ref) throws ApplicationException {
  }
  
  public void addRenderingDependency(String dependencyId) {
  }
  
  public void addRegionDependency(String dependencyId) {
  }
  
  public boolean isRenderRequest() {
   return true;
  }
  
  public void addRegionDependencies(List<? extends String> dependencyIds) {
  
  }
  
  public void addRenderingDependencies(List<? extends String> dependencyIds) {
   }
  
  public ArrayList getRenderingDependencies() {
    return null;
  }

  public void removeRenderingDependencies() {
  }
  
  public LinkSpec getCurrentLinkSpec() throws ApplicationException {
    return null;
  }
  
  public Object getRequestAttribute(String name) {
    return null;
  }
  
  public void setRenderedManagedObject(ManagedObject mo) {

  }
  
  public ManagedObject getRenderedManagedObject() throws ApplicationException {
    return null;
  }
  
  public ManagedObjectBean getRenderedManagedObjectBean() throws ApplicationException {
    return null;
  }
  
  public String getCurrentLink() throws ApplicationException {
    return null;
  }
  
  public boolean isPortalRequest() {
    return true;
  }
  
  public PageContext getPageContext() {
    return null;
  }
  
  public PageContext setPageContext(PageContext pageContext) {
    return null;
  }
  
  public String getSessionKey() {
    return null;
  }
  
  public String validateRequestedObjectId(String id, String param) {
    return null;
  }
  
  public String getRequestedExternalContentConnectionId() {
    return null;
  }
  
  public String getRequestOIDString() {
    return null;
  }
  
  public String getPreviewXML() {
    return null;
  }

  public boolean isPreview() {
    return true;
  }
  
  public String getPreviewContentTypeName() {
    return null;
  }
  
  public Date getCurrentTime() {
    return null;
  }
  
  private Object getManagedObjectProperty(ManagedObject mo, String attrName) throws ApplicationException {
    return null;
  }
  
  public Theme getTheme() throws ApplicationException {
    return null;
  }
  
  public void setTheme(Theme theme) {}
  
  public PageLayout getPageLayout() throws ApplicationException {
    return null;
  }
  
  public void setPageLayout(PageLayout pageLayout) {}
  
  public String getCookie(String cookieName) {
    return null;
  }
  
  public String getCurrentUserName() throws ApplicationException {
    return null;
  }
  
  public String getMessage(String msgId) {
    return null;
  }
  
  public String getParameter(String paramName) {
    return null;
  }
  
  public PrintWriter getResponseWriter() throws ApplicationException {
    return null;
  }
  
  public PrintWriter setAltResponseWriter(PrintWriter out) {
    return null;
  }
  
  public void printString(String str) throws ApplicationException {
   
  }
  
  public void printMsg(MsgObject msg) throws ApplicationException {
    
  }
  
  public String getMsgString(MsgObject msg) {
    return null;
  }
  
  void resetCachedRegionHashtable() throws ApplicationException, ValidationException {
  }
  
  public Hashtable getCachedRegionHashtable() throws ApplicationException {
    return null;
  }
  
  public String getRequestPath() {
    return null;
  }
  
  public ManagedObjectVCMRef getRequestChannelId() {
    return null;
  }
  
  public boolean isPrimaryRequestedObjectChannelOrPage() {
    return true;
  }
  
  public boolean isPrimaryRequestedObjectTemplate() {
    return true;
  }
  
  protected void setSiteHPDDefaults(Site currentSite) throws ApplicationException {
  
  }
  
  public void setRegionName(String name) {
   
  }
  
  public String getRegionName() {
    return null;
  }
  
  public String getOverrideTTL() {
    return null;
  }
  
  void populateContextFromSession() {
   
  }
  
  boolean isHiddenMenuItem() {
    return true;
  }
  
  boolean isPortletInteraction() {
    return true;
  }
  
  public void setDefaultChannelUsed(boolean defaultChannelUsed) {
   
  }
  
  public boolean isDefaultChannelUsed() {
    return true;
  }
  
  public Object getSessionVariable(String key) {
    return null;
  }
  
  public void setSessionVariable(String key, Object value) {
    
  }
  
  public void removeSessionVariable(String key) {
   
  }
  
  public String getPortletCustomProperty(String property) {
    return null;
  }
  
  public HashMap getPortletCustomProperties() {
    return null;
  }
  
  public String getNextURLForPagination() {
    return null;
  }
  
  public String getNameSpaceForPagination() {
    return null;
  }
  
  public CachingContext getCachingContext() {
    return null;
  }
  
  public static void registerExternalDependencyWithHPD(String dependencyId, HttpServletRequest request) throws ApplicationException {
   
  }
  
  public void setHPDNonCacheable(String reason) {
   
  }
  
  public long getEffectiveContentInstanceTTL() {
    return 0L;
  }
  
  public void setOverrideTTL(String overrideTTL) {
    
  }
  
  public String getParentSiteTTL() {
    return null;
  }
  
  public void setParentSiteTTL(String parentSiteTTL) {
   
  }
  
  public Locale getLocale() {
    return null;
  }
  
  private Locale getLocaleFromSystem() {
    return null;
  }
  
  protected void initProfile() {
    
  }
  
  public List<String> getRenderedRegionFragments() {
    return null;
  }
  
  public List<String> getRenderedComponentFragments() {
    return null;
  }
  
  public void setThemeFilePaths(List<String> renderedThemeLinks) {
   
  }
  
  public void setRegionLayoutFilePaths(List<String> renderedRegionLayoutFileLinks) {
   
  }
  
  public List<String> getRegionLayoutFilePaths() {
    return null;
  }
  
  public void setPageLayoutFilePaths(List<String> renderedPageLayoutLinks) {
    
  }
  
  public List<String> getThemeFilePaths() {
    return null;
  }
  
  public List<String> getPageLayoutFilePaths() {
    return null;
  }
  
  public void setRegion(Region region) {
    
  }
  
  public Region getRegion() {
    return null;
  }
  
  public List<RegionFragment> getRegionFragments() {
    return null;
  }
  
  public Map<String, RegionFragment> getRegionFragmentMap() {
    return null;
  }
  
  public void setRegionFragments(List<RegionFragment> regionFragments) {
    
  }
  
  public List<ComponentFragment> getComponentFragments() {
    return null;
  }
  
  public Map<String, ComponentFragment> getComponentFragmentMap() {
    return null;
  }
  
  public void setComponentFragments(List<ComponentFragment> componentFragments) {

  }
  
  public Map<String, VisibilityStatus> getVisibilityStatusMapForAllRegionsandComponents() {
    return null;
  }
  
  public List<String> getVisibleRegions() {
    return null;
  }
  
  public List<String> getVisibleComponentsInRegion() {
    return null;
  }
  
  public void setTemplateHPDDefaults(Template currentTemplate) throws ApplicationException {
  }
  
  public void setEnablePageLocalizedReferences(boolean enabled) {

  }
  
  public boolean isEnablePageLocalizedReferences() {
    return true;
  }
  
  public Map<Boolean, Set<ManagedObjectVCMRef>> getSegments() {
    return null;
  }
  
  public Set<ManagedObjectVCMRef> getIncludedSegments() {
    return null;
  }
  
  public Set<ManagedObjectVCMRef> getExcludedSegments() {
    return null;
  }
  
  public void setSegments(Map<Boolean, Set<ManagedObjectVCMRef>> evaluatedSegments) {
  }
  
  public String computeContextualSegmentationKey() {
    return null;
  }
  
  public String computeContextualChannelTargetingKey() {
    return null;
  }
  
  public boolean isIgnoreTargetingRules() {
    return true;
  }
  
  public void setIgnoreTargetingRules(boolean ignoreTargetingRules) {
   
  }
  
  public Set<ManagedObjectVCMRef> getAggregatePageTargetingRule() {
    return null;
  }
  
  public void setAggregatePageTargetingRule(Set<ManagedObjectVCMRef> aggregatePageTargetingRuleSet) {

  }
  
  public TargetingRule.Result getRuleResult(ManagedObject mo) {
    return null;
  }
  
  public PresentationFormat getEffectivePresentationFormat() throws ApplicationException {
    return null;
  }
  
  public Set<String> getHiddenCompIds() {
    return null;
  }
  
  public void setHiddenCompIds(Set<String> hiddenCompIds) {
    
  }
  
  public boolean addToHiddenComponentSet(String componentId) {
    return true;
  }
  
  public String getCurrentComponentRuleConditionId(String componentId) {
    return null;
  }
  
  public void setCurrentComponentRuleConditionId(String componentId, String conditionId) {
   
  }
  
  public String getCurrentComponentRuleDisplayViewId(String conditionId) {
    return null;
  }
  
  public void setCurrentComponentRuleDisplayViewId(String conditionId, String displayViewId) {
   
  }
  
  public boolean isValidVirtualProfile(String profileId) {
    return true;
  }
  
  public void refreshTargetingRules() throws ApplicationException {

  }
  
  private TargetingRuleEvalResult evaluateTargetingRule(ManagedObjectVCMRef ruleVCMId, Set<TargetingRuleEvalResult> targetingRuleEvalResultSet) throws ApplicationException {
    return null;
  }
  
  public Map<ManagedObjectVCMRef, String> getChannelTargetingRules() throws ApplicationException, ValidationException {
    return null;
  }
  
  public void refreshPortalSegments() throws ApplicationException {

  }
  
  public class VisibilityStatus implements Serializable {
    private boolean visible;
    
    private Map<String, Boolean> componentVisibilityMap;
    
    public VisibilityStatus() {}
    
    public VisibilityStatus(boolean isVisible, Map<String, Boolean> componentVisibilityMap) {
    }
    
    public boolean isVisible() {
        return true;
    }
    
    public Map<String, Boolean> getComponentVisibilityMap() {
        return null;
    }
    
    public void setVisible(boolean isVisible) {
      
    }
    
    public void setComponentVisibilityMap(Map<String, Boolean> componentVisibilityMap) {
      
    }
  }
  
  private static IProviderResolver providerResolver = null;
  
  public void setProviderResolver(IProviderResolver providerResolver) {
    
  }
  
  public IProviderResolver getProviderResolver() {
    return null;
  }
  
  public <T extends Provider<?>> T getProvider(String name, Class<T> providerClass) throws AuthorizationException, ValidationException, ApplicationException {
    return null;
  }
  
  public <T extends Provider<?>> List<T> getProviders(Class<T> providerClass) throws AuthorizationException, ValidationException, ApplicationException {
    return null;
  }
  
  private transient Map<String, Provider<?>> providers = new HashMap<String, Provider<?>>();
  
  private static final String PROVIDER_CONTEXT_CACHE_KEY = "";
  
  private Map<String, SessionOriented.Context> providerContexts;
  
  public Map<String, Provider<?>> getProviders() {
    return null;
  }
  
  public Map<String, SessionOriented.Context> getProviderContexts() {
    return null;
  }
  
  public String getActionKey() {
    return null;
  }
  
  public Map getActionData() {
    return null;
  }
  
  public void setActionData(Map actionData) {
  }
  
  public void populate() {
  }
  
  public boolean isRequestedOidNotFound() {
    return true;
  }
  
  public void setRequestedOidNotFound(boolean requestedOidNotFound) {
  }
  
  public abstract ManagedObject getPrimaryRequestedObject() throws ApplicationException;
  
  public abstract void setPrimaryRequestedObject(ManagedObject paramManagedObject) throws ApplicationException;
  
  public abstract Channel getRequestedChannel() throws ApplicationException;
  
  public abstract Site getCurrentSite() throws ApplicationException;
  
  public abstract void setRequestedChannel(Channel paramChannel);
  
  public abstract String getSegmentProfileId();
  
  public abstract void setSegmentProfileId(String paramString);
  
  public abstract void setTargetingRuleEvalResultSet(Set<TargetingRuleEvalResult> paramSet);
  
  public abstract Set<TargetingRuleEvalResult> getTargetingRuleEvalResultSet();
  
  public abstract void setHiddenChannelEvalResult(List<String> paramList);
  
  public abstract List<String> getHiddenChannelEvalResult();
  
  public abstract Template getTemplateForRequest() throws ApplicationException;
  
  public abstract String getVapMenuItemId();
  
  public abstract void setTemplateForRequest(Template paramTemplate);
  
  public abstract void update(RequestContext paramRequestContext);
  
  public abstract void setCurrentSite(Site paramSite) throws ApplicationException;
}
