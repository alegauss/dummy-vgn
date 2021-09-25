package com.vignette.as.client.common;

import com.vignette.util.EnumObject;
import java.io.ObjectStreamException;

public class ChangeContext extends EnumObject implements IChangeContext {
  public static final String UNKNOWN_STR = "";
  
  public static final String USER_STR = "";
  
  public static final String SYSTEM_STR = "";
  
  public static final int UNKNOWN_VAL = 0;
  
  public static final int USER_VAL = 0;
  
  public static final int SYSTEM_VAL = 0;
  
  public static final ChangeContext UNKNOWN = null;
  
  public static final ChangeContext USER = null;
  
  public static final ChangeContext SYSTEM = null;
  
  protected static final int PROP_COUNT = 0;
   
  protected ChangeContext(int v) {
    
  }
  
  public int getValue() {
    return 1;
  }
  
  public static ChangeContext getInstance(int v) {
    return null;
  }
  
  public static ChangeContext getInstance(String str) {
    return null;
  }
  
  public String toString() {
    return null;
  }
  
  public Object readResolve() throws ObjectStreamException {
    return null;
  }
}
