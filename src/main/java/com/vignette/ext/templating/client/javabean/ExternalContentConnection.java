package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.api.beangen.ContentBeanMethod;
import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.AttributedObject;
import com.vignette.as.client.javabean.ContentInstance;
import com.vignette.as.client.javabean.IPagingList;
import com.vignette.as.client.javabean.ManagedObject;
import com.vignette.as.server.pluggable.service.content.ContentProvider;
import com.vignette.as.server.pluggable.service.content.ItemId;
import com.vignette.ext.templating.cache.CachingDetail;
import com.vignette.ext.templating.util.RequestContext;
import java.util.HashMap;
import java.util.List;

public class ExternalContentConnection extends ContentInstance {
    
  public static final String CONTENT_TYPE_NAME = "";
  
  public static final String RELATION_EXTERNAL_CONTENT_PRESENTATION = "";
  
  public static final String RELATION_EXTERNAL_CONTENT_ENRICHMENT = "";
  
  public static final String ATTR_NAME = "";
  
  public static final String ATTR_DESCRIPTION = "";
  
  public static final String ATTR_ORDER_AS_SIBLING = "";
  
  public static final String ATTR_PROVIDER_NAME = "";
  
  public static final String ATTR_ITEM_ID = "";
  
  public static final String ATTR_DEFAULT_TEMPLATE_ID = "";
  
  public static final String ATTR_DEFAULT_THEME_ID = "";
  
  public static final String ATTR_DEFAULT_LAYOUT_ID = "";
  
  public static final String ATTR_EXT_PRES_RELATION_EXTERNALTYPE = "";
  
  public static final String ATTR_EXT_PRES_RELATION_FORMATNAME = "";
  
  public static final String ATTR_EXT_PRES_RELATION_TEMPLATEID = "";
  
  public static final String ATTR_EXT_PRES_RELATION_TTL = "";
  
  public static final String ATTR_EXT_PRES_RELATION_STALEPAGEPOLICY = "";
  
  public static final String ATTR_EXT_PRES_RELATION_THEMEID = "";
  
  public static final String ATTR_EXT_PRES_RELATION_PAGELAYOUTID = "";
  
  public static final String ATTR_EXT_PRES_RELATION_SAVEDFEATURE = "";
  
  public static final String ATTR_EXT_ENRICHMENT_RELATION_EXTERNALTYPE = "";
  
  public static final String ATTR_EXT_ENRICHMENT_RELATION_DEFAULTCONTENTTYPEID = "";
  
  public static ContentTypeRef getContentTypeRef() {
    return null;
  }
  
  public void setName(String name) throws ApplicationException {

  }
  
  public void setDescription(String desc) throws ApplicationException {

  }
  
  public void setDefaultTemplateId(String defaultTemplateId) throws ApplicationException {
 
  }
  
  public void setDefaultThemeId(String defaultThemeId) throws ApplicationException {

  }
  
  public void setDefaultLayoutId(String defaultLayoutId) throws ApplicationException {

  }
  
  public void setProviderName(String providerName) throws ApplicationException {

  }
  
  public void setItemId(String itemId) throws ApplicationException {

  }
  
  public String getName() throws ApplicationException {
    return null;
  }
  
  public String getDescription() throws ApplicationException {
    return null;
  }
  
  public String getProviderName() throws ApplicationException {
    return null;
  }
  
  public String getItemId() throws ApplicationException {
    return null;
  }
  
  public String getDefaultTemplateId() throws ApplicationException {
    return null;
  }
  
  public String getDefaultThemeId() throws ApplicationException {
    return null;
  }
  
  public String getDefaultLayoutId() throws ApplicationException {
    return null;
  }
  
  public String getExternalObjectReference() throws ApplicationException {
    return null;
  }
  
  public ItemId getExternalItemId(RequestContext requestContext) {
    return null;
  }
  
  @ContentBeanMethod
  public ContentProvider.Item getExternalItem(RequestContext requestContext) {
    return null;
  }
  
  @ContentBeanMethod(convert = true)
  public ManagedObject getEnrichmentItem(RequestContext requestContext) {
    return null;
  }
  
  public static IPagingList findAll() throws ApplicationException, ValidationException {
    return null;
  }
  
  public ExternalContentPresentationEntry getExternalContentPresentationEntryByTypeAndFormat(String externalType, String format) throws ApplicationException {
    return null;
  }
  
