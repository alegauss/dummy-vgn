package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.exception.ApplicationException;
import java.util.Map;

public interface IDisplayViewEnabled {
  String getDisplayViewUri() throws ApplicationException;
  
  Map getDisplayViewParams() throws ApplicationException;
  
  int getDisplayViewType() throws ApplicationException;
}
