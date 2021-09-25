package com.vignette.as.server.event;

import com.vignette.as.client.javabean.ManagedObject;

public class AsPostPersistenceEvent extends AsEvent {
  public static final String POST_CREATE = "";
  
  public static final String POST_UPDATE = "";
  
  public static final String POST_DELETE = "";
  
  public AsPostPersistenceEvent(String eventType) {
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
