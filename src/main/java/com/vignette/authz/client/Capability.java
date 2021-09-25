package com.vignette.authz.client;

import com.vignette.logging.context.ContextLogger;
import com.vignette.translate.ITranslatableJavaBean;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Capability implements Serializable, ITranslatableJavaBean, Comparable {
  public static final Capability[] EMPTY_CAPABILITY_ARRAY = new Capability[0];
  
  
  protected int mHash = 0;
  
  protected static ContextLogger log = null;
  
  static final long serialVersionUID = 0L;
  
  static final int VERSION0 = 0;
  
  public Capability() {}
  
  public Capability(String application, String name) {

  }
  
  public void setName(String name) {

  }
  
  public String getName() {
    return null;
  }
  
  public void setApplicationName(String applicationName) {

  }
  
  public String getApplicationName() {
    return null;
  }
  
  public boolean equals(Object obj) {
    return true;
  }
  
  public String toString() {
    return null;
  }
  
  public int hashCode() {
    return 0;
  }
  
  private void writeObject(ObjectOutputStream out) throws IOException {

  }
  
  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {

  }
  
  public int compareTo(Object obj) {
    return 0;
  }
}