  public String getTemplateByTypeAndFormat(String externalType, String format) throws ApplicationException {
    return null;
  }
  
  public String getThemeByTypeAndFormat(String externalType, String format) throws ApplicationException {
    return null;
  }
  
  public String getPageLayoutByTypeAndFormat(String externalType, String format) throws ApplicationException {
    return null;
  }
  
  public String getSavedFeaturesByTypeAndFormat(String externalType, String format) throws ApplicationException {
    return null;
  }
  
  public HashMap<String, FeatureBean> getEnabledActiveFeatures(String externalType, String format) throws ApplicationException {
    return null;
  }
  
  public String getDefaultCTByType(String externalType) throws ApplicationException {
    return null;
  }
  
  public List<ExternalContentPresentationEntry> getExternalContentPresentationEntries() throws ApplicationException {
    return null;
  }
  
  public ExternalContentPresentationEntry createExternalContentPresentationEntry(AttributedObject relation) throws ApplicationException {
    return null;
  }
  
  public ExternalContentEnrichmentEntry createExternalContentEnrichmentEntry(AttributedObject relation) throws ApplicationException {
    return null;
  }
  
  public void setExternalContentPresentationEntries(List<ExternalContentPresentationEntry> ecPresentationEntries) throws ValidationException, ApplicationException {

  }
  
  public void addExternalContentPresentationEntries(List<ExternalContentPresentationEntry> ecPresentationEntries) throws ValidationException, ApplicationException {

  }
  
   public static class ExternalContentPresentationEntry {
    String externalType = null;
    
    String format = null;
    
    String templateId = null;
    
    String themeId = null;
    
    String pageLayoutId = null;
    
    String ttl = null;
    
    String stalePagePolicy = null;
    
    String savedFeatures = null;
    
    public ExternalContentPresentationEntry(String externalType, String format, String templateId) {

    }
    
    public ExternalContentPresentationEntry(String externalType, String format, String templateId, String ttl, String stalePagePolicy, String themeId, String pageLayoutId, String savedFeatures) {

    }
    
    public String getExternalType() {
        return null;
    }
    
    public void setExternalType(String externalType) {

    }
    
    public String getFormat() {
        return null;
    }
    
    public void setFormat(String format) {

    }
    
    public String getTemplateId() {
        return null;
    }
    
    public void setTemplateId(String templateId) {

    }
    
    public String getThemeId() {
        return null;
    }
    
    public void setThemeId(String themeId) {

    }
    
    public String getPageLayoutId() {
        return null;
    }
    
    public void setPageLayoutId(String pageLayoutId) {

    }
    
    public String getTtl() {
        return null;
    }
    
    public void setTtl(String ttl) {

    }
    
    public String getStalePagePolicy() {
        return null;
    }
    
    public void setStalePagePolicy(String stalePagePolicy) {

    }
    
    public String getSavedFeatures() {
        return null;
    }
    
    public void setSavedFeatures(String savedFeatures) {

    }
    
    public CachingDetail getCachingDetail() throws ApplicationException {
        return null;
    }
    
    public void setCachingDetail(CachingDetail cachingDetail) {

    }
  }
  
  public static class ExternalContentEnrichmentEntry {
    String externalType = null;
    
    String defaultContentType = null;
    
    public ExternalContentEnrichmentEntry(String externalType, String defaultContentTypeId) {

    }
    
    public String getExternalType() {
        return null;
    }
    
    public void setExternalType(String externalType) {
      
    }
    
    public String getDefaultContentType() {
        return null;
    }
    
    public void setDefaultContentType(String defaultContentType) {

    }
  }
  
  public <T extends ContentProvider> T getProvider(RequestContext requestContext, Class<T> providerClass) throws ApplicationException {
    return null;
  }
  
  public List<ExternalContentEnrichmentEntry> getExternalContentEnrichmentEntries() throws ApplicationException {
    return null;
  }
  
  public ExternalContentEnrichmentEntry getExternalContentEnrichmentEntryByType(String externalType) throws ApplicationException {
    return null;
  }
  
  public void setExternalContentEnrichmentEntries(List<ExternalContentEnrichmentEntry> entries) throws ApplicationException {
    
  }
  
  public void commit() throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
}
