package com.vignette.cms.client.common;

import com.vignette.translate.ITranslatableJavaBean;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class CMSObjectNote implements Serializable, ITranslatableJavaBean {
  static final long serialVersionUID = 1L;
  
  static final int VERSION0 = 1;
  
  
  public CMSObjectNote(String userId, Date lastMod, String note) {
   
  }
  
  public CMSObjectNote() {}
  
  public String getUserId() {
    return null;
  }
  
  public void setUserId(String userId) {
    
  }
  
  public Date getLastModifiedDate() {
    return null;
  }
  
  public void setLastModifiedDate(Date date) {
    
  }
  
  public String getNote() {
    return null;
  }
  
  public void setNote(String note) {
   
  }
  
  private void writeObject(ObjectOutputStream out) throws IOException {
   
  }
  
  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
   
  }
  
  public boolean equals(Object obj) {
  
    return true;
  }
  
  public String toString() {
    return null;
  }
}
