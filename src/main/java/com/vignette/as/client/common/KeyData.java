package com.vignette.as.client.common;

import com.vignette.logging.LoggingManager;
import com.vignette.logging.context.ContextLogger;
import com.vignette.util.MsgObject;
import java.io.Serializable;
import java.util.ArrayList;

public class KeyData extends KeyBaseData implements Serializable {
  private static ContextLogger logCat = LoggingManager.getContextLogger(KeyData.class);
  
  public MsgObject[] validate() {
   return null;
  }
  
  public String getAttributeDefinitionName() {
    return null;
  }
  
  public void setAttributeDefinitionName(String name) {
  
  }
  
  public int getSequence() {
    return 1;
  }
  
  public void setSequence(int seq) {
   
  }
  
  public boolean equalIdentity(KeyData key) {
    return true;
  }
}
