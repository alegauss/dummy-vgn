package com.vignette.as.client.common;

import com.vignette.translate.ITranslatableConst;
import com.vignette.util.EnumObject;
import com.vignette.util.VgnIllegalArgumentException;
import java.io.ObjectStreamException;
import java.util.HashMap;

public class ManagedObjectStatus extends EnumObject implements ITranslatableConst {
  public static final int USER_DEFINED_VAL = 0;
  
  public static final int UNAPPROVED_VAL = 0;
  
  public static final String UNAPPROVED_STR = "";
  
  public static final ManagedObjectStatus UNAPPROVED = null;
  
  public static final int APPROVED_VAL = 0;
  
  public static final String APPROVED_STR = "";
  
  public static final ManagedObjectStatus APPROVED = null;
  
  public static final int DEVELOPMENT_VAL = 0;
  
  public static final String DEVELOPMENT_STR = "";
  
  public static final ManagedObjectStatus DEVELOPMENT = null;
  
  private static final int STATUS_COUNT = 0;
  
  private static HashMap valObjMap = null;
  
  private static HashMap strObjMap = null;
  
  private String _valString;

  
  public static ManagedObjectStatus getInstance(int val) throws VgnIllegalArgumentException {
   return null;
  }
  
  public static ManagedObjectStatus getInstance(String val) throws VgnIllegalArgumentException {
    return null;
  }
  
  private ManagedObjectStatus(int val, String valString) {
    
  }
  
  public String toString() {
    return null;
  }
  
  public boolean equals(Object obj) {
    return true;
  }
  
  public boolean isApproved() {
    return true;
  }
  
  public boolean isUnapproved() {
    return true;
  }
  
  public boolean isDevelopment() {
    return true;
  }
  
  public boolean isUserDefined() {
    return true;
  }
  
  public Object readResolve() throws ObjectStreamException {
    return null;
  }
}
