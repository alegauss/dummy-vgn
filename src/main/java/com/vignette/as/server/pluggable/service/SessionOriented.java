package com.vignette.as.server.pluggable.service;

import com.vignette.ext.templating.util.RequestContext;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.servlet.http.Cookie;

public interface SessionOriented<T extends SessionOriented.Context> {
  T newContext(RequestContext paramRequestContext);
  
  void setContext(T paramT);
  
  T getContext();
  
  User getUser();
  
  User login(String paramString1, String paramString2);
  
  void logout();
  
  public static interface User extends ProviderBean {
    String getName();
  }
  
  public static interface Context extends Serializable {
    void setModified(boolean param1Boolean);
    
    boolean isModified();
    
    Date getModifiedDate();
    
    void setLocale(Locale param1Locale);
    
    Locale getLocale();
    
    List<Cookie> getCookies();
    
    void invalidate();
    
    boolean isValid();
  }
}
