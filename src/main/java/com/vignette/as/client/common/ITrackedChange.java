package com.vignette.as.client.common;

public interface ITrackedChange {
  void setProperty(ITrackedProp paramITrackedProp);
  
  ITrackedProp getProperty();
  
  void setOriginalValue(Object paramObject);
  
  Object getOriginalValue();
  
  boolean hasOriginalValue();
  
  void clearOriginalValue();
  
  void setChangeContext(IChangeContext paramIChangeContext);
  
  IChangeContext getChangeContext();
}
