package com.vignette.as.client.common.ref;

import com.vignette.as.client.common.AppObjectId;
import com.vignette.as.client.common.IHasStringId;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.ManagedObject;
import com.vignette.cms.client.common.ObjectId;

public class StaticFileRef extends ManagedObjectRef implements IHasStringId {
  public StaticFileRef() {
    super(null, null);
  }
  
  public StaticFileRef(String id) {
    super(null, null);
  }
  
  public StaticFileRef(ObjectId id) {
    super(null, null);
  }
  
  public StaticFileRef(ManagedObject cachedObject) throws ApplicationException, ValidationException {
    super(null, null);
  }
  
  public StaticFileRef(AppObjectId id) {
    super(null, null);
  }
  
  public String getId() {
   return null;
  }
  
  public void setId(String id) {
  }
  
  public String toString() {
    return null;
  }
}
