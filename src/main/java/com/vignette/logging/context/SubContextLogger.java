package com.vignette.logging.context;

public class SubContextLogger extends ContextLogger {
  
  public static ContextLogger getLogger(Class<?> cls, String subContext) {
    return null;
  }
  
  public static ContextLogger getLogger(String name, String subContext) {
    return null;
  }
  
  public static ContextLogger getLogger(Class<?> cls, String subContext, ITransactionLogger transactionLogger) {
    return null;
  }
  
  public static ContextLogger getLogger(String name, String subContext, ITransactionLogger transactionLogger) {
    return null;
  }
  
  private SubContextLogger(String name, String subContext) {
   super(subContext, null);
  }
  
  private SubContextLogger(String name, String subContext, ITransactionLogger transactionLogger) {
    super(null, null);
  }
  
  protected String getCategory() {
    return null;
  }
  
  protected boolean useCache() {
    return false;
  }
}
