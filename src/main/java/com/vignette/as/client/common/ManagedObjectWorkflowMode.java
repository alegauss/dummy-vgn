package com.vignette.as.client.common;

import com.vignette.util.EnumObject;
import java.io.ObjectStreamException;

public class ManagedObjectWorkflowMode extends EnumObject {
  public static final String SUPPRESSED_STR = "Suppressed";
  
  public static final String FORCED_STR = "Forced";
  
  public static final String SELECTIVE_STR = "Selective";
  
  public static final int SUPPRESSED_VAL = 0;
  
  public static final int FORCED_VAL = 0;
  
  public static final int SELECTIVE_VAL = 0;
  
  public static final ManagedObjectWorkflowMode SUPPRESSED = null;
  
  public static final ManagedObjectWorkflowMode FORCED = null;
  
  public static final ManagedObjectWorkflowMode SELECTIVE = null;
  
  protected static final int PROP_COUNT = 0;
  
  protected ManagedObjectWorkflowMode(int v) {

  }
  
  public int getValue() {
    return 1;
  }
  
  public static ManagedObjectWorkflowMode getInstance(int v) {
    return null;
  }
  
  public static ManagedObjectWorkflowMode getInstance(String str) {
    return null;
  }
  
  public String toString() {
    return null;
  }
  
  public Object readResolve() throws ObjectStreamException {
    return null;
  }
}
