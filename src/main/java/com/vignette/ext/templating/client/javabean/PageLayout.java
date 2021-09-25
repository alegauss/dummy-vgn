package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.common.ref.ContentTypeRef;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.IPagingList;

import com.vignette.as.client.javabean.StaticFile;
import com.vignette.as.server.event.AsPostPersistenceEvent;
import com.vignette.as.server.event.AsPrePersistenceEvent;
import com.vignette.ext.templating.util.RequestContext;
import java.util.Comparator;
import java.util.List;
import java.util.Map;


public class PageLayout extends VgnExtTemplatingObject {
  
  public static final String CONTENT_TYPE_NAME = "";
  
  public static final String LAYOUT_ID_ATTRIB = "";
  
  public static final String LAYOUT_NAME_ATTRIB = "";
  
  public static final String LAYOUT_THUMBNAIL_ATTRIB = "";
  
  public static final String LAYOUT_PATH_ATTRIB = "";
  
  public static final String LAYOUT_SCRIPT_ATTRIB = "";
  
  public static final String LAYOUT_DESCRIPTION_ATTRIB = "";
  
  public static final String LAYOUT_PARAMETERS_ATTRIB = "";
  
  public static final String DEFAULT_PAGE_LAYOUT_NAME = "";
  
  public static final String PAGELAYOUT_PAGELAYOUTID_ATTRIB = "";
  
  public static final String RELATION_PAGELAYOUT_FILES = "";
  
  public static final String PAGELAYOUT_STATICFILEID_ATTRIB = "";
  
  public static final String PAGELAYOUT_SEQID_ATTRIB = "";
  
  public static final String PAGELAYOUT_FRIENDLYID_ATTRIB = "";
  
  public static final String PAGELAYOUT_FILE_PATH_ATTRIB = "";
   
  public PageLayout() {
   
  }
  
  public String getId() throws ApplicationException {
   return null;
  }
  
  public String getPath() throws ApplicationException {
    return null;
  }
  
  public StaticFile getScript() throws ApplicationException {
    return null;
  }
  
  public Map getParameters() throws ApplicationException {
    return null;
  }
  
  public String getParametersString() throws ApplicationException {
    return null;
  }
  
  public String getThumbnail() throws ApplicationException {
    return null;
  }
  
  public static String getDefaultPath() throws ApplicationException, ValidationException {
    return null;
  }
  
  public void handlePreCreate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public void handlePostCreate(AsPostPersistenceEvent event) throws ValidationException, ApplicationException, AuthorizationException {
 
  }
  
  public void handlePostUpdate(AsPostPersistenceEvent event) throws ValidationException, ApplicationException, AuthorizationException {

  }
  
  public void approveStaticFiles() throws ValidationException, ApplicationException, AuthorizationException {

  }
  
  public void handlePreUpdate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
   
  public void handlePreDelete(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {

  }

  public static IPagingList findByIds(String[] ids) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static PageLayout findById(String id) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByName(String name) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findAll() throws ValidationException, ApplicationException {
    return null;
  }
  
  public static ContentTypeRef getContentTypeRef() throws ApplicationException, ValidationException {
    return null;
  }
  
  public Map<String, String> getPageLayoutFilePathMap(RequestContext rc) throws ApplicationException {
    return null;
  }
  
  public List<FileEntry> getPageLayoutEntries() throws ApplicationException {
    return null;
  }
  
  public List<StaticFile> getPageLayoutFiles() throws ApplicationException {
    return null;
  }
  
  public List<String> getVCMRefForPageLayoutFiles() throws ApplicationException {
    return null;
  }
  
  public List<String> getPageLayoutFilePaths(RequestContext rc) throws ApplicationException {
    return null;
  }
  
  public Map<String, FileEntry> getPageLayoutEntriesAsMap() throws ApplicationException {
    return null;
  }
  
  public static Comparator<FileEntry> getSequenceComparator(final boolean asc) {
    return null;
  }
  
  public static void handleStaticFilePreDelete(AsPrePersistenceEvent ppe) throws ApplicationException, ValidationException, AuthorizationException {

  }
  
  public void setPageLayoutEntries(List<FileEntry> pageLayoutEntries) throws ValidationException, ApplicationException {

  }
  
  public static IPagingList findByStaticFileId(String id) throws ApplicationException, ValidationException {
    return null;
  }
  
  public FileEntry findPageLayoutEntryByFriendlyId(String friendlyId) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByPageLayoutEntryByFriendlyId(String friendlyId) throws ApplicationException, ValidationException {
    return null;
  }
  
  protected boolean isInternal() {
    return false;
  }
}
