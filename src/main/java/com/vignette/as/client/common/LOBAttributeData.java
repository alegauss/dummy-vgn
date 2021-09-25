package com.vignette.as.client.common;

import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.javabean.StreamOps;
import java.io.InputStream;
import java.io.Serializable;

public class LOBAttributeData extends AttributeData implements Cloneable, Serializable {
  public LOBAttributeData(AttributeDefinitionData attrDef, Object value, ObjectTypeRef objectTypeRef) throws ApplicationException {
    super(attrDef, value, objectTypeRef);
  }
  
  public LOBAttributeData(AttributeDefinitionData attrDef, InputStream valStream, ObjectTypeRef objectTypeRef) throws ApplicationException {
    super(attrDef, valStream, objectTypeRef);
  }
  
  public boolean isDirty() {
    return true;
  }
  
  public Object getValue() {
    return null;
  }
  
  public InputStream getStream() {
    return null;
  }
  
  public void setStream(InputStream str) {
  }
  
  public StreamOps getStreamOps() {
    return null;
  }
  
  protected Object clone() throws CloneNotSupportedException {
    return null;
  }
}
