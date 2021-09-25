package com.vignette.as.client.common;

import com.vignette.as.client.common.ref.AsLocaleRef;
import com.vignette.as.client.common.ref.ChannelRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.javabean.ContentInstance;
import java.io.Serializable;

public class ChannelLocalizedData extends ApplicationObjectData implements Serializable {
  
  public ChannelLocalizedData() {
  }
  
  public ChannelRef getChannelRef() {
    return null;
  }
  
  public void setChannelRef(ChannelRef channelRef) {
  }
  
  public AsLocaleRef getLocale() {
    return null;
  }
  
  public void setLocale(AsLocaleRef locale) {
  }
  
  public boolean getActive() {
    return true;
  }
  
  public void setActive(boolean active) {
  }
  
  public String getName() {
    return null;
  }
  
  public void setName(String name) {
  }
  
  public String getFurlName() {
    return null;
  }
  
  public void setFurlName(String furlName) {
  
  }
  
  public ContentInstance getDescriptor() {
    return null;
  }
  
  public void setDescriptor(ContentInstance descriptor) throws ApplicationException {
  
  }
  
  public String getDescriptorXml() {
    return null;
  }
  
  public void setDescriptorXml(String descriptorXml) {
   
  }
}
