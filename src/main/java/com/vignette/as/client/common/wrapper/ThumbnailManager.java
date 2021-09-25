package com.vignette.as.client.common.wrapper;

import com.vignette.as.client.common.ThumbnailFormat;
import com.vignette.as.client.common.ThumbnailSize;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.common.ref.VCMObjectRef;
import com.vignette.util.GUID;
import java.io.Serializable;
import java.util.regex.Pattern;

public class ThumbnailManager {
  
  public static final String THUMBNAIL_CONTEXT = "";
  
  public static final String CACHE_DIRECTIVE = "";
  
  public static final String CLEAR_DIRECTIVE = "";
  
  public static final String URLPATH_SEPARATOR = "";
  
  public static final String SIZEFORMAT_SEPARATOR = "";
  
  public static final String REFRESH_OPTION = "";
  
  public static final String THUMBNAIL_SIZE_REGEX = null;
  
  public static final String THUMBNAIL_FORMAT_REGEX = null;
  
  public static final String GUID_REGEX = "";
  
  public static final String SIZEFORMAT_SEPARATOR_REGEX = "";
  
  public static class Uri implements Serializable {

    public GUID getGuid() {
      return null;
    }
    
    protected void setGuid(GUID guid) {
      
    }
    
    private ThumbnailSize size = ThumbnailSize.DEFAULT;
    
    public ThumbnailSize getSize() {
        return null;
    }
    
    public void setSize(ThumbnailSize size) {
     
    }
    

    public ThumbnailFormat getFormat() {
        return null;
    }
    
    public void setFormat(ThumbnailFormat format) {
     }
    
    boolean direct = false;
    
    public boolean isDirect() {
        return true;
    }
    
    public void setDirect(boolean direct) {
    
    }
    
    boolean dynamic = true;
    
    public boolean isDynamic() {
        return true;
    }
    
    public void setDynamic(boolean dynamic) {
     
    }
    
    private Uri(GUID guid, ThumbnailSize size, ThumbnailFormat format, boolean direct) {
    }
    
    public static Uri get(GUID guid, ThumbnailSize size, ThumbnailFormat format) {
        return null;
    }
    
    public static Uri get(ThumbnailClass type, ThumbnailSize size, ThumbnailFormat format) {
        return null;
    }
    
    public static final String REGEX = "";
    
    public static final Pattern PATTERN = Pattern.compile(REGEX, 2);
    
    public static Uri fromString(String uriString) {
        return null;
    }
    
    public String getPrefix() {
        return null;
    }
    
    public String getUri() {
        return null;
    }
    
    public String toString() {
        return null;
    }
    
    public boolean equals(Object that) {
        return true;
    }
  }
  
  public static final String CLEAR_REGEX = "";
  
  public static ThumbnailManager getInstance() {
    return null;
  }
  
  public String getUri(WrappedFile wrappedFile, String sizeString, String extension) {
    return null;
  }
  
  public String getUri(WrappedFile wrappedFile, ThumbnailSize size, ThumbnailFormat format) {
    return null;
  }
  
  public Uri getUriPrefix(VCMObjectRef vcmRef, ObjectTypeRef otRef) {
    return null;
  }
  
  public static final Pattern CLEAR_PATTERN = null;
  
  public static boolean isClearDirective(String uriString) {
    return true;
  }
  
   protected static void assertNotNull(Object o, String name) {
  }
  
}
