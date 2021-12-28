package com.vignette.as.client.common;

import com.vignette.cms.client.common.ObjectId;
import java.io.Serializable;

public class StaticFileData extends DataObject implements Serializable {

  public StaticFileData() {}
  
  public StaticFileData(ObjectId id) {
  }
  
  public StaticFileData(String id) {

  }
  
  public void setId(ObjectId id) {
  }
  
  public void setId(String id) {

  }
  
  public ObjectId getId() {
    return null;
  }
  
  public String getPlacementPath() {
    return null;
  }
  
  public void setPlacementPath(String placementPath) {

  }
  
  public String getDeploymentType() {
    return null;
  }
  
  public void setDeploymentType(String deploymentType) {
  }
  
  public int getModCount() {
    return 0;
  }
  
  public void setModCount(int modCount) {

  }
  
  public boolean equals(Object o) {
   return true;
  }
}
