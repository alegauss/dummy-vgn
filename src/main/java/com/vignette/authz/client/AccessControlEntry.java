package com.vignette.authz.client;

import com.vignette.logging.context.ContextLogger;
import com.vignette.translate.ITranslatableJavaBean;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class AccessControlEntry implements Serializable, ITranslatableJavaBean {
  
  
  protected static ContextLogger log = null;
  
  static final long serialVersionUID = 1L;
  
  static final int VERSION0 = 0;
  
  public AccessControlEntry() {}
  
  public boolean equals(Object obj) {
   return true;
  }
  
  public AuthzAgent getAgent() {
    return null;
  }
  
  public Capability[] getGrantedCapabilities() {
    return null;
  }
  
  public boolean isGranted(Capability capability) {
    return true;
  }
  
  public Capability[] getRevokedCapabilities() {
    return null;
  }
  
  public boolean isRevoked(Capability capability) {
    return true;
  }
  
  public AccessControlEntry(AuthzAgent agent, Capability[] granted, Capability[] revoked) {
  }
  
  public void setAgent(AuthzAgent agent) {
   
  }
  
  public void setGrantedCapabilities(Capability[] capabilities) {
  
  }
  
  public void setRevokedCapabilities(Capability[] capabilities) {
  
  }
  
  public int hashCode() {
    return 1;
  }
  
  public String toString() {
    return null;
  }
  
  public void addGrantedCapabilities(Capability[] granted) {
   
  }
  
  public void addRevokedCapabilities(Capability[] revoked) {

  }
  
  public void addGrantedCapability(Capability granted) {
   
  }
  
  public void addRevokedCapability(Capability revoked) {

  }
  
  public void removeGrantedCapabilities(Capability[] granted) {

  }
  
  public void removeRevokedCapabilities(Capability[] revoked) {

  }
  
  public void removeGrantedCapability(Capability granted) {

  }
  
  public void removeRevokedCapability(Capability revoked) {

  }
  
  private void writeObject(ObjectOutputStream out) throws IOException {

  }
  
  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {

  }
}
