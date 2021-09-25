package com.vignette.ext.templating.cache;

import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.javabean.ManagedObject;
import com.vignette.ext.templating.util.RequestContext;
import com.vignette.logging.LoggingManager;
import com.vignette.logging.context.ContextLogger;
import java.rmi.RemoteException;

public class RenderedManagedObjectCacheKey {
  private static final ContextLogger logger = LoggingManager.getContextLogger(RenderedManagedObjectCacheKey.class);
  
  public static final String CACHE_KEY_STRING_DELIMETER = "-";
  
  private ManagedObject managedObject = null;
  
  private ManagedObjectVCMRef vcmRef = null;
  
  private RequestContext requestContext = null;
  
  private String renderString = null;
  
  public RenderedManagedObjectCacheKey(ManagedObject managedObject, RequestContext requestContext, String renderString) {
  }
  
  public ManagedObject getManagedObject() throws ApplicationException {
  return null;
  }
  
  private void setManagedObject(ManagedObject managedObject) {
  }
  
  public ManagedObjectVCMRef getVCMRef() {
    return null;
  }
  
  private void setVCMRef(ManagedObjectVCMRef vcmRef) {
   
  }
  
  public RequestContext getRequestContext() {
    return null;
  }
  
  private void setRequestContext(RequestContext requestContext) {
  }
  
  public String getXSL() {
    return null;
  }
  
  private void setRenderString(String xsl) {
  }
  
  public boolean appliesToAllVariations() {
    return true;
  }
  
  public String getCacheKeyString() {
    return null;
  }
  
  public int hashCode() {
    return 0;
  }
  
  public boolean equals(Object other) {
    return true;
  }
  
  public String toString() {
    return null;
  }
}
