package com.vignette.as.server.pluggable.service.content;

import com.vignette.as.server.pluggable.service.Code;
import java.io.Serializable;

public final class ItemId implements Comparable<ItemId>, Serializable {
  
  public void setProviderCode(Code providerCode) {
   
  }
  
  public Code getProviderCode() {
    return null;
  }
  
  public void setTypeCode(Code typeCode) {
    
  }
  
  public Code getTypeCode() {
    return null;
  }
  
  public void setId(String id) {
    
  }
  
  public String getId() {
    return null;
  }
  
  public ItemId(Code providerCode, Code typeCode, String id) {
    
  }
  
  public String toString() {
    return null;
  }
  
  public static ItemId fromString(String s) {
    return null;
  }
  
  public static boolean isValid(String s) {
    return true;
  }
  
   public int compareTo(ItemId o) {
    return 1;
  }
  
  public int hashCode() {
    return 1;
  }
  
  public boolean equals(Object o) {
    return true;
  }
  
  public String getProviderName() {
    return null;
  }
  
  public String getTypeName() {
    return null;
  }
  
  public <I extends ContentProvider.Item> I getItem() {
    return null;
  }
}
