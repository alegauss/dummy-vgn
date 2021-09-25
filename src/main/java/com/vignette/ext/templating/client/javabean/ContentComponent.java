package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.common.AppObjectId;
import com.vignette.as.client.common.ref.AsLocaleRef;
import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.ContentType;
import com.vignette.as.client.javabean.ManagedObject;
import com.vignette.as.client.javabean.StaticFile;
import com.vignette.as.server.event.AsPostPersistenceEvent;
import com.vignette.as.server.event.AsPrePersistenceEvent;
import com.vignette.ext.templating.cache.CachingDetail;
import com.vignette.ext.templating.cache.rules.IRuleSet;
import com.vignette.ext.templating.client.javabean.displayview.DisplayView;
import com.vignette.ext.templating.util.RequestContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContentComponent extends VgnExtTemplatingObject implements IDisplayViewScriptEnabled, IDisplayParameterEnabledComponent {
 
  public static final String COMPONENT_KEY_WIDGET_NAME = "";
  
  public static final String COMPONENT_ID_ATTRIB = "";
  
  public static final String COMPONENT_NAME_ATTRIB = "";
  
  public static final String COMPONENT_TITLE_ATTRIB = "";
  
  public static final String COMPONENT_HEADER_ATTRIB = "";
  
  public static final String COMPONENT_FOOTER_ATTRIB = "";
  
  public static final String COMPONENT_DISPLAYVIEW_ID_ATTRIB = "";
  
  public static final String COMPONENT_DESCRIPTION_ATTRIB = "";
  
  public static final String COMPONENT_RENDERING_TYPE_ATTRIB = "";
  
  public static final String VGNEXTIMAGE_IMAGE_ATTRIB = "";
  
  public static final String VGNEXTIMAGE_MEDIA_ITEM_ATTRIB = "";
  
  public static final String VGNEXTCONTENTSELECTCOMPONENT_CONTENT_ITEM_ATTRIB = "";
  
  public static final String VGNEXTCONTENTMULTICOMPONENT_REL_LINKED_ASSETS = "";
  
  public static final String VGNEXTCONTENTMULTICOMPONENT_LINKED_ASSETS_CHILD_ID = "";
  
  public static final String VGNEXTCONTENTMULTICOMPONENT_LINKED_ASSETS_LINKED_ID = "";
  
  public static final String VGNEXTCONTENTMULTICOMPONENT_LINKED_ASSETS_INDEX = "";
  
  public static final String COMPONENT_THUMBNAIL_ATTRIB = "";
  
  public static final String COMPONENT_CHANNELNAV = "";
  
  public static final String COMPONENT_TEXTBLOCK = "";
  
  public static final String COMPONENT_IMAGE = "";
  
  public static final String COMPONENT_QUERY = "";
  
  public static final String COMPONENT_SITECTFORMATMAP = "";
  
  public static final String COMPONENT_CONTENTSELECTCOMPONENT = "";
  
  public static final String COMPONENT_CONTENTMULTISELECTCOMPONENT = "";
  
  public static final String COMPONENT_SEARCH_TOOLBAR = "";
  
  public static final String COMPONENT_SEARCH_RESULTS = "";
  
  public static final String COMPONENT_COMMUNITY_APPLICATION = "";
  
  public static final String COMPONENT_COMMUNITY_SERVICES = "";
  
  public static final String COMPONENT_TEASER = "";
  
  public static final String COMPONENT_CAMPAIGNCOMPONENT = "";
  
  public static final String COMPONENT_TARGETEDCONTENT = "";
  
  public static final String COMPONENT_FACETED_SEARCH = "";
  
  public static final String COMPONENT_SHOPPING_CART = "";
  
  public static final String COMPONENT_EXTERNAL_CONTENT_LIST = "";
  
  public static final String COMPONENT_SIGN_IN = "";
  
  public static final String COMPONENT_NAME_LABEL = "";
  
  public static final String COMPONENT_DESCRIPTION_LABEL = "";
  
  public static final String COMPONENT_TITLE_LABEL = "";
  
  public static final String COMPONENT_HEADER_LABEL = "";
  
  public static final String COMPONENT_FOOTER_LABEL = "";
  
  public static final String DEFAULT_COMPONENT_ICON_PATH = "";
  
  public static final String DEFAULT_COMPONENT_SMALL_ICON_PATH = "";
  
  public static final String DEFAULT_COMPONENT_LARGE_ICON_PATH = "";
  
  private static final String ATTR_TTL = "";
  
  private static AppObjectId appObjID = null;
  
  public static final ArrayList CONTENT_COMP_TYPES_LIST = null;
  
  public static final ArrayList CANDIDATE_TYPES_LIST = null;
  
  public static final String TRANSLATION_GROUP_RULE = "";
  
  
  protected static transient String defaultTTL = null;
  
  private static transient ThreadLocal defaultTtlObj = null;
  
  protected static transient String parentSiteTTL = null;
  
  private static transient ThreadLocal parentTtlObj = null;
  
  public static final String ATTRIBUTE_TTL = "";
  
  public static final String SYSTEMCTD_ATTRIBUTE_TTL = "";
  
  public static final String GENCTXDEPS = "";
  
  public void setTtlValues(RequestContext requestContext, String regionTTL) throws ApplicationException {
  }
  
  public void resetTtlValues() {
  }
  
  public void setDefaultTTL(String defaultTTL) {
  }
  
  public void setDefaultRenderingType() throws ApplicationException {
  }
  
  public void setParentSiteTTL(String parentSiteTTL) {
  }
  
  public synchronized String getName() throws ApplicationException {
    return null;
  }
  
  public void removeComponentIfNotUsedOrPublished() throws ApplicationException, ValidationException, AuthorizationException {
  }
  
  public void handlePostUpdate(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  public void handlePreCreate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public void handlePreUpdate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public void handlePreDelete(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public String toXML(RequestContext requestContext) throws ApplicationException {
    return null;
  }
  
  protected String removeXMLDeclaration(String xml) {
   return null;
  }
  
  protected String wrapContentItemToXML(ManagedObject mo) throws ApplicationException {
  return null;
  }
  
  public List getContentTypeList() throws ApplicationException {
    return null;
  }
  
  private static Boolean m_inMgmtCDS = null;
  
  public HashMap getInitialValuesMap(String contentTypeName) throws ApplicationException {
    return null;
  }
  
  public String getDisplayViewUri() throws ApplicationException {
   return null;
  }
  
  public Map getDisplayViewParams() throws ApplicationException {
 return null;
  }
  
  public StaticFile getScript() throws ApplicationException {
return null;
  }
  
  public String getDisplayViewPreviewIcon() throws ApplicationException {
 return null;
  }
  
  public int getDisplayViewType() throws ApplicationException {
    return 1;
  }
  
  public DisplayView getDisplayView() throws ApplicationException {
    return null;
  }
  
  public String getId() throws ApplicationException {
    return null;
  }
  
  public String getTitle() throws ApplicationException {
    return null;
  }
  
  public String getHeader() throws ApplicationException {
    return null;
  }
  
  public String getFooter() throws ApplicationException {
    return null;
  }
  
  public String getDisplayViewId() throws ApplicationException {
    return null;
  }
  
  public String getDescription() throws ApplicationException {
    return null;
  }
  
  public int getRenderingType() throws ApplicationException {
    return 0;
  }
  
  public String getThumbnail() throws ApplicationException {
    return null;
  }
  
  public String getComponentName() throws ApplicationException {
    return null;
  }
  
  protected static synchronized boolean inMgmtCDS() {
    return true;
  }
  
  protected boolean generateContextualDependencies(RequestContext rc) {
    return true;
  }
  
  public void registerContextualDependencies(RequestContext rc) throws ApplicationException {
  }
  
  public static List generateMLCContextualDependencies(ManagedObject mo, AsLocaleRef localeRef) throws ApplicationException {
    return null;
  }
  
  public static List generateComponentMLCContextualDependencies(ContentComponent component, AsLocaleRef localeRef) throws ApplicationException {
    return null;
  }
  
  public static List generateMOMLCContextualDependencies(ManagedObject mo, AsLocaleRef localeRef) throws ApplicationException {
    return null;
  }
  
  protected static void addViewDependencies(IRuleSet ruleSet, String eventCategory, String popSetName, String ownerId, ArrayList candidateTypeList, ManagedObject mo, List<String> result) throws ApplicationException {
  }
  
  protected String getRulesetName() throws ApplicationException {
    return null;
  }
  
  public Collection getCachingSensitivities() throws ApplicationException {
    return null;
  }
  
  public Collection getHPDSensitivities() throws ApplicationException {
    return null;
  }
  
  public boolean isHPDCacheable(RequestContext rc) throws ApplicationException {
    return true;
  }
  
  public List getSensitiveCookies(RequestContext requestContext) throws ApplicationException {
    return null;
  }
  
  public long getTTL(String defaultTTL, String parentSiteTTL) throws ApplicationException {
    return 0l;
  }
  
  public long getTTL() throws ApplicationException {
  return 0l;
  }
  
  public CachingDetail getCachingDetail() throws ApplicationException {
    return null;
  }
  
  public void setCachingDetail(CachingDetail cachingDetail) throws ApplicationException {
  }
  
  public void setAttributeTTL(String ttl) throws ApplicationException {
  }
  
  protected long getComponentDefaultTTL() {
    return 0l;
  }
  
  public boolean suppressChannelContextualDependencies() {
    return false;
  }
  
  public String getAttributeTTL() throws ApplicationException {
    return null;
  }
  
  public static Map getAllContentComponentTypes() throws ApplicationException {
    return null;
  }
  
  public static List<ContentType> getAllContentComponentTypesList() throws ApplicationException {
    return null;
  }
  
  public static List<String> getAllContentComponentTypeNames() throws ApplicationException {
    return null;
  }
  
  public List getContainers() throws ValidationException, ApplicationException, AuthorizationException {
    return null;
  }
  
  public Collection<String> getRequiredRequestParameterNames(RequestContext rc) throws ApplicationException {
    return null;
  }
  
  protected void addDisplayViewRequiredRequestParameterNames(Collection<String> compRequiredRequestParameterNames) throws ApplicationException {
  }
  
  public boolean isOrphanComponent() throws ValidationException, ApplicationException, AuthorizationException {
    return true;
  }
  
  public boolean isComponentSharedByMultipleContainers() throws ValidationException, ApplicationException, AuthorizationException {
    return true;
  }
  
  public static synchronized ContentTypeRef getContentTypeRef(String contentTypeName) throws ApplicationException, ValidationException {
    return null;
  }
  
  public void commit() throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  public boolean isTranslationRequired(RequestContext requestContext) throws Exception {
   return true;
  }
  
    
  public Map getComponentUrls(RequestContext rc) throws Exception {
    return null;
  }
  
 
  public static String getBaseActionUri(RequestContext rc) {
    return null;
  }
  
  public String buildComponentUrl(RequestContext rc) throws Exception {
    return null;
  }
  
  public String buildComponentUrl(RequestContext rc, String baseUri) throws Exception {
    return null;
  }
  
  protected Map<String, Object> getComponentRequiredParameters(RequestContext rc) throws Exception {
    return null;
  }
}
