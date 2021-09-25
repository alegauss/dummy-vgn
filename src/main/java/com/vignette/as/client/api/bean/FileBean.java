package com.vignette.as.client.api.bean;

import java.util.Date;

public interface FileBean extends ContentItemBean {
  String getDescription();
  
  String getPlacementPath();
  
  String getDirectory();
  
  String getFileName();
  
  String getFileNameBase();
  
  String getFileNameExtension();
  
  String getDeploymentType();
  
  Date getFileModificationTime();
  
  long getFileSize();
}
