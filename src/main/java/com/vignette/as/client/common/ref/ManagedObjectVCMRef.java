package com.vignette.as.client.common.ref;

import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.ManagedObject;
import com.vignette.cms.client.common.ObjectId;
import java.rmi.RemoteException;

public class ManagedObjectVCMRef extends VCMObjectRef implements IManagedObjectRef {
  public static final String FIELD_MANAGED_OBJECT_REF = "";

  public ManagedObjectVCMRef(ObjectId id) {
    
  }
  
  public ManagedObjectVCMRef(String id) {
    
  }
  
  public ManagedObjectVCMRef(ManagedObject cachedObject) {
    
  }
  
  public ManagedObjectVCMRef(VCMObjectRef vcmRef) throws ValidationException {
    
  }
  
  public void setCachedObject(ManagedObject cachedObject) {
   
  }
  
  public ManagedObject getCachedObject() {
    return null;
  }
  
  public ManagedObject retrieveManagedObject() throws ApplicationException, RemoteException {
	return null;
  }
  
  public ManagedObject retrieveManagedObject(RequestParameters rp) throws ApplicationException, ValidationException, RemoteException {
    return null;
  }
  
  public ManagedObjectRef asManagedObjectRef() throws ApplicationException, RemoteException {
    return null;
  }
  
  public ObjectTypeRef getObjectTypeRef() throws ApplicationException, ValidationException {
	return null;
  }
  
  public void setId(String id) {
  }
  
  public String getId() {
    return null;
  }
  
  public void setObjectId(ObjectId id) {

  }
  
  public ObjectId getObjectId() {
    return null;
  }
  
  public String toString() {
	return null;
  }
  
  public boolean equals(Object o) {
    return true;
  }
  
  public int hashCode() {
    return 0;
  }
  
  public ManagedObjectVCMRef clone() {
    return null;
  }
  
  public boolean exists() throws ApplicationException {
    return true;
  }
  
  public ManagedObjectVCMRef() {}
}
