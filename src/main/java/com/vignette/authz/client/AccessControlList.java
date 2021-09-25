package com.vignette.authz.client;

import com.vignette.logging.context.ContextLogger;
import com.vignette.translate.ITranslatableJavaBean;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class AccessControlList implements Serializable, ITranslatableJavaBean {
  protected static ContextLogger log = null;
  
  static final long serialVersionUID = 1L;
  
  static final int VERSION0 = 0;
  
  public boolean equals(Object obj) {
   return true;
  }
  
  public int hashCode() {
    return 1;
  }
  
  public AccessControlEntry[] getEntries() {
   return null;
  }
  
  public void setEntries(AccessControlEntry[] entries) {
  }
  
  public void createEntry(AccessControlEntry entry) {

  }
  
  public void addEntry(AccessControlEntry entry) {

  }
  
  public void removeEntry(AccessControlEntry entry) {

  }
  
  public void removeEntriesForAgent(AuthzAgent agent) {

  }
  
  public void replaceEntry(AccessControlEntry entry) {
  }
  
  public String toString() {
    return null;
  }
  
  private void writeObject(ObjectOutputStream out) throws IOException {
   
  }
  
  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {

  }
}
