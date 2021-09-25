package com.vignette.as.client.common;

import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.VCMObjectRef;
import com.vignette.as.client.javabean.ManagedObject;

public abstract class ManagedObjectReferenceInstance extends VCMObjectReferenceInstance {
  
  public static final String FIELD_REFERRER = "";
  
  public ManagedObject getManagedObject() {
    return null;
  }
  
  public ManagedObjectVCMRef getReferrerId() {
    return null;
  }
  
  public ManagedObjectReferenceInstance clone() {
    return null;
  }
}
