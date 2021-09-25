package com.vignette.as.client.common.wrapper;

import com.vignette.translate.ITranslatableConst;
import com.vignette.util.EnumObject;
import com.vignette.util.VgnIllegalArgumentException;
import java.io.ObjectStreamException;

public class WrappedFileType extends EnumObject implements ITranslatableConst {
  private static final long serialVersionUID = 1L;
  
  public static final int THUMBNAIL_VAL = 0;
  
  public static final String THUMBNAIL_STR = "";
  
  public static final WrappedFileType THUMBNAIL = null;
  
  public static final int MEDIA_VAL = 0;
  
  public static final String MEDIA_STR = "";
  
  public static final WrappedFileType MEDIA = null;
  
  public static final int DOWNLOADABLE_VAL = 0;
  
  public static final String DOWNLOADABLE_STR = "";
  
  public static final WrappedFileType DOWNLOADABLE = null;
  
  public static WrappedFileType getInstance(int val) throws VgnIllegalArgumentException {
    return null;
  }
  
  public static WrappedFileType getInstance(String val) throws VgnIllegalArgumentException {
    return null;
  }
  
  private WrappedFileType(int val, String valString) {
    
  }
  
  public boolean isThumbnail() {
    return true;
  }
  
  public boolean isMedia() {
    return true;
  }
  
  public boolean isDownloadable() {
    return true;
  }
  
  public String toString() {
    return null;
  }
  
  public boolean equals(Object obj) {
    return true;
  }
  
  public Object readResolve() throws ObjectStreamException {
    return null;
  }
}
