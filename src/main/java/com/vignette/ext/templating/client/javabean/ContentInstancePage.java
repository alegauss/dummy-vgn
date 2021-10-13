package com.vignette.ext.templating.client.javabean;

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

public class ContentInstancePage extends AbstractItemPage {
  
  public static final String ATTR_CIPAGE_ID = "";
  
  public static final String ATTR_CONTENT_INSTANCE_ID = "";
  
  public static final String ATTR_PAGE_REGION_ID = "";
  
  public static final String CONTENT_TYPE_NAME = "";
  
  
  public String getContentTypeName() {
    return null;
  }
  
  public String getItemIdAttribute() {
    return null;
  }
  
  public String getIdAttribute() {
    return null;
  }
  
  public String getContentInstanceId() throws ApplicationException {
    return null;
  }
  
  public Template getTemplate(Site site, String format) throws ValidationException, ApplicationException {
    return null;
  }
  
  public static ContentInstancePage findById(String id) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByIds(String[] ids) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByContentInstanceId(String contentInstanceVCMID) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findBySiteId(String siteAppObjId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static ContentInstancePage findBySiteAndContentInstanceId(String siteAppObjId, String contentInstanceVCMID) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByRegion(String regionVCMID) throws ValidationException, ApplicationException {
    return null;
  }
  
  public static IPagingList findAllPagesByTemplateId(String templateId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findAllPagesBySiteAndTemplateId(String siteId, String templateId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static ContentTypeRef getContentTypeRef() throws ApplicationException, ValidationException {
    return null;
  }
  
  public static synchronized String getDefaultProjectPath() throws ApplicationException, ValidationException {
    return null;
  }
  
  public ObjectTypeRef getObjectTypeRef() throws ApplicationException {
    return null;
  }
  
  public static ContentInstancePage create(String contentInstanceVCMID, String siteId, String templateId, String themeId, String pageLayoutId) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  public static ContentInstancePage createInstance(String contentInstanceVCMID, String siteId, String defaultFormatName, String templateId, String themeId, String pageLayoutId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static ContentInstancePage create(String contentInstanceVCMID, String siteId, String templateId) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  public static void saveItemPage(List<FormatAssociation> pageFormatAssociationsList, String contentInstanceId, String siteVCMId, String title, String keywords, String description) throws ApplicationException, ValidationException, RemoteException, AuthorizationException {
    
  }
    
  public synchronized String getName() throws ApplicationException {
    return null;
  }
  
  public void handlePreCreate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public void handlePreUpdate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public void handlePostUpdate(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public static void handleContentInstancePreDelete(AsPrePersistenceEvent event) throws ValidationException, AuthorizationException, ApplicationException {
   
  }
  
  public static void handleContentInstancePreUpdate(AsPrePersistenceEvent event) throws ValidationException, ApplicationException, AuthorizationException {
  
  }
    
  public static IPagingList findByTemplateId(String templateId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findReadOnlyObjectsByTemplate(String templateId) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByTheme(String themeId) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByPageLayout(String pageLayoutId) throws ApplicationException, ValidationException {
    return null;
  }
}
