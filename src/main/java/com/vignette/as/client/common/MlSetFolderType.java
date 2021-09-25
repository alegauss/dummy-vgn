package com.vignette.as.client.common;

import com.vignette.util.EnumObject;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;

public class MlSetFolderType extends EnumObject implements Serializable {
  public static final String SHARED_STR = "";
  
  public static final String LANGUAGE_STR = "";
  
  public static final String CUSTOM_STR = "";
  
  public static final int SHARED_VAL = 0;
  
  public static final int LANGUAGE_VAL = 0;
  
  public static final int CUSTOM_VAL = 0;
  
  public static final int MIN_VAL = 0;
  
  public static final int MAX_VAL = 0;
  
  protected static final int PROP_COUNT = 0;
  
  public static final MlSetFolderType SHARED = null;
  
  public static final MlSetFolderType LANGUAGE = null;
  
  public static final MlSetFolderType CUSTOM = null;
  
  public MlSetFolderType() {
  }
  
  protected MlSetFolderType(int v) {
  }
  
  public int getValue() {
    return 1;
  }
  
  public static MlSetFolderType getInstance(int v) {
    return null;
  }
  
  public static MlSetFolderType getInstance(String v) {
    return null;
  }
  
  public String toString() {
    return null;
  }
  
  public String getDisplayName() {
    return null;
  }
  
  public Object readResolve() throws ObjectStreamException {
    return null;
  }
  
  public static ArrayList<MlSetFolderType> getMlSetFolderTypes() {
    return null;
  }
}
