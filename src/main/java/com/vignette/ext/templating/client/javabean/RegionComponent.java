package com.vignette.ext.templating.client.javabean;

import java.io.Serializable;

public class RegionComponent implements Serializable {
  
  public RegionComponent() {}
  
  public RegionComponent(String regionId, String contentComponentId, String sequenceNo) {
   
  }
  
  public RegionComponent(String regionId, String contentComponentId, int sequenceNo) {
 
  }
  
  public int getSequenceNumber() {
    return 1;
  }
  
  public void setSequenceNumber(int sequenceNumber) {
      }
  
  public String getContentComponentId() {
    return null;
  }
  
  public void setContentComponentId(String contentComponentId) {
     }
  
  public String getRegionId() {
    return null;
  }
  
  public void setRegionId(String regionId) {
    
  }
  
  public boolean equals(Object obj) {
    return true;
  }
}
