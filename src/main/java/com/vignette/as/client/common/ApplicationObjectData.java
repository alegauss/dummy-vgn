package com.vignette.as.client.common;

import com.vignette.as.common.exception.PersistorFinderException;
import com.vignette.exolab.castor.jdo.TimeStampable;

public class ApplicationObjectData extends DataObject implements TimeStampable {
  private AppObjectId id;
  
  private long timeStamp;
  
  private ApplicationObjectData parentData;
  
  private boolean maintainAppIdOnCreation = false;
  
  public void postLoad() throws PersistorFinderException {}
  
  public boolean preserveAppId() {
   return true;
  }
  
  public void preserveAppId(boolean bPreserveAppId) {
    
  }
  
  public ApplicationObjectData getParentData() {
    return null;
  }
  
  public void setParentData(ApplicationObjectData parent) {
   
  }
  
  public AppObjectId getId() {
    return null;
  }
  
  public void setId(AppObjectId id) {
    
  }
  
  public long jdoGetTimeStamp() {
    return 0L;
  }
  
  public void jdoSetTimeStamp(long timeStamp) {
  }
}
