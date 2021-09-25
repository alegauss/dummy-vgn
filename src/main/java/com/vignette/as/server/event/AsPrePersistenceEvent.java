package com.vignette.as.server.event;

import com.vignette.as.client.javabean.ManagedObject;

public class AsPrePersistenceEvent extends AsEvent {
  public static final String PRE_CREATE = "";
  
  public static final String PRE_UPDATE = "";
  
  public static final String PRE_DELETE = "";

  public AsPrePersistenceEvent(String eventType) {
  }
  
  public ManagedObject getManagedObject() {
    return null;
  }
  
  public void setManagedObject(ManagedObject managedObject) {
  }
  
  public String getTarget() {
    return null;
  }
}
