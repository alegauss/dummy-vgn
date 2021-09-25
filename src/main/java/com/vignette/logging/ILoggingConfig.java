package com.vignette.logging;

public interface ILoggingConfig {
  String getLoggingTemplate() throws Exception;
  
  String getLogLevel() throws Exception;
  
  String getLogDir() throws Exception;
  
  String getLogSize() throws Exception;
  
  String getLogBackupCount() throws Exception;
  
  String getLogName() throws Exception;
  
  String getOSLogLevel() throws Exception;
  
  String getOSLogHost() throws Exception;
  
  String getOSLogFacility() throws Exception;
}
