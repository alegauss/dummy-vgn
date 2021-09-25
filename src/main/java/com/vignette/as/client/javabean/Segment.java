package com.vignette.as.client.javabean;

import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import java.util.List;

public class Segment extends ContentInstance {
  public static final String ATTR_ID = "";
  
  public static final String ATTR_NAME = "";
  
  public static final String ATTR_SEGMENTTYPE = "";
  
  public static final String ATTR_SEGMENTID = "";
  
  public static final String CONTENT_TYPE_NAME = "";
  
  public static final String DEFAULT_ROOT_PATH = "";
  
  public String getId() throws ApplicationException {
    return null;
  }
  
  public String getSegmentName() throws ApplicationException {
    return null;
  }
  
  public void setSegmentName(String segmentName) throws ApplicationException {
    
  }
  
  public String getSegmentType() throws ApplicationException {
    return null;
  }
  
  public void setSegmentType(String segmentType) throws ApplicationException {
    
  }
  
  public String getSegmentId() throws ApplicationException {
    return null;
  }
  
  public void setSegmentId(String segmentId) throws ApplicationException {
    
  }
  
  public static ContentTypeRef getContentTypeRef() {
    return null;
  }
  
  public static Segment findBySegmentTypeAndName(String segmentType, String segmentName) throws ValidationException, ApplicationException {
    return null;
  }
  
  public static List findBySegmentType(String segmentType) throws ValidationException, ApplicationException {
    return null;
  }
  
  public static IPagingList findAll() throws ApplicationException, ValidationException {
    return null;
  }
  
  public void commit() throws ApplicationException, AuthorizationException, ValidationException {
  }
  
 
  public static String calculateId(String type, String segmentId) throws ApplicationException {
    return null;
  }
  
 
  public static Segment newInstance() throws ApplicationException {
    return null;
  }
  
  public static String formatQualifiedName(String segmentType, String segmentName) throws ValidationException {
    return null;
  }
  
  public String getQualifiedName() throws ApplicationException, ValidationException {
    return null;
  }
}
