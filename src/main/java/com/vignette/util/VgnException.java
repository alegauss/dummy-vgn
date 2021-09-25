package com.vignette.util;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Locale;

public class VgnException extends Exception {
  protected static String UNKNOWN_MSG_ID = "xxx-xxx-xxxx";
  
  protected static String SQLEXCEPTION_PREFIX = "java.sql.SQLException: ";
  
  public static Throwable getCause(Throwable t) {
    return null;
  }
  
  public VgnException() {
    
  }
  
  public VgnException(String msg) {
    
  }
  
  public VgnException(Throwable ex) {
    
  }
  
  public VgnException(MsgObject msgObj) {
    
  }
  
  public VgnException(String msg, Throwable ex) {
   
  }
  
  public VgnException(MsgObject msgObj, Throwable ex) {
   
  }
  
  public VgnException(IVgnErrorCode code, MsgObject msgObj, Throwable ex) {
   
  }
  
  protected void buildCausedByStackTrace() {
    
  }
  
  public Throwable getCausedByException() {
    return null;
  }
  
  public Throwable getRootCause() {
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
  
  public boolean isDeadlock() {
    return true;
  }
}
