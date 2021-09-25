package com.vignette.ext.templating.client.javabean.displayview;

import com.vignette.as.client.common.AsObjectRequestParameters;
import com.vignette.as.client.common.ContentInstanceDBQuery;
import com.vignette.as.client.common.ContentInstanceWhereClause;
import com.vignette.as.client.common.Query;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.WhereClause;
import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.AttributedObject;
import com.vignette.as.client.javabean.ContentType;
import com.vignette.as.client.javabean.IPagingList;
import com.vignette.as.client.javabean.ManagedObject;
import com.vignette.as.client.javabean.QueryManager;
import com.vignette.as.client.javabean.StaticFile;
import com.vignette.as.config.ConfigUtil;
import com.vignette.as.server.event.AsPrePersistenceEvent;
import com.vignette.ext.templating.client.javabean.VgnExtTemplatingObject;
import com.vignette.logging.LoggingManager;
import com.vignette.logging.context.ContextLogger;
import com.vignette.util.MsgObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class DisplayView extends VgnExtTemplatingObject {
  private static ContextLogger logger = LoggingManager.getContextLogger(DisplayView.class);
  
  private static String appObjID = "";
  
  public static final String CONTENT_TYPE_NAME = "";
  
  public static final String ATTR_ID = "";
  
  public static final String ATTR_NAME = "";
  
  public static final String ATTR_DESC = "";
  
  public static final String ATTR_THUMBNAIL = "";
  
  public static final String ATTR_PATH = "";
  
  public static final String ATTR_PREVIEW_ICON = "";
  
  public static final String ATTR_PARAMETERS = "";
  
  public static final String ATTR_REQUIRED_REQUEST_PARAMETER_NAMES = "";
  
  public static final String ATTR_ASSOC_CONTENT_TYPE = "";
  
  public static final String ATTR_ASSOC_CONTENT_TYPE_DISPVIEWID = "";
  
  public static final String ATTR_ASSOC_APP_INST_DISPVIEWID = "";
  
  public static final String ATTR_ASSOC_APP_INST = "";
  
  public static final String ATTR_DISPLAY_STATUS = "";
  
  public static final String ATTR_VIEW_TYPE = "";
  
  public static final String ATTR_SCRIPT = "";
  
  public static final String REL_DISPVIEWCOMP = "";
  
  public static final String REL_DISPVIEW_APP_INST = "";
  
  public static final String LABEL_VIEW_NAME = "";
  
  public static final String LABEL_DESCRIPTION = "";
  
  public static final String LABEL_PATH = "";
  
  public static final String LABEL_PARAMETERS = "";
  
  public static final String TRUE = "";
  
  public static final int TYPE_SERVER_SIDE = 0;
  
  public static final int TYPE_CLIENT_SIDE = 0;
  
  public static final String DEFAULT_DISPLAYVIEW_CTDXMLNAME_SEPARATOR = "";
  
  public DisplayView() {
  }
  
  public static String getCtName() {
    return null;
  }
  
  protected boolean isInternal() {
    return false;
  }
  
  public String getId() throws ApplicationException {
    return null;
  }
  
  public String getPath() throws ApplicationException {
    return null;
  }
  
  public String getPreviewIcon() throws ApplicationException {
    return null;
  }
  
  public String getDisplayStatus() throws ApplicationException {
    return null;
  }
  
  public int getViewType() throws ApplicationException {
   return 1;
  }
  
  public StaticFile getScript() throws ApplicationException {
    return null;
  }
  
  public Map getParameters() throws ApplicationException {
    return null;
  }
  
  public Collection<String> getRequiredRequestParameterNames() throws ApplicationException {
    return null;
  }
  
  public String getParametersString() throws ApplicationException {
    return null;
  }
  public String getDescription() throws ApplicationException {
    return null;
  }
  
  public String getThumbnail() throws ApplicationException {
    return null;
  }
  
  public static ContentTypeRef getContentTypeRef() throws ApplicationException, ValidationException {
    return null;
  }
  
  public static DisplayView findById(String id) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByIds(String[] ids) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByName(String name) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByContentTypeId(String contentTypeId) throws ApplicationException {
    return null;
  }
  
  public static Map findAllApplicableContentTypes() throws ApplicationException {
    return null;
  }
  
  public static Map findAllApplicableContentTypes(Locale locale) throws ApplicationException {
    return null;
  }
  
  public static List findAllApplicableDisplayViews(String contentTypeId, String appInstanceName) throws ApplicationException {
    return null;
  }
  
  public static List findAllApplicableDisplayViews(String contentTypeId, String appInstanceName, boolean includeInactive) throws ApplicationException {
    return null;
  }
  
  public List findAllAssociatedContentTypes() throws ApplicationException {
    return null;
  }
  
  public void handlePreCreate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public void handlePreUpdate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  private void validateStatusUpdate() throws ApplicationException, ValidationException, AuthorizationException {
  
  }
  
  private void validateLengthsOfFields() throws ApplicationException, ValidationException {
    
  }
  
  private void validatePathOrScript() throws ValidationException, ApplicationException {
  }
}
