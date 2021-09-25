package com.vignette.cms.client.common;

import com.vignette.translate.ITranslatableROJavaBean;
import java.io.Serializable;

public class Association implements Serializable, ITranslatableROJavaBean {
  static final long serialVersionUID = 0L;
  
  public Association(ObjectId objectId, ObjectId catId, String label) {

  }
  
  public Association(String catPath, ObjectId taxId) {

  }
  
  protected Association() {}
  
  public ObjectId getObjectId() {
    return null;
  }
  
  protected void setObjectId(ObjectId objId) {
  }
  
  public ObjectId getCategoryId() {
    return null;
  }
  
  public void setCategoryId(ObjectId catId) {
  }
  
  public String getLabel() {
    return null;
  }
  
  protected void setLabel(String label) {
  }
  
  public String getCategoryPath() {
    return null;
  }
  
  public ObjectId getTaxId() {
    return null;
  }
}
