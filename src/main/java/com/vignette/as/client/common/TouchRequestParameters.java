package com.vignette.as.client.common;

import java.io.Serializable;

public class TouchRequestParameters implements Serializable {
  public enum TouchLevel {
    LITE, MODERATE, HEAVY;
    
    public static TouchLevel fromString(String enumValue) {
     return null;
    }
  }
  
  public TouchLevel getTouchLevel() {
    return null;
  }
  
  public void setTouchLevel(TouchLevel touchLevel) {
    
  }
  
  public boolean isRecalculateReferences() {
    return true;
  }
  
  public void setRecalculateReferences(boolean recalculateReferences) {
    
  }
  
  public boolean isMakeDeploymentDirty() {
    return true;
  }
  
  public void setMakeDeploymentDirty(boolean makeDeploymentDirty) {
  }
  
  public boolean isMaintainApprovalStatus() {
    return true;
  }
  
  public void setMaintainApprovalStatus(boolean maintainApprovalStatus) {
    
  }
  
  public boolean isStartWorkflow() {
    return true;
  }
  
  public void setStartWorkflow(boolean startWorkflow) {
    
  }
  
  public String toString() {
    return null;
  }
}
