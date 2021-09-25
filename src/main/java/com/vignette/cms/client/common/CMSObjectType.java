package com.vignette.cms.client.common;

import com.vignette.translate.ITranslatableROJavaBean;
import java.io.ObjectStreamException;
import java.io.Serializable;

public final class CMSObjectType implements Serializable, ITranslatableROJavaBean {

  public static void registerInstance(CMSObjectType type) {
      }
  
  public static void registerInstances(CMSObjectType[] typeArray) {
   
  }
  
  public static CMSObjectType registerInstance(String jndiName, String baseJndiName, String typeCode) {
   return null;
  }
  
  public static void setTypeListProvider(ICMSObjectTypeListProvider provider) {
    
  }
  
  
  public static CMSObjectType getInstance(String jndiName) throws CMSException {
    return null;
  }
  
  public static CMSObjectType getInstanceByTypeCode(String typeCode) throws CMSException {
    return null;
  }
  
  public static int getTypeCount() {
    return 0;
  }
  
  public Object readResolve() throws ObjectStreamException {
    return null;
  }
  public String toString() {
    return null;
  }
  
  public String getJNDIName() {
    return null;
  }
  
  protected void setJNDIName(String jndiName) {
    
  }
  
  public String getBaseJNDIName() {
    return null;
  }
  
  protected void setBaseJNDIName(String jndiName) {
    
  }
  
  public CMSObjectType getBaseType() throws CMSException {
    return null;
  }
  
  public String getTypeCode() {
    return null;
  }
  
  protected void setTypeCode(String typeCode) {
      }
  
  public String getTypeName() {
    return null;
  }
  
  public boolean equals(Object obj) {
    return true;
  }
  
  public boolean isInstanceOf(CMSObjectType baseType) {
    return true;
  }
}
