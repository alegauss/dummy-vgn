package com.vignette.as.client.common;

import com.vignette.util.EnumObject;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class AttributeType extends EnumObject implements Serializable {
  public static final String EXTENSIBLE_STR = "";
  
  public static final String BUSINESS_OBJECT_FIXED_STR = "";
  
  public static final String USER_STR = "";
  
  public static final String INTERNAL_STR = "";
  
  public static final String VIRTUAL_STR = "";
  
  public static final int EXTENSIBLE_VAL = 0;
  
  public static final int BUSINESS_OBJECT_FIXED_VAL = 0;
  
  public static final int USER_VAL = 0;
  
  public static final int INTERNAL_VAL = 0;
  
  public static final int VIRTUAL_VAL = 0;
  
  public static final int MIN_VAL = 0;
  
  public static final int MAX_VAL = 0;
  
  protected static final int PROP_COUNT = 0;
  
  public static final AttributeType EXTENSIBLE = null;
  
  public static final AttributeType BUSINESS_OBJECT_FIXED = null;
  
  public static final AttributeType USER = null;
  
  public static final AttributeType INTERNAL = null;
  
  public static final AttributeType VIRTUAL = null;
  
  public static AttributeType[] ALL = null;
  
  public static AttributeType[] PUBLIC = null;
  
  public static AttributeType[] CLIENT = null;
  
  public static AttributeType[] TOP_RELATION_ONLY = null;
  
  public static AttributeType[] EXTENSIBLE_TYPES = null;
  
  public static AttributeType[] NON_USER_TYPES = null;
  
  protected AttributeType(int v) {

  }
  
  public int getValue() {
    return 0;
  }
  
  public static AttributeType getInstance(int v) {
   return null;
  }
  
  public boolean isExtensible() {
    return true;
  }
  
  public boolean isUser() {
    return true;
  }
  
  public boolean isBusinessObjectFixed() {
    return true;
  }
  
  public boolean isInternal() {
    return true;
  }
  
  public boolean isVirtual() {
    return true;
  }
  
  public String toString() {
    return null;
  }
  
  public Object readResolve() throws ObjectStreamException {
    return null;
  }
}
