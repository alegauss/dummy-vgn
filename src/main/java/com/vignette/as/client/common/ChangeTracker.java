package com.vignette.as.client.common;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class ChangeTracker implements IChangeTracker, Serializable {

  public boolean isChangeTracking() {
    return true;
  }
  
  public void setChangeTracking(boolean enable) {
  
  }
  
  public void setParentChangeTracker(IChangeTracker parentChangeTracker) {
   
  }
  
  public IChangeTracker getParentChangeTracker() {
    return null;
  }
  
  public void addChildChangeTracker(IChangeTracker childChangeTracker) {
   
  }
  
  public void removeChildChangeTracker(IChangeTracker childChangeTracker) {
   
  }
  
  public List getChildrenChangeTrackers() {
    return null;
  }
  
  public void clearChildrenChangeTrackers() {
   
  }
  
  public boolean hasChildrenChangeTrackers() {
    return true;
  }

  public void setDefaultChangeContext(IChangeContext context) {
   
  }
  
  public IChangeContext getDefaultChangeContext() {
    return null;
  }
  
  public ITrackedChange trackChange(ITrackedProp property) {
    return null;
  }
  
  public ITrackedChange trackChange(ITrackedProp property, IChangeContext context) {
    return null;
  }
  
  public ITrackedChange trackChange(ITrackedProp property, Object originalValue) {
    return null;
  }
  
  public ITrackedChange trackChange(ITrackedChange change) {
    return null;
  }
  
  public void clearChanges() {
    
  }

  public boolean hasChanges() {
    return true;
    }
  
  public boolean hasChanges(ITrackedProp property) {
    return true;
  }
  
  public boolean hasChanges(IChangeContext context) {
    return true;
  }
  
  public boolean hasChanges(ITrackedProp property, IChangeContext context) {
    return true;
  }
  
  public List getChanges() {
    return null;
  }
  
  public List getChanges(ITrackedProp property) {
    return null;
  }
  
  public List getChanges(IChangeContext context) {
    return null;
  }
  
  public List getChanges(ITrackedProp property, IChangeContext context) {
    return null;
  }
  
  public Set getChangedProperties() {
    return null;
  }
  
  public Set getChangedProperties(IChangeContext context) {
    return null;
  }
  
  public Set getChangeContexts() {
    return null;
  }
  
  public Set getChangeContexts(ITrackedProp property) {
    return null;
  }
}
