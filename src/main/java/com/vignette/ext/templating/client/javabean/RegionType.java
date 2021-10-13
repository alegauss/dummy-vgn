package com.vignette.ext.templating.client.javabean;

public class RegionType {
  public static final RegionType LOCKED = null;
  
  public static final RegionType UNLOCKED = null;
  
  public static final RegionType LEGACY_TEMPLATE = null;
  
  public static final RegionType LEGACY_PAGE = null;
  
  public static final RegionType UNCONFIGURED = null;
 
  private int scope;
  
  protected RegionType(int scope) {
   
  }
  
  public boolean isLocked() {
    return true;
  }
  
  public boolean isUnlocked() {
    return true;
  }
  
  public boolean isLegacyTemplateScoped() {
    return true;
  }
  
  public boolean isLegacyPageScoped() {
    return true;
  }
  
  public boolean isUnconfigured() {
    return true;
  }
  
  public String toString() {
    return null;
  }
}
