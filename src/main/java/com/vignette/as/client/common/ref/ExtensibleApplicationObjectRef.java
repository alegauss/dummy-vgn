package com.vignette.as.client.common.ref;

import com.vignette.as.client.common.AppObjectId;
import com.vignette.as.client.common.IHasStringId;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.ExtensibleApplicationObject;
import com.vignette.as.client.javabean.ManagedObject;
import java.io.Serializable;
import java.rmi.RemoteException;

public class ExtensibleApplicationObjectRef extends ManagedObjectRef implements IHasStringId, Serializable {
  public ExtensibleApplicationObjectRef(ObjectTypeRef objectTypeRef, String idstr) {
    
  }
  
  public ExtensibleApplicationObjectRef(ObjectTypeRef objectTypeRef, AppObjectId id) {
  
  }
  
  public ExtensibleApplicationObjectRef(ManagedObject cachedObject) throws ApplicationException, ValidationException {
    
  }
  
  public String getId() {
    return null;
  }
  
  public void setCachedObject(ManagedObject cachedObject) throws ApplicationException, RemoteException {
   
  }
  
  public void setId(String id) {
   
  }
  
  public ExtensibleApplicationObject retrieveExtensibleApplicationObject() throws ApplicationException, RemoteException {
    return null;
  }
  
  public int hashCode() {
    return 1;
  }
  
  public String toString() {
    return null;
  }
}
