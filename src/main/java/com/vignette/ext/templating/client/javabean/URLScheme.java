package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.IPagingList;
import com.vignette.as.server.event.AsPrePersistenceEvent;

public class URLScheme extends VgnExtTemplatingObject {
 
  public static final String CONTENT_TYPE_NAME = "";
  
  public static final String ATTR_ID = "";
  
  public static final String ATTR_NAME = "";
  
  public static final String ATTR_RESOLUTION_STYLE = "";
  
  public static final String ATTR_RESOLVERS = "";
  
  public static final String ATTR_INCLUDE_CONTEXT_NAME = "";
  
  public static final String ATTR_INCLUDE_SITE_NAME = "";
  
  public static final String ATTR_INCLUDE_LOCALE_NAME = "";
  
  public static final String ATTR_INCLUDE_FORMAT_NAME = "";
  
  public static final String ATTR_LINK_PRINTER = "";
  
  public static final String ATTR_HOME_PAGE_REDIRECTION = "";
  
  public URLScheme() {
   
  }
  
  protected boolean isInternal() {
    return true;
  }
  
  public String getId() throws ApplicationException {
    return null;
  }
  
  public String getResolutionStyle() throws ApplicationException {
    return null;
  }
  public String getResolvers() throws ApplicationException {
    return null;
  }
  
  public boolean isIncludeContextName() throws ApplicationException {
    return true;
  }
  
  public boolean isIncludeFormatName() throws ApplicationException {
    return true;
  }
  
  public boolean isIncludeLocaleName() throws ApplicationException {
    return true;
  }
  
  public boolean isIncludeSiteName() throws ApplicationException {
    return true;
  }
  
  public boolean isHomePageRedirection() throws ApplicationException {
    return true;
  }
  
  public String getLinkPrinter() throws ApplicationException {
    return null;
  }
  
  public void handlePreDelete(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
  
  }
 
  public static ContentTypeRef getContentTypeRef() {
    return null;
  }
  
  public static IPagingList findByName(String name) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findAll() throws ApplicationException, ValidationException {
    return null;
  }

  
  public enum ResolutionStyle {
    FURL_LEGACY_RESOLUTION_STYLE(""),
    FURL_CANONICAL_RESOLUTION_STYLE(""),
    FURL_MIXED_RESOLUTION_STYLE(""),
    FURL_CUSTOM_RESOLUTION_STYLE("");
    
    ResolutionStyle(String style) {
      
    }
    
    public static ResolutionStyle getResolutionStyle(String style) {
      return null;
    }
    
    public String toString() {
        return null;
    }
  }
}
