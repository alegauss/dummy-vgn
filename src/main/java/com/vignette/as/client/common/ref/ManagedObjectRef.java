package com.vignette.as.client.common.ref;

import com.vignette.as.client.common.AttributeData;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.ManagedObject;
import com.vignette.as.client.sdo.ManagedObjectMapData;
import java.io.Serializable;
import java.rmi.RemoteException;

public class ManagedObjectRef implements IManagedObjectRef, Serializable {
  protected transient ManagedObject cachedObject = null;
  
  public static final String FIELD_CONTENT_MGMT_ID = "";
  
  
  public ManagedObjectRef() {}
  
  public ObjectTypeRef getObjectTypeRef() {
	return null;
  }
  
  public void setCachedObject(ManagedObject cachedObject) throws ApplicationException, RemoteException {
  
  }
  
  public ManagedObject getCachedObject() {
	return null;
  }
  
  public ManagedObjectRef(ManagedObject cachedObject) throws ApplicationException, ValidationException {
   
  }
  
  public AttributeData[] getKeys() {
    return null;
  }
  
  public boolean equals(Object o) {
    return true;
  }
  
  public int hashCode() {
    return 1;
  }
  
  public void setKeys(AttributeData[] keys) {
   
  }
  
  public boolean isValid() {
    return true;
  }
  
  public ManagedObjectRef(ObjectTypeRef objectTypeRef, AttributeData[] keys) {
   
  }
  
  public String toString() {
    return null;
  }
  
  public ManagedObject retrieveManagedObject() throws ApplicationException {
	return null;
  }
  
  public ManagedObject retrieveManagedObject(RequestParameters rp) throws ApplicationException, ValidationException {
	return null;
  }
  
  public ManagedObjectVCMRef asManagedObjectVCMRef() throws ApplicationException, RemoteException {
	return null;
  }
  
  public ManagedObjectRef(ManagedObjectMapData mapData) {
    
  }
  
  public ManagedObjectMapData getMap() {
    return null;
  }
  
  public void setMap(ManagedObjectMapData mapData) {
   
  }
  
  public boolean exists() throws ApplicationException {
    return true;
  }
}
