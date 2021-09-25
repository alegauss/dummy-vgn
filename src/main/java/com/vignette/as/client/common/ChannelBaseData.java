package com.vignette.as.client.common;

import com.vignette.as.client.common.ref.ChannelRef;
import java.io.Serializable;

public class ChannelBaseData extends ChannelBaseDataBase implements Serializable {
  
  public void deleteActive() {
  }
  
  public void deleteOrderAsSibling() {
    
  }
  
  public boolean getActive() {
    return true;
  }
  
  public String getDescription() {
    return null;
  }
  
  public String getDescriptorXml() {
    return null;
  }
  
  public boolean getHideMissingFormats() {
    return true;
  }
  
  public boolean getHideMissingLocales() {
    return true;
  }
  
  public String getName() {
    return null;
  }
  
  public int getOrderAsSibling() {
    return 1;
  }
  
  public String getPageRef() {
    return null;
  }
  
  public ChannelRef getParentChannelRef() {
    return null;
  }
  
  public String getWrapperSpec() {
    return null;
  }
  
  public boolean hasActive() {
    return true;
  }
  
  public boolean hasHideMissingFormats() {
    return true;
  }
  
  public boolean hasHideMissingLocales() {
    return true;
  }
  
  public boolean hasOrderAsSibling() {
    return true;
  }
  
  public void setActive(boolean active) {
  }
  
  public void setDescription(String description) {
  }
  
  public void setDescriptorXml(String descriptorXml) {
  }
  
  public void setHideMissingFormats(boolean hideMissingFormats) {
  }
  
  public void setHideMissingLocales(boolean hideMissingLocales) {
  }
  
  public void setName(String name) {
  }
  
  public void setOrderAsSibling(int orderAsSibling) {
  }
  
  public void setPageRef(String pageRef) {
  }
  
  public void setParentChannelRef(ChannelRef parentChannelRef) {
  }
  
  public void setWrapperSpec(String wrapperSpec) {
  }
}
