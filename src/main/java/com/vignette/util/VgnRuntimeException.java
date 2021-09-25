package com.vignette.util;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Locale;

public class VgnRuntimeException extends RuntimeException {
  protected static String UNKNOWN_MSG_ID = "";

  
  public VgnRuntimeException() {
   
  }
  
  public VgnRuntimeException(String msg) {
    
  }
  
  public VgnRuntimeException(Throwable ex) {
    
  }
  
  public VgnRuntimeException(MsgObject msgObj) {
   
  }
  
  public VgnRuntimeException(IVgnErrorCode code, MsgObject msgObj) {
    
  }
  
  public VgnRuntimeException(IVgnErrorCode code, String msg) {
    
  }
  
  public VgnRuntimeException(String msg, Throwable ex) {
    
  }
  
  public VgnRuntimeException(MsgObject msgObj, Throwable ex) {
    
  }
  
  public VgnRuntimeException(IVgnErrorCode code, String msg, Throwable ex) {
  
  }
  
  public VgnRuntimeException(IVgnErrorCode code, MsgObject msgObj, Throwable ex) {
   
  }
  
  protected void buildCausedByStackTrace() {
   
  }
  
  public Throwable getCausedByException() {
   return null;
  }
  
  public long getTime() {
    return 0L;
  }
  
  public String getMessage() {
    return null;
  }
  
  public String getLocalizedMessage() {
    return null;
  }
  
  public String getLocalizedMessage(Locale loc) {
    return null;
  }
  
  public String getMessage(ClassLoader loader) {
    return null;
  }
  
  public String getLocalizedMessage(ClassLoader loader) {
    return null;
  }
  
  public String getLocalizedMessage(Locale loc, ClassLoader loader) {
    return null;
  }
  
  public MsgObject getMsgObject() {
    return null;
  }
  
  protected MsgObject getMsgObject(String msgId, String msg) {
    return null;
  }
  
  protected void setErrorCode(IVgnErrorCode code) {
      }
  
  public IVgnErrorCode getErrorCode() {
    return null;
  }
  
  protected IVgnErrorCode getUnknownErrorCode() {
    return null;
  }
  
  public void printStackTrace() {
  
  }
  
  public void printStackTrace(PrintStream ps) {
  
  }
  
  public void printStackTrace(PrintWriter pw) {
    
  }
}
