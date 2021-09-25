package com.vignette.as.client.common.wrapper;

import com.vignette.translate.ITranslatableConst;
import com.vignette.util.EnumObject;
import com.vignette.util.VgnIllegalArgumentException;
import java.io.ObjectStreamException;

public class ThumbnailScope extends EnumObject implements ITranslatableConst {
  private static final long serialVersionUID = 1L;
  
  public static final int TYPE_VAL = 0;
  
  public static final String TYPE_STR = "";
  
  public static final ThumbnailScope TYPE = null;
  
  public static final int INSTANCE_VAL = 1;
  
  public static final String INSTANCE_STR = "";
  
  public static final ThumbnailScope INSTANCE = null;
 
  public static ThumbnailScope getInstance(int val) throws VgnIllegalArgumentException {
    return null;
  }
  
  public static ThumbnailScope getInstance(String val) throws VgnIllegalArgumentException {
    return null;
  }
  
  private ThumbnailScope(int val, String valString) {

  }
  
  public boolean isInstance() {
    return true;
  }
  
  public boolean isType() {
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
  
  public static ThumbnailScope[] values() {
    return null;
  }
}
