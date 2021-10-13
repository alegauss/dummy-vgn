package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.common.ref.ChannelRef;
import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.IPagingList;
import com.vignette.as.client.javabean.Site;
import com.vignette.as.server.event.AsPostPersistenceEvent;
import com.vignette.as.server.event.AsPrePersistenceEvent;
import java.rmi.RemoteException;
import java.util.List;

public class ExternalItemPage extends AbstractItemPage {

  
  public static final String ENRICHMENT_ITEM_ROOT_CHANNEL_NAME = "";
  
  public static final String CONTENT_TYPE_NAME = "";
  
  public static final String ATTR_ID = "";
  
  public static final String ATTR_EXTERNAL_ITEM_ID = "";
  
  public static final String ATTR_EXTERNAL_CONTENT_CONNECTION_ID = "";
  
  public static final String ATTR_PAGE_REGION_ID = "";
  
  public static ChannelRef getEnrichmentItemsChannel(Site site, String providerName) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  
  public String getContentTypeName() {
    return null;
  }
  
  public String getItemIdAttribute() {
    return null;
  }
  
  public String getIdAttribute() {
    return null;
  }
  
  public ObjectTypeRef getObjectTypeRef() throws ApplicationException {
    return null;
  }
  
  public Template getTemplate(Site site, String format) throws ValidationException, ApplicationException {
    return null;
   
  }
  
  public static ContentTypeRef getContentTypeRef() {
    return null;
  }
  
  public void setExternalContentConnectionId(String eccId) throws ApplicationException {
    
  }
  
  public String getExternalContentConnectionId() throws ApplicationException {
    return null;
  }
  
  public static ExternalItemPage findById(String id) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByIds(String[] ids) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByItemId(String externalItemId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findBySiteId(String siteAppObjId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static ExternalItemPage findBySiteAndExternalItemId(String siteAppObjId, String externalItemId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public synchronized String getName() throws ApplicationException {
    return null;
  }
  
  public static void deleteItemPageBySiteAndContentInstanceId(String siteAppObjId, String externalItemId) throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  public static ExternalItemPage create(String itemId, String siteId, String templateId, String themeId, String pageLayoutId, String eccId) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  public static ExternalItemPage createInstance(String externalItemId, String siteId, String defaultFormatName, String templateId, String themeId, String pageLayoutId, String externaContentConnectionId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static ExternalItemPage create(String externalItemId, String siteId, String templateId, String eccId) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  public static void saveItemPage(List<FormatAssociation> pageFormatAssociationsList, String itemId, String siteVCMId, String title, String keywords, String description, String externaContentConnectionId) throws ApplicationException, ValidationException, RemoteException, AuthorizationException {
    
  }
  
  public static ExternalItemPage getExternalItemPage(String siteVCMId, String itemId, String eccId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static ExternalItemPage findExternalItemPage(String siteId, String itemId, String eccId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findAllPagesByTemplateId(String templateId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findReadOnlyObjectsByTemplate(String templateId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByRegion(String regionVCMID) throws ValidationException, ApplicationException {
    return null;
  }
  
  public static IPagingList findByTheme(String themeId) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByPageLayout(String pageLayoutId) throws ApplicationException, ValidationException {
    return null;
  }
  
  public void handlePreCreate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public void handlePreUpdate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
  
  }
  
  public void handlePostUpdate(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
  
  }
  
  public static void handleSitePreDelete(AsPrePersistenceEvent ppe) throws ValidationException, AuthorizationException, ApplicationException {
   
  }
}
