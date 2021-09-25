package com.vignette.logging;

import com.vignette.util.IVgnErrorCode;
import com.vignette.util.MsgObject;
import com.vignette.util.VgnException;

public class VgnLoggedException extends VgnException {
  protected VgnLoggedException(IVgnErrorCode code, Object src, MsgObject msgObj, Throwable ex) {
   
  }
  
  protected VgnLoggedException(IVgnErrorCode code, Object src, MsgObject msgObj, Throwable ex, Priority priority) {
    
  }
  
  public IVgnErrorCode getErrorCode() {
    return null;
  }
  
  protected IVgnErrorCode getUnknownErrorCode() {
    return null;
  }
  
  protected MsgObject getMsgObject(String msgId, String msg) {
    return null;
  }
  
  public static MsgObject simpleMsgObject(String msg) {
    return null;
  }
}
