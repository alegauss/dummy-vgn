package com.vignette.as.client.common;

public enum ThumbnailFormat {
  PNG(""),
  JPG(""),
  GIF("");
  
  public static final ThumbnailFormat DEFAULT = null;

  public String getUriString() {
    return null;
  }
  
  ThumbnailFormat(String uriString) {
   
  }
  
  public static ThumbnailFormat fromUriString(String uriString) {
    return null;
  }
}
