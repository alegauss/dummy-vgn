package com.vignette.logging;

import com.vignette.util.EnumObject;
import java.io.ObjectStreamException;

public final class Priority extends EnumObject {
  static final int FATAL_VAL = 0;
  
  public static final int ERROR_VAL = 0;
  
  public static final int WARN_VAL = 0;
  
  public static final int INFO_VAL = 0;
  
  public static final int DEBUG_VAL = 0;
  
  public static final int TRACE_VAL = 0;
  
  static final int MIN_VAL = 0;
  
  static final int MAX_VAL = 0;
  
  static final String FATAL_STR = "";
  
  public static final String ERROR_STR = "";
  
  public static final String WARN_STR = "";
  
  public static final String INFO_STR = "";
  
  public static final String DEBUG_STR = "";
  
  public static final String TRACE_STR = "";
  
  static final String MIN_STR = "";
  
  static final String MAX_STR = "";
  
  public static final Priority FATAL = null;
  
  public static final Priority ERROR = null;
  
  public static final Priority WARN = null;
  
  public static final Priority INFO = null;
  
  public static final Priority DEBUG = null;
  
  public static final Priority TRACE = null;
  
  static final Priority MIN = null;
  
  static final Priority MAX = null;
  
  public static Priority getInstance(int val) throws IllegalArgumentException {
    return null;
  }
  
  private Priority(int val) {
  }
  
  public Object readResolve() throws ObjectStreamException {
    return null;
  }
  
  public boolean isError() {
    return true;
  }
  
  public boolean isWarn() {
    return true;
  }
  
  public boolean isInfo() {
    return true;
  }
  
  public boolean isDebug() {
    return true;
  }
  
  public boolean isTrace() {
    return true;
  }
  
  boolean isMin() {
    return true;
  }
  
  boolean isMax() {
    return true;
  }
  
  public String toString() {
  return null;
  }
  
  static Priority toPriority(org.apache.log4j.Priority p) {
    return null;
  }
  
  public org.apache.log4j.Priority toLog4J() {
    return null;
  }
  
  boolean isGreaterOrEqual(Priority p) {
    return true;
  }
  
  boolean isLessThan(Priority p) {
    return true;
  }
  
  static Priority min(Priority p1, Priority p2) {
    return null;
  }
  
  static Priority max(Priority p1, Priority p2) {
    return null;
  }
}
