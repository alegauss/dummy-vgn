package com.vignette.as.common.util.database;

import java.io.Serializable;

public abstract class DBElement implements Serializable {
  public String getName() {
    return null;
  }
  
  public void setName(String name) {
   
  }
  
  public boolean isValid() {
    return true;
  }
  
  public int hashCode() {
    return 1;
  }
}
