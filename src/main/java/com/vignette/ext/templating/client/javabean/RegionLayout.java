package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.AttributedObject;
import com.vignette.as.client.javabean.IPagingList;
import com.vignette.as.client.javabean.StaticFile;
import com.vignette.as.server.event.AsPostPersistenceEvent;
import com.vignette.as.server.event.AsPrePersistenceEvent;
import com.vignette.ext.templating.util.RequestContext;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class RegionLayout extends VgnExtTemplatingObject {
  
  public static final String LAYOUT_CONTENT_TYPE_NAME = "";
  
  public static final String LAYOUT_SCRIPT_ATTRIB = "";
  
  public static final String LAYOUT_PATH_ATTRIB = "";
  
  public static final String LAYOUT_PARAMETERS_ATTRIB = "";
  
  public static final String LAYOUT_REQUIRED_REQUEST_PARAMETER_NAMES_ATTRIB = "";
  
  public static final String UPPERCASE_CONTENT_TYPE_NAME = "";
  
  public static final int REGIONLAYOUT_TYPE_UNKNOWN = 0;
  
  public static final int TYPE_JSP_SCRIPT = 0;
  
  public static final int TYPE_XSL_SCRIPT = 0;
  
  public static final String TYPE_EXTERNAL_SCRIPT = "";
  
  public static final String RELATION_LAYOUTPARAMS = "";
  
  public static final String JSP_SCRIPT_SUFFIX = "";
  
  public static final String XSL_SCRIPT_SUFFIX = "";
  
  public static final String LAYOUT_ID_ATTRIB = "";
  
  public static final String LAYOUT_ISSHARED_ATTRIB = "";
  
  public static final String TRUE = "";
  
  public static final String LAYOUT_VERTICAL = "";
  
  public static final String LAYOUT_NAME_ATTRIB = "";
  
  public static final String LAYOUT_DESCRIPTION_ATTRIB = "";
  
  public static final String LAYOUT_THUMBNAIL_ATTRIB = "";
  
  public static final String DEFAULT_REGION_LAYOUT_NAME = "";
  
  public static final String RELATION_REGION_LAYOUT_FILES = "";
  
  public static final String REGION_LAYOUT_REGIONLAYOUTID_ATTRIB = "";
  
  public static final String REGION_LAYOUT_STATICFILEID_ATTRIB = "";
  
  public static final String REGION_LAYOUT_SEQID_ATTRIB = "";
  
  public static final String REGION_LAYOUT_FRIENDLYID_ATTRIB = "";
  
  public static final String REGION_LAYOUT_FILE_PATH_ATTRIB = "";
  
  public String getPath() throws ApplicationException {
    return null;
  }
  
  public StaticFile getScript() throws ApplicationException {
    return null;
  }
  
  public List<FileEntry> getRegionLayoutEntries() throws ApplicationException {
    return null;
  }
  
  public static List getAllStaticFiles(String regionLayoutId) throws ValidationException, ApplicationException {
    return null;
  }
  
  public List<String> getRegionLayoutFilePaths(RequestContext rc) throws ApplicationException {
    return null;
  }
  
  public void setName(String regionLayoutName) throws ApplicationException {
  }
  
  public void setDescription(String des) throws ApplicationException {
  }
  
  public void setThumbnail(String thumbnail) throws ApplicationException {
  }
  
  public void setPath(String path) throws ApplicationException {
  }
  
  public void setRegionLayoutEntries(List<FileEntry> regionLayoutFileEntries) throws ValidationException, ApplicationException {
  }
  
  public static Comparator getSequenceComparator(final boolean asc) {
    return null;
  }
  
  public Map<String, String> getRegionLayoutFilePathMap(RequestContext rc) throws ApplicationException {
    return null;
  }
  
  public String getRegionLayoutFilePath(String friendlyId, RequestContext rc) throws ApplicationException, ValidationException {
    return null;
  }

  
  public List getRegionLayoutFiles() throws ApplicationException {
    return null;
  }
  
  public List<String> getVCMRefForRegionLayoutFiles() throws ApplicationException {
    return null;
  }
  
  public Map<String, FileEntry> getRegionLayoutFileEntriesAsMap() throws ApplicationException {
    return null;
  }
  
  public Map getParameters() throws ApplicationException {
    return null;
  }
  
  public Collection<String> getRequiredRequestParameterNames() throws ApplicationException {
    return null;
  }
  
  public static RegionLayout findById(String id) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public String getId() throws ApplicationException {
    return null;
  }
  
  public static ContentTypeRef getContentTypeRef() throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByIds(String[] ids) throws ApplicationException, ValidationException {
    return null;
  }
  
  public String getThumbnail() throws ApplicationException {
    return null;
  }
  
  public String getDescription() throws ApplicationException {
    return null;
  }
  
  public static IPagingList getAllRegionLayouts() throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByName(String name) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static String getDefaultPath() throws ApplicationException, ValidationException {
    return null;
  }
  
  public void handlePreCreate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  public void handlePreUpdate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  public static void handleStaticFilePreDelete(AsPrePersistenceEvent ppe) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public static IPagingList findByStaticFileId(String id) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByRegionLayoutEntryFriendlyId(String friendlyId) throws ApplicationException, ValidationException {
    return null;
  }
  
  public FileEntry findRegionLayoutFileEntryByFriendlyId(String friendlyId) throws ApplicationException, ValidationException {
    return null;
  }
  
  public void approveStaticFiles() throws ValidationException, ApplicationException, AuthorizationException {
  }
  
  public void handlePostCreate(AsPostPersistenceEvent event) throws ValidationException, ApplicationException, AuthorizationException {

  }
  
  public void handlePostUpdate(AsPostPersistenceEvent event) throws ValidationException, ApplicationException, AuthorizationException {
  }
  
  public void handlePreDelete(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
  }
  
 
  public boolean isManaged() throws ApplicationException {
    return true;
  }
  
  
    protected boolean isInternal() {
    return false;
  }
}
