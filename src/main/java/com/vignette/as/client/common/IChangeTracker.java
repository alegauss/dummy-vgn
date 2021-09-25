package com.vignette.as.client.common;

import java.util.List;
import java.util.Set;

public interface IChangeTracker {
  boolean isChangeTracking();
  
  void setChangeTracking(boolean paramBoolean);
  
  void setParentChangeTracker(IChangeTracker paramIChangeTracker);
  
  IChangeTracker getParentChangeTracker();
  
  void addChildChangeTracker(IChangeTracker paramIChangeTracker);
  
  void removeChildChangeTracker(IChangeTracker paramIChangeTracker);
  
  List getChildrenChangeTrackers();
  
  void clearChildrenChangeTrackers();
  
  boolean hasChildrenChangeTrackers();
  
  void setDefaultChangeContext(IChangeContext paramIChangeContext);
  
  IChangeContext getDefaultChangeContext();
  
  ITrackedChange trackChange(ITrackedProp paramITrackedProp);
  
  ITrackedChange trackChange(ITrackedProp paramITrackedProp, IChangeContext paramIChangeContext);
  
  ITrackedChange trackChange(ITrackedChange paramITrackedChange);
  
  ITrackedChange trackChange(ITrackedProp paramITrackedProp, Object paramObject);
  
  void clearChanges();
  
  boolean hasChanges();
  
  boolean hasChanges(ITrackedProp paramITrackedProp);
  
  boolean hasChanges(IChangeContext paramIChangeContext);
  
  boolean hasChanges(ITrackedProp paramITrackedProp, IChangeContext paramIChangeContext);
  
  List getChanges();
  
  List getChanges(ITrackedProp paramITrackedProp);
  
  List getChanges(IChangeContext paramIChangeContext);
  
  List getChanges(ITrackedProp paramITrackedProp, IChangeContext paramIChangeContext);
  
  Set getChangedProperties();
  
  Set getChangedProperties(IChangeContext paramIChangeContext);
  
  Set getChangeContexts();
  
  Set getChangeContexts(ITrackedProp paramITrackedProp);
}
