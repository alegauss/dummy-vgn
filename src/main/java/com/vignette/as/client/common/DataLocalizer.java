package com.vignette.as.client.common;

import com.vignette.logging.LoggingManager;
import com.vignette.logging.context.ContextLogger;
import java.io.Serializable;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class DataLocalizer extends ChangeTracker implements Serializable {
  private static ContextLogger logCat = LoggingManager.getContextLogger(DataLocalizer.class);
  
  public static final String CT_MSG_BUNDLE = "";
  
  public static final String CT_MSG_BUNDLE_PATH_DELIM = "";
  
  public static final String CT_MSG_BUNDLE_DISPLAYNAME_KEY = "";
  
  public static final String CT_MSG_BUNDLE_HELPTEXT_KEY = "";
  
  public static final String CT_MSG_BUNDLE_TOOLTIP_KEY = "";
  
  public static final String CT_MSG_BUNDLE_GROUPNAME_KEY = "";
  
  public static final String CT_MSG_BUNDLE_LABEL_KEY = "";
  
  public String getLocalizedValue(Locale locale, String key) {
   return null;
  }
}
