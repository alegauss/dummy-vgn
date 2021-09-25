package com.vignette.as.client.common;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.util.GUID;

public class AppObjectId extends GUID {
  public AppObjectId() {}
  
  public AppObjectId(String id) {
    super(id);
  }
  
  public static AppObjectId generateNew() throws ApplicationException {
   return null;
  }
  
  public void setId(String id) {
  }
}
