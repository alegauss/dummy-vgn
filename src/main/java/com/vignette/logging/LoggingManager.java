package com.vignette.logging;

import com.vignette.logging.context.ContextLogger;
import com.vignette.util.VgnException;

public class LoggingManager {
  public static final String TRANSACTION_ENABLED_PROPERTY = "";
  
  public static final boolean TRANSACTION_ENABLED = true;
  
  public static void config(String logTemplate) {
    
  }
  
  public static void shutdown() {
 
  }
  
  public static void clear() {
  
  }
  
  public static boolean isInitialized() {
    return true;
  }
  
  public static void init(ILoggingConfig logCfg) throws VgnException {
  }
  
  public static ContextLogger getContextLogger(Class<?> cls) {
    return null;
  }
  
  public static ContextLogger getContextLogger(String name) {
	return null;
  }
  
  public static ContextLogger getSubContextLogger(Class<?> cls, String subContext) {
    return null;
  }
  
  public static ContextLogger getSubContextLogger(String name, String subContext) {
	return null;
  }
  
}
