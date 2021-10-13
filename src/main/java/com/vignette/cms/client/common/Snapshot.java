package com.vignette.cms.client.common;

import com.vignette.translate.ITranslatableJavaBean;
import java.io.Serializable;
import java.util.Date;

public class Snapshot implements Serializable, ITranslatableJavaBean {
   
  public ObjectId getSnapshotId() {
    return null;
 }
  
  public void setSnapshotId(ObjectId snapshotId) {
  
  }
  
  public Date getSnapshotCreationDate() {
    return null;
  }
  
  public void setSnapshotCreationDate(Date creationDate) {
    
  }
  
  public String[] getSnapshotLabels() {
    return null;
  }
  
  public void setSnapshotLabels(String[] snapshotLabels) {
  
  }
  
  public SnapshotType getSnapshotType() {
    return null;
  }
  
  public void setSnapshotType(SnapshotType snapshotType) {
    
  }
  
  public String getComment() {
    return null;
  }
  
  public void setComment(String comment) {

  }
  
  public int getModCount() {
    return 1;
  }
  
  public void setModCount(int mc) {
   
  }
  
  public String getCreatorId() {
    return null;
  }
  
  public void setCreatorId(String id) {
  
  }
  
  public String toString() {
   return null;
}
  
  public boolean equals(Object obj) {
    return true;
  }
}
