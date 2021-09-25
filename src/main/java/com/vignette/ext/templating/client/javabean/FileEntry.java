package com.vignette.ext.templating.client.javabean;

import java.io.Serializable;

public class FileEntry implements Serializable {
  String staticFileId = null;
  
  int seqId = 1;
  
  String friendlyId = null;
  
  String path = null;
  
  public FileEntry(String fileId, int seqId, String friendlyId, String path) {
  
  }
  
  public int getSeqId() {
    return 1;
  }
  
  public void setSeqId(int seqId) {
    
  }
  
  public String getStaticFileId() {
    return null;
  }
  
  public void setStaticFileId(String staticFileId) {
    
  }
  
  public String getFriendlyId() {
    return null;
  }
  
  public void setFriendlyId(String friendlyId) {

  }
  
  public String getPath() {
    return null;
  }
  
  public void setPath(String path) {
  }
}
