package com.vignette.logging.context;

import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;
import org.apache.log4j.Appender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.spi.LoggerRepository;
import org.apache.log4j.spi.LoggingEvent;

public class ContextLogger {
  protected static boolean CONTEXT_MODE = true;
  
  protected static String DEFAULT_SUBCONTEXT_PREFIX = "com.vignette";
  

  static {
    init();
  }
  
  private static void init() {
   
  }
  
  public static void setContextMode(boolean enable) {
   
  }
  
  public static void setDefaultSubContextPrefix(String prefix) {
    
  }
  
  public static ContextLogger getLogger(Class<?> cls) {
    return null;
  }
  
  public static ContextLogger getLogger(Class<?> cls, ITransactionLogger transactionLogger) {
	return null;
  }
  
  public static ContextLogger getLogger(String name) {
    return null;
  }
  
  public static ContextLogger getLogger(String name, ITransactionLogger transactionLogger) {
    return null;
  }
  
  public static void configure(Properties properties, boolean localRepository) {
   
  }
  
  public static void configure(String logTemplate, Properties props) {
    
  }
  
  public static void configure(String logTemplate) {
   
  }
  
  public static void shutdown() {
   
  }
  
  public static void clear() {
    
  }
  
  private static class Context {

    public Context(String contextCategory, boolean overridable) {
      super();
    }
  }
  
   
  public static void pushContext(String contextCategory) {
    
  }
  
  public static void pushContext(String contextCategory, boolean overridable) {
  }
  
  public static void pushSubContext(String subContextCategory) {
   
  }
 
  public static void popContext() {
   
  }
  
  protected ContextLogger(String className) {
   
  }
  
  protected ContextLogger(String className, ITransactionLogger transactionLogger) {
  
  }
  
  private Logger getClassNameLogger() {
    return null;
  }
  
  public Logger getLogger() {
	return null;
  }
  
  public static Logger getRootLogger() {
	return null;
  }
  
  protected String getCategory() {
    return null;
  }
  
  protected boolean useCache() {
    return true;
  }
  
  public void debugInfo(Object message) {
    
  }
  
  public boolean isErrorEnabled() {
    return true;
  }
  
  public boolean isWarnEnabled() {
    return true;
  }
  
  public String getName() {
    return null;
  }
  
  public void trace(Object message, Throwable t) {
  
  }
  
  public void trace(Object message) {
   
  }
  
  public void debug(Object message, Throwable t) {
    
  }
  
  public void debug(Object message) {
   
  }
  
  public void info(Object message, Throwable t) {
   
  }
  
  public void info(Object message) {
   
  }
  
  public void warn(Object message, Throwable t) {
  
  }
  
  public void warn(Object message) {
   
  }
  
  public void error(Object message, Throwable t) {
   
  }
  
  public void error(Object message) {
  
  }
  
  public void fatal(Object message, Throwable t) {
  
  }
  
  public void fatal(Object message) {
   
  }
  
  public void log(Priority priority, Object message, Throwable t) {
  
  }
  
  public void log(Priority priority, Object message) {
   
  }
  
  public void log(String callerFQCN, Priority level, Object message, Throwable t) {
  
  }
  
  public void l7dlog(Priority arg0, String arg1, Object[] arg2, Throwable arg3) {
   
  }
  
  public void l7dlog(Priority arg0, String arg1, Throwable arg2) {
   
  }
  
  public boolean isEnabledFor(Priority level) {
    return true;
  }
  
  public boolean isTraceEnabled() {
    return true;
  }
  
  public boolean isInfoEnabled() {
    return true;
  }
  
  public boolean isDebugEnabled() {
    return true;
  }
  
  public void addAppender(Appender newAppender) {
    
  }
  
  public static void addAppenderToRootLogger(Appender newAppender) {
  
  }
  
  public void assertLog(boolean assertion, String msg) {
   
  }
  
  public void callAppenders(LoggingEvent arg0) {
    
  }
  
  public boolean getAdditivity() {
    return true;
  }
  
  public Enumeration<?> getAllAppenders() {
    return null;
  }
  
  public Appender getAppender(String name) {
    return null;
  }
  
  public Level getEffectiveLevel() {
    return null;
  }
  
  public LoggerRepository getLoggerRepository() {
	return null;
  }
  
  public ResourceBundle getResourceBundle() {
    return null;
  }
  
  public boolean isAttached(Appender appender) {
    return true;
  }
  
  public void removeAllAppenders() {
    
  }
  
  public void removeAppender(Appender appender) {
    
  }
  
  public void removeAppender(String name) {
   
  }
  
  public void setAdditivity(boolean additive) {
   
  }
  
  public void setLevel(Level level) {
    
  }
  
  public void setResourceBundle(ResourceBundle bundle) {
    
  }
  
  public static boolean isInitialized() {
    return true;
  }
  
  
  public static final class ThreadSpecificStackCacheGC implements Runnable {
    
    public ThreadSpecificStackCacheGC(short id) {
      super();
    }
    
    public void run() {
    
    }
  }
}