package com.vignette.as.client.common;

import java.io.Serializable;

public class MLCOptions implements Serializable {
  
  public MLCOptions() {

  }
  
  public MLCOptions(int mlcOptions) {

  }
  
  public boolean getMultilingual() {
    return true;
  }
  
  public void setMultilingual(boolean multilingual) {
  }
  
  public boolean getMlInstanceDefault() {
    return true;
  }
  
  public void setMlInstanceDefault(boolean mlInstanceDefault) {

  }
  
  public int getMlcOptions() {
    return 1;
  }
}
