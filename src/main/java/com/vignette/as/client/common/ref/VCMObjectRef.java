package com.vignette.as.client.common.ref;

import com.vignette.as.client.common.IHasStringId;
import com.vignette.cms.client.common.ObjectId;
import java.io.Serializable;

public class VCMObjectRef implements Cloneable, IHasStringId, Serializable {
  
  public VCMObjectRef() {}
  
  public VCMObjectRef(ObjectId id) {
    
  }
  
  public VCMObjectRef(String id) {
    
  }
  
  public boolean isManagedObjectId() {
    return true;
  }
  
  public static boolean isManagedObjectId(String vcmId) {
    return true;
  }
  
  public static boolean isManagedObjectId(ObjectId vcmId) {
    return true;
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
  
  public boolean isValid() {
    return true;
  }
  
  public boolean referenceSameObjects(VCMObjectRef ref) {
    return true;
  }
  
  public String toString() {
    return null;
  }
  
  public boolean equals(Object o) {
    return true;
  }
  
  public int hashCode() {
    return 1;
  }
  
  public VCMObjectRef clone() {
      return null;
  }
}
