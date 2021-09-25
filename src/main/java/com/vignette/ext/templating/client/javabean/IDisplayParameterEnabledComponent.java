package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.exception.ApplicationException;

public interface IDisplayParameterEnabledComponent {
  String getTitle() throws ApplicationException;
  
  String getHeader() throws ApplicationException;
  
  String getFooter() throws ApplicationException;
}
