package com.vignette.as.client.common.ref;

import com.vignette.as.client.common.IHasStringId;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.AsLocale;
import com.vignette.as.client.javabean.ManagedObject;
import java.rmi.RemoteException;
import java.util.Locale;

public class AsLocaleRef extends ManagedObjectRef implements IHasStringId {
  public AsLocaleRef() {
    
  }
  
  public AsLocaleRef(String id) {
    
  }
  
  public AsLocaleRef(ManagedObject cachedObject) throws ApplicationException, ValidationException {
    super(cachedObject);
  }
  
  public AsLocaleRef(String language, String country) throws ApplicationException, ValidationException {
   
  }
  
  public AsLocaleRef(String language, String country, String variant) throws ApplicationException, ValidationException {
    
  }
  
  public AsLocaleRef(Locale locale) throws ApplicationException, ValidationException {
    
  }
  
  public String getId() {
    return null;
  }
  
  public void setId(String id) {
    
  }
  
  public String toString() {
    return null;
  }
  
  public AsLocale getAsLocale() throws ApplicationException {
    return null;
  }

  public Locale getJavaLocale() {
  return null;
  }
  
  public AsLocale retrieveManagedObject() throws ApplicationException {
    return null;
  }
  
  public AsLocale retrieveManagedObject(RequestParameters rp) throws ApplicationException, ValidationException {
    return null;
  }
  
  public ManagedObjectVCMRef asManagedObjectVCMRef() throws ApplicationException, RemoteException {
    return null;
  }
}
