package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.javabean.StaticFile;
import com.vignette.ext.templating.util.RequestContext;
import java.util.List;

public interface ITheme {
  StaticFile getScript() throws ApplicationException;
  
  String getPath() throws ApplicationException;
  
  List getThemeFiles() throws ApplicationException;
  
  List<String> getThemeFilePaths(RequestContext paramRequestContext) throws ApplicationException;
}
