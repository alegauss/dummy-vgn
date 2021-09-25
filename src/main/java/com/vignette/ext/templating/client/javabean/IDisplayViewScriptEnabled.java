package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.javabean.StaticFile;

public interface IDisplayViewScriptEnabled extends IDisplayViewEnabled {
  StaticFile getScript() throws ApplicationException;
}
