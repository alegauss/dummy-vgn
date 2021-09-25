package com.vignette.as.client.common;

import com.vignette.as.client.common.ref.VCMObjectRef;
import java.io.Serializable;

public abstract class VCMObjectReferenceInstance implements Cloneable, Serializable {
  protected VCMObjectRef referrerId = null;
  
  protected VCMObjectRef referentId = null;
  
  protected String referenceName = null;
  
  public static final String FIELD_REFERRERID = "";
  
  public static final String FIELD_REFERENTID = "";
  
  public static final String FIELD_REFERENCENAME = "";
  
  public VCMObjectRef getReferrerId() {
    return null;
  }
  
  public VCMObjectRef getReferentId() {
    return null;
  }
  
  public String getReferenceName() {
    return null;
  }
  
  public boolean equals(Object o) {
    return true;
  }
  
  public int hashCode() {
    return 0;
  }
  
  public VCMObjectReferenceInstance clone() {
    return null;
  }
}
