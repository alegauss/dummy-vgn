package com.vignette.authz.client;

import com.vignette.logging.context.ContextLogger;
import com.vignette.translate.ITranslatableJavaBean;
import java.io.Serializable;

public class AuthzAgent implements Serializable, ITranslatableJavaBean {
  public enum Type {
    USER(""),
    GROUP(""),
    ROLE("");
    
    Type(String prefix) {
     
    }
    
    public String toPrefix() {
      return null;
    }
    
    public static Type fromPrefix(String prefix) {
      return null;
    }
  }
  
  public static final AuthzAgent[] EMPTY_AUTHZ_AGENT_ARRAY = null;
  
  protected static final ContextLogger log = null;
  
  static final long serialVersionUID = 1L;
  
  static final int VERSION0 = 0;
  
  public AuthzAgent() {}
  
  public static AuthzAgent createAsUser(String username) {
    return null;
  }
  
  public static AuthzAgent createAsGroup(String groupname) {
    return null;
  }
  
  public static AuthzAgent createAsRole(String rolename) {
    return null;
  }

  public String getName() {
    return null;
  }
  
  public void setName(String name) {
  }
  
  public Type getType() {
    return null;
  }
  
  public boolean isUser() {
    return true;
  }
  
  public boolean isGroup() {
    return true;
  }
  
  public boolean isRole() {
    return true;
  }
  
  public String toString() {
    return null;
  }
  
  public static AuthzAgent fromString(String s) {
    return null;
  }
  
  public boolean equals(Object obj) {
    return true;
  }
  
  public int hashCode() {
    return 0;
  }
  
  public AuthzAgent(String name) {

  }
  
  public AuthzAgent(String name, boolean isuser) {
  }
}
