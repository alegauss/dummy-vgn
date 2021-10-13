package com.vignette.as.client.common.ref;

import com.vignette.as.client.common.AppObjectId;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.ManagedObject;
import com.vignette.as.client.javabean.ObjectType;
import java.io.Serializable;

public class ObjectTypeRef extends ExtensibleApplicationObjectRef implements Serializable {
  public ObjectTypeRef() {
	this((AppObjectId)null);
  }
  
  public ObjectTypeRef(String id) {
    this(new AppObjectId(id));
  }
  
  public ObjectTypeRef(AppObjectId id) {
    super(null, id);
  }
  
  public ObjectTypeRef(ManagedObject cachedObject) throws ApplicationException, ValidationException {
    super(cachedObject);
  }
  
  protected ObjectTypeRef(ObjectTypeRef objectTypeRef, AppObjectId id) {
    super(objectTypeRef, id);
  }
  
  public ObjectType getObjectType() throws ApplicationException {
    return null;
  }
}
