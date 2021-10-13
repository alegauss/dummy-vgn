package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.common.SiteFormatAssocData;
import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.AttributedObject;
import com.vignette.as.client.javabean.IPagingList;
import com.vignette.as.client.javabean.Site;
import com.vignette.as.server.event.AsPostPersistenceEvent;
import com.vignette.ext.templating.cache.CachingDetail;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class AbstractItemPage extends ContentComponentContainer {
  
  public static final String ATTR_SITE_ID = "";
  
  public static final String ATTR_META_TITLE = "";
  
  public static final String ATTR_META_DESCRIPTION = "";
  
  public static final String ATTR_META_KEYWORDS = "";
  
  public static final String RELATION_PAGE_FORMATS = "";
  
  public static final String ATTR_FORMAT_PARENT_ID = "";
  
  public static final String ATTR_FORMAT_NAME = "";
  
  public static final String ATTR_FORMAT_TEMPLATE_ID = "";
  
  public static final String ATTR_TTL = "";
  
  public static final String ATTR_STALE_PAGE_POLICY = "";
  
  public static final String ATTR_FORMAT_THEME_ID = "";
  
  public static final String ATTR_FORMAT_PAGE_LAYOUT = "";
  
  public static final String RELATION_PAGE_REGIONS = "";
  
  public static final String ATTR_REGIONS_SEQUENCE_ID = "";
  
  public static final String ATTR_REGION_PARENT_ID = "";
  
  public static final String ATTR_REGION_ID = "";
  
  public static String ATTR_SAVED_FEATURE = "";
  
  protected Set disassociatedTemplates = null;
  
  protected List removedRegions = null;
  
  protected String displayName = null;
  
  protected static String defaultProjectPath = null;
  
  protected HashSet listOfDisassociatedThemes = null;
  
  protected void setSiteId(String siteVCMID) throws ApplicationException {
  }
  
  public String getSiteId() throws ApplicationException {
    return null;
  }
  
  public abstract String getContentTypeName();
  
  public abstract String getItemIdAttribute();
  
  public String getItemId() throws ApplicationException {
    return null;
  }
  
  public void setItemId(String itemId) throws ApplicationException {
  
  }
  
  public abstract String getIdAttribute();
  
  public String getId() throws ApplicationException {
    return null;
  }
  
  public HashMap<String, FeatureBean> getPageFeaturesForFormat(String formatName) throws ApplicationException {
    return null;
  }
  
  public HashMap<String, FeatureBean> getEnabledFeatures(String formatName) throws ApplicationException {
    return null;
  }
  
  public HashMap<String, FeatureBean> getEnabledActiveFeatures(String formatName) throws ApplicationException {
    return null;
  }
  
  protected void setMetaTitle(String metatitle) throws ApplicationException {
    
  }
  
  public String getMetaTitle() throws ApplicationException {
    return null;
  }
  
  protected void setMetaDescription(String metadescription) throws ApplicationException {
  }
  
  public String getMetaDescription() throws ApplicationException {
    return null;
  }
  
  protected void setMetaKeywords(String metakeywords) throws ApplicationException {
    
  }
  
  public String getMetaKeywords() throws ApplicationException {
    return null;
  }
  
  public static String getPageFormatsRelationName() {
    return null;
  }
  
  public static String getRegionContentComponentsRelationName() {
    return null;
  }
  
  public Site getParentSite() throws ApplicationException {
    return null;
  }
  
  public void addRegionAssociations(Region region) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  protected String getContentComponentsRelationName() {
    return null;
  }
  
  public HashMap getContentComponents() throws ApplicationException {
    return null;
  }
  
  public Map getAllRegionComponents() throws ApplicationException {
    return null;
  }
  
  public HashMap<String, List> getAllRegionContentComponents() throws ApplicationException {
    return null;
  }
  
  public Map<String, List<ManagedObjectVCMRef>> getAllRegionContentComponents(boolean includeTranslations) throws ApplicationException {
    return null;
  }
  
  public List getRegions() throws ApplicationException {
    return null;
  }
  
  public List getRegionIds() throws ApplicationException {
    return null;
  }
  
  protected static IPagingList findBySiteId(String siteAppObjId, ContentTypeRef contentTypeRef) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByRegion(String regionVCMID, ContentTypeRef contentTypeRef) throws ValidationException, ApplicationException {
    return null;
  }
  
  protected static IPagingList findAllPagesByTemplateId(String templateId, ContentTypeRef contentTypeRef) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  protected static IPagingList findAllPagesBySiteAndTemplateId(String siteId, String templateId, ContentTypeRef contentTypeRef) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  protected static synchronized String getDefaultProjectPath(ContentTypeRef contentTypeRef) throws ApplicationException, ValidationException {
    return null;
  }
  
  public abstract ObjectTypeRef getObjectTypeRef() throws ApplicationException;
  
  public static SiteFormatAssocData getDefaultFormatForSite(String siteId) throws ApplicationException, ValidationException, RemoteException {
    return null;
  }
  
  public void applyForFormat(String newFormatName, String templateId, String themeId, String pageLayoutId) throws ApplicationException {
  
  }
  
  public void setTemplateForFormat(String formatName, String templateId) throws ApplicationException {
  
  }
  
  public void setPageFeaturesForFormat(String newFormatName, String pageFeatures) throws ApplicationException {
  
  }
  
  public void setThemeForFormat(String newFormatName, String themeId) throws ApplicationException {
  
  }
  
  public void setPageLayoutForFormat(String newFormatName, String pageLayoutId) throws ApplicationException {
    }
  
  public boolean removeFormat(String formatName, String templateId) throws ApplicationException {
    return true;
  }
  
  public Template getTemplateForFormat(String formatName) throws ApplicationException {
    return null;
  }
  
  public Template getTemplateForFormat(String formatName, boolean considerDefaultTemplate) throws ApplicationException {
    return null;
  }
  
  public String getTemplateIdForFormat(String formatName, boolean considerDefaultTemplate) throws ApplicationException {
    return null;
  }
  
  public Format getFormat(String formatName, boolean considerDefaultTemplate) throws ApplicationException {
    return null;
  }
  
  public List getAllFormats() throws ApplicationException {
    return null;
  }
  
  protected Map getTemplatesForFormats() throws ApplicationException {
    return null;
  }
  
  protected Map getThemesForFormats() throws ApplicationException {
    return null;
  }
  
  protected Map getPageLayoutsForFormats() throws ApplicationException {
    return null;
  }
  
  protected SiteAssociations getRequiredAssociations() throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public void handlePostCreate(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  protected void extractRemovedRegionInfo(AbstractItemPage dbContentInstancePage) throws ApplicationException {

  }
  
  protected void addRemovedRegion(Region dbRegion) {
    
  }
  
  protected void findDeletedAssociations(AbstractItemPage dbContentInstancePage) throws ApplicationException, ValidationException, AuthorizationException {
    
  }
  
  protected List getRegionRefs() throws ApplicationException {
    return null;
  }
  
  protected AttributedObject getPageFormatRelation(String formatName) throws ApplicationException {
    return null;
  }
  
  public void setCachingDetail(String formatName, CachingDetail cachingDetail) throws ApplicationException {
   
  }
  
  public CachingDetail getCachingDetail(String formatName) throws ApplicationException {
    return null;
  }
  protected void setRegion(Region region, ContentTypeRef contentTypeRef) throws ValidationException, ApplicationException {
   
  }
  
  protected static IPagingList findByIdsAndType(ContentTypeRef contentTypeRef, String idAttrName, String[] ids) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  protected static IPagingList findByTemplateId(String templateId, ContentTypeRef contentTypeRef) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  protected static IPagingList findReadOnlyObjectsByTemplate(String templateId, ContentTypeRef contentTypeRef) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  protected static IPagingList findByTheme(String themeId, ContentTypeRef contentTypeRef) throws ApplicationException, ValidationException {
    return null;
  }
  
  protected static IPagingList findByPageLayout(String pageLayoutId, ContentTypeRef contentTypeRef) throws ApplicationException, ValidationException {
    return null;
  }
  
  protected boolean isInternal() {
    return false;
  }
  
  public Theme getThemeForFormat(String formatName) throws ApplicationException {
    return null;
  }
  
  public Theme getThemeForFormat(String formatName, boolean considerDefaultFormat) throws ApplicationException {
    return null;
  }
  
  public String getThemeIdForFormat(String formatName, boolean considerDefaultFormat) throws ApplicationException {
    return null;
  }
  
  public List getAllThemes(boolean getFromCache) throws ApplicationException {
    return null;
  }
  
  public List getAllThemes() throws ApplicationException {
    return null;
  }
  
  public PageLayout getPageLayoutForFormat(String formatName) throws ApplicationException {
    return null;
  }
  
  public PageLayout getPageLayoutForFormat(String formatName, boolean considerDefaultFormat) throws ApplicationException {
    return null;
  }
  
  public String getPageLayoutIdForFormat(String formatName, boolean considerDefaultFormat) throws ApplicationException {
    return null;
  }
  
  public List getAllPageLayouts() throws ApplicationException {
    return null;
  }
  
  public List<FormatAssociation> listFormatAssociations() throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public abstract Template getTemplate(Site paramSite, String paramString) throws ValidationException, ApplicationException;
  
  public Map<String, RegionType> getAllConfiguredRegionTypes(Site site, String format) throws ValidationException, ApplicationException {
    return null;
  }
  
  public RegionType getRegionType(String format, String regionName) throws ApplicationException, ValidationException {
    return null;
  }
  
  public RegionType getRegionType(Site site, String format, String regionName) throws ApplicationException, ValidationException {
    return null;
  }
  
  protected static IPagingList findByItemIdAndType(ContentTypeRef contentTypeRef, String itemidAttribute, String itemIdVal) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  protected static AbstractItemPage findBySiteAndItemIdByType(ContentTypeRef contentTypeRef, String itemIdAttributeName, String siteAppObjId, String itemId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  protected static AbstractItemPage createByType(ContentTypeRef contentTypeRef, String itemId, String siteId, String templateId, String themeId, String pageLayoutId, boolean doCommit) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  protected static AbstractItemPage createInstanceByType(ContentTypeRef contentTypeRef, String itemId, String siteId, String defaultFormatName, String templateId, String themeId, String pageLayoutId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
}
