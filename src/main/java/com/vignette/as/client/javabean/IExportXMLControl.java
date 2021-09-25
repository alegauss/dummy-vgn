package com.vignette.as.client.javabean;

public interface IExportXMLControl extends com.vignette.util.IExportXMLControl {
  void setProcessACLs(boolean paramBoolean);
  
  boolean getProcessACLs();
  
  void setProcessChannelAssocs(boolean paramBoolean);
  
  boolean getProcessChannelAssocs();
  
  void setProcessSchedulingDates(boolean paramBoolean);
  
  boolean getProcessSchedulingDates();
  
  boolean getProcessClassifications();
  
  void setProcessClassifications(boolean paramBoolean);
  
  boolean getProcessSiteSegmentProfiles();
  
  void setProcessSiteSegmentProfiles(boolean paramBoolean);
}
