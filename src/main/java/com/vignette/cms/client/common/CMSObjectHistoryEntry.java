package com.vignette.cms.client.common;

import com.vignette.translate.ITranslatableROJavaBean;
import java.io.Serializable;
import java.util.Date;

public class CMSObjectHistoryEntry implements Serializable, ITranslatableROJavaBean {

  public CMSObjectHistoryEntry(String inUserId, String inOperation, Date inTimestamp, int inModCount) {
   
  }
  
  public String getUserId() {
    return null;
  }
  
  public String getOperation() {
    return null;
  }
  
  public Date getTimestamp() {
    return null;
  }
  
  public int getModCount() {
    return 1;
  }
  
  protected CMSObjectHistoryEntry() {
   
  }
  
  protected void setUserId(String inUserId) {
  
  }
  
  protected void setOperation(String inOperation) {
 
  }
  
  protected void setTimestamp(Date inTimestamp) {
   
  }
  
  protected void setModCount(int inModCount) {
   
  }
  
  public String toString() {
    return null;
  }
  
  public boolean equals(Object obj) {
   
    return true;
  }
}
