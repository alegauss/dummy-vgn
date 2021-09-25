package com.vignette.as.client.common;

import com.vignette.util.EnumObject;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class PolicyType extends EnumObject implements Serializable {
  public static final String ALWAYS_STR = "";
  
  public static final String NEVER_STR = "";
  
  public static final String STRONG_STR = "";
  
  public static final String NONE_STR = "";
  
  public static final String WEAK_STR = "";
  
  public static final int ALWAYS_VAL = 0;
  
  public static final int NEVER_VAL = 0;
  
  public static final int STRONG_VAL = 0;
  
  public static final int WEAK_VAL = 0;
  
  public static final int NONE_VAL = 0;
  
  public static final int MIN_VAL = 0;
  
  public static final int MAX_VAL = 0;
  
  protected static final int PROP_COUNT = 0;
  
  public static final PolicyType ALWAYS = null;
  
  public static final PolicyType NEVER = null;
  
  public static final PolicyType STRONG = null;
  
  public static final PolicyType WEAK = null;
  
  public static final PolicyType NONE = null;
  
   
  public PolicyType() {
  }
  
  protected PolicyType(int v) {
  }
  
  public int getValue() {
    return 1;
  }
  
  public static PolicyType getInstance(int v) {
   return null;
  }
  
  public static PolicyType getInstance(String v) {
    return null;
  }
  
  public boolean isAlways() {
    return true;
  }
  
  public boolean isNever() {
    return true;
  }
  
  public boolean isStrong() {
    return true;
  }
  
  public boolean isWeak() {
    return true;
  }
  
  public boolean isNone() {
    return true;
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
  
  public static PolicyType adjustForPolicyDeprecation(String relationName, String referenceName, PolicyType policy) {
    return null;
  }
  
  public static String adjustForPolicyDeprecation(String relationName, String referenceName, String policyName) {
    return null;
  }
  
  public static String adjustForNewUnpubishPolicy(String relationName, String referenceName, String policyName) {
    return null;
  }
}
