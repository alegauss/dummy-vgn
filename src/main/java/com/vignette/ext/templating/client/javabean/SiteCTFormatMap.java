package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.as.client.exception.ASException;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.AttributedObject;
import com.vignette.as.client.javabean.IPagingList;
import com.vignette.as.client.javabean.Site;
import com.vignette.as.server.event.AsPostPersistenceEvent;
import com.vignette.as.server.event.AsPrePersistenceEvent;
import com.vignette.ext.templating.cache.CachingDetail;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

public class SiteCTFormatMap extends VgnExtTemplatingBusinessObject {
  
  static final long serialVersionUID = 1L;
  
  public static final String CONTENT_TYPE_NAME = "";
  
  public static final String ATTR_ID = "";
  
  public static final String ATTR_SITE_ID = "";
  
  public static final String ATTR_CONTENT_TYPE_ID = "";
  
  public static final String ATTR_FORMAT_PARENT_ID = "";
  
  public static final String ATTR_FORMAT_NAME = "";
  
  public static final String ATTR_FORMAT_TEMPLATE_ID = "";
  
  public static final String RELATION_TOP = "";
  
  public static final String RELATION_FORMATS = "";
  
  public static final String TEMPORARY_SITE_CONTENT_TYPE_ASSOC_ID = "";
  
  public static final String ATTR_TTL = "";
  
  public static final String ATTR_STALE_PAGE_POLICY = "";
  
  public static final String ATTR_TIME_ZONE = "";
  
  public static final String ATTR_LOCALE = "";
  
  
  public static ContentTypeRef getContentTypeRef() throws ApplicationException, ValidationException {
    return null;
  }
  
  public static synchronized String getDefaultProjectPath() throws ApplicationException, ValidationException {
    return null;
  }
  
  public static SiteCTFormatMap findById(String id) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByIds(String[] ids) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findBySiteId(String siteId) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static SiteCTFormatMap findSiteCTFormatMapBySiteCT(String siteId, String contentTypeId) throws ApplicationException {
    return null;
  }
  
  public static Template findTemplateBySiteCTFormat(String siteId, String contentTypeId, String formatName) throws ApplicationException {
    return null;
  }
  
  public static String findTemplateIdBySiteCTFormat(String siteId, String contentTypeId, String formatName) throws ApplicationException {
    return null;
  }
  
  public String getTemplateIdForFormat(String formatName) throws ApplicationException {
    return null;
  }
  
  public String getTemplateIdForSpecifiedFormat(String formatName) throws ApplicationException {
    return null;
  }
   
  public Format getFormat(String formatName) throws ApplicationException {
    return null;
  }
  
  public static IPagingList findByTemplateId(String templateId) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findReadOnlyObjectsByTemplate(String templateId) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByTemplateIdWithSite(String templateId) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findAll() throws ApplicationException, ValidationException {
    return null;
  }
  
  public static SiteCTFormatMap create(String siteCTAssocId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static SiteCTFormatMap create(String siteCTAssocId, String contentTypeId, String siteId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static void create(String siteId, Map<String, List<AttributedObject>> ctIdAndAttrDataMap) throws ASException, RemoteException {
   
  }
  
  public void handlePreCreate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
  
  }
  
  public void handlePreUpdate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public void handlePostDelete(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
  
  }
  public void handlePostCreate(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public void handlePostUpdate(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public static void handleExtTemplatingChannelPreDelete(AsPrePersistenceEvent ppe) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public static void handleSiteContentTypePostUpdate(AsPostPersistenceEvent ppe) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public void setCachingDetail(String formatName, CachingDetail cachingDetail) throws ApplicationException {
   
  }
  
  public CachingDetail getCachingDetail(String formatName) throws ApplicationException {
    return null;
  }
  
  public String getId() throws ApplicationException {
    return null;
  }
  
  public String getSiteId() throws ApplicationException {
    return null;
  }
  
  public String getContentTypeId() throws ApplicationException {
    return null;
  }
  
  public List getFormatsAsList() throws ApplicationException {
    return null;
  }
  
  public Format[] getFormats() throws ApplicationException {
    return null;
  }
  
  public synchronized String getName() throws ApplicationException {
    return null;
  }
  
  public synchronized Site getParentSite() throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  protected SiteAssociations getRequiredAssociations() throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
}
