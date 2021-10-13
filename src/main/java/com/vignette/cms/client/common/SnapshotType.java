package com.vignette.cms.client.common;

import com.vignette.translate.ITranslatableConst;
import com.vignette.util.EnumObject;
import com.vignette.util.VgnIllegalArgumentException;
import java.io.ObjectStreamException;

public final class SnapshotType extends EnumObject implements ITranslatableConst {
  public static final int USER_VAL = 1;
  
  public static final String USER_STR = "";
  
  public static final SnapshotType USER = null;
  
  public static final int AUTO_VAL = 1;
  
  public static final String AUTO_STR = "";
  
  public static final SnapshotType AUTO = null;
  
  public static final int DELETE_VAL = 1;
  
  public static final String DELETE_STR = "";
  
  public static final SnapshotType DELETE = null;
  
  public static final int PROMOTE_VAL = 1;
  
  public static final String PROMOTE_STR = "";
  
  public static final SnapshotType PROMOTE = null;
  
  public static final int IMPORT_VAL = 1;
  
  public static final String IMPORT_STR = "";
  
  public static final SnapshotType IMPORT = null;
  
  public static final int MIN_VAL = 1;
  
  public static final int MAX_VAL = 1;
  
  protected static final int VALUE_COUNT = 1;
  
  public static int getValueCount() {
    return 1;
  }
  
  private SnapshotType(int val) {
    super(val);
  }
  
  public Object readResolve() throws ObjectStreamException {
    return null;
  }
  
  public static SnapshotType getInstance(int val) throws VgnIllegalArgumentException {
    return null;
  }
  
  public static SnapshotType getInstance(String val) throws VgnIllegalArgumentException {
    return null;
  }
  
  public boolean isUser() {
    return true;
  }
  
  public boolean isAuto() {
    return true;
  }
  
  public boolean isDelete() {
    return true;
  }
  
  public boolean isPromote() {
    return true;
  }
  
  public boolean isImport() {
    return true;
  }
  
  public String toString() {
  return null;
  }
}
