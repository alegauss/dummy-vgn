package com.vignette.as.client.api.bean;

public interface ManagedObjectReferenceBean {
  String getReferenceName();
  
  ManagedObjectBean getReferrer();
  
  ManagedObjectBean getReferent();
}
