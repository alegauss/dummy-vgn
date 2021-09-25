package com.vignette.as.client.common;

public enum ThumbnailSize {
  TINY("", 0),
  XSMALL("", 0),
  SMALL("", 0),
  MEDIUM("", 0),
  LARGE("", 0),
  XLARGE("", 0);
  
  public static final ThumbnailSize DEFAULT = null;
  
  public String getUriString() {
    return null;
  }
  
  
  
  public int getSize() {
    return 0;
  }
  
  
  ThumbnailSize(String uriString, int size) {
    
  }
  
  public static ThumbnailSize fromUriString(String uriString) {
    return null;
  }
}
