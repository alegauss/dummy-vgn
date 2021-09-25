package com.vignette.ext.templating.profile;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.ext.templating.util.RequestContext;

public interface IProfile {
  void setRequestContext(RequestContext paramRequestContext);
  
  Object getAttribute(String paramString);
  
  String[] getSegments() throws ApplicationException;
  
  String[] getGroups() throws ApplicationException;
  
  String getCurrentUserName() throws ApplicationException;
  
  String[] getAllSegmentNames();
  
  String[] getAllGroupNames();
  
  String[] getAllProfileAttributeNames();
  
  String getAttributeType(String paramString);
}
