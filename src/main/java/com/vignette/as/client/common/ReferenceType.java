package com.vignette.as.client.common;

import com.vignette.util.EnumObject;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;

public class ReferenceType extends EnumObject implements Serializable {
  public static final String CONTENT_TYPE_KEYS_STR = "";
  
  public static final String FILE_PATH_STR = "";
  
  public static final String VCM_GUID_STR = "";
  
  public static final int CONTENT_TYPE_KEYS_VAL = 1;
  
  public static final int FILE_PATH_VAL = 2;
  
  public static final int VCM_GUID_VAL = 3;
  
  public static final int MIN_VAL = 1;
  
  public static final int MAX_VAL = 3;
  
  protected static final int PROP_COUNT = 3;
  
  public static final ReferenceType CONTENT_TYPE_KEYS = null;
  
  public static final ReferenceType FILE_PATH = null;
  
  public static final ReferenceType VCM_GUID = null;
  
  private static HashMap valObjMap = null;
  
  private static HashMap valStrMap = null;

  public ReferenceType() {
  }
  
  protected ReferenceType(int v) {
  }
  
  public int getValue() {
    return 0;
  }
  
  public static ReferenceType getInstance(int v) {
    return null;
  }
  
  public boolean isContentTypeKeys() {
    return true;
  }
  
  public boolean isFilePath() {
    return true;
  }
  
  public boolean isVCMGUID() {
    return true;
  }
  
  public String toString() {
    return null;
  }
  
  public Object readResolve() throws ObjectStreamException {
    return null;
  }
}
