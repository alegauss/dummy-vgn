package com.vignette.as.client.common;

import com.vignette.as.client.common.ref.AsLocaleRef;
import com.vignette.as.client.common.ref.ChannelRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.SiteRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.javabean.ContentInstance;
import java.io.Serializable;

public class ChannelData extends ChannelBaseData implements Serializable {
  
  public ChannelData() {
  }
  
  public SiteRef getSiteRef() {
    return null;
  }
  
  public void setSiteRef(SiteRef siteRef) {
  }
  
  public void setActive(boolean active) {

  }
  
  public void setDescription(String description) {
  }
  
  public void setName(String name) {

  }
  
  public void setOrderAsSibling(int orderAsSibling) {
  }
  
  public void setPageRef(String pageRef) {
  }
  
  public void setParentChannelRef(ChannelRef parentChannelRef) {
  }
  
  public void deleteActive() {
  }
  
  public void deleteOrderAsSibling() {

  }
  
  public void setWrapperSpec(String spec) {

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
  
  public void addLocalizedData(ChannelLocalizedData localizedData) {

  }
  
  public void setLocalizedData(ChannelLocalizedData[] localizedData) {

  }
  
  public void removeLocalizedData(AsLocaleRef locale) {

  }
  
  public ChannelLocalizedData getLocalizedData(AsLocaleRef locale) {
    return null;
  }
  
  public ChannelLocalizedData[] getLocalizedData() {
    return null;
 }
  
  public void clearLocalizedData() {

  }
  
  public void setHideMissingFormats(boolean b) {
   
  }
  
  public void addInactiveFormatData(ChannelInactiveFormatAssocData formatData) {

  }
  
  public void removeInactiveFormatData(ManagedObjectVCMRef formatId) {

  }
  
  public ChannelInactiveFormatAssocData getInactiveFormatData(ManagedObjectVCMRef formatId) {
    return null;
  }
  
  public ChannelInactiveFormatAssocData[] getInactiveFormatData() {
    return null;
  }
  
  public void clearInactiveFormatData() {
  }
  
  public void setInactiveFormatData(ChannelInactiveFormatAssocData[] formatDataArray) {

  }
}
