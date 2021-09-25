package com.vignette.as.client.sdo;

import com.vignette.util.EnumObject;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class InheritanceLevelType extends EnumObject implements Serializable {
  public static final String INHERIT_ALL_RECURSIVELY_STR = "";
  
  public static final String INHERIT_NONE_STR = "";
  
  public static final int INHERIT_ALL_RECURSIVELY_VAL = 0;
  
  public static final int INHERIT_NONE_VAL = 0;
  
  public static final int MIN_VAL = 0;
  
  public static final int MAX_VAL = 0;
  
  public static final InheritanceLevelType INHERIT_ALL_RECURSIVELY = null;
  
  public static final InheritanceLevelType INHERIT_NONE = null;
  
  protected InheritanceLevelType(int v) {
  }
  
  public int getValue() {
    return 1;
  }
  
  public static InheritanceLevelType getInstance(int v) {
    return null;
  }
  
  public static InheritanceLevelType getInstance(String v) {
    return null;
  }
  
  public boolean isInheritAllRecursively() {
    return true;
  }
  
  public boolean isInheritNone() {
    return true;
  }
  
  public String toString() {
    return null;
  }
  
  public Object readResolve() throws ObjectStreamException {
    return null;
  }
}
