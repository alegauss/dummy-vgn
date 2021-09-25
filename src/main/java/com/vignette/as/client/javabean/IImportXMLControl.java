package com.vignette.as.client.javabean;

public interface IImportXMLControl extends com.vignette.util.IImportXMLControl {
  void setProcessACLs(boolean paramBoolean);
  
  boolean getProcessACLs();
  
  void setOverwriteContentChannelAssociations(boolean paramBoolean);
  
  boolean getOverwriteContentChannelAssociations();
  
  void setProcessSchedulingDates(boolean paramBoolean);
  
  boolean getProcessSchedulingDates();
  
  void setIgnoreMissingChannels(boolean paramBoolean);
  
  boolean getIgnoreMissingChannels();
  
  boolean getProcessClassifications();
  
  void setProcessClassifications(boolean paramBoolean);
  
  boolean getSuppressWorkflows();
  
  void setSuppressWorkflows(boolean paramBoolean);
  
  boolean getStructuralChangesAllowed();
  
  void setStructuralChangesAllowed(boolean paramBoolean);
  
  boolean getProcessSiteSegmentProfiles();
  
  void setProcessSiteSegmentProfiles(boolean paramBoolean);
}
