package com.vignette.ext.furl.javabean;

import java.io.Serializable;
import java.util.List;

public class MappedUrl implements Serializable {

  public MappedUrl(String url, String id, boolean redirect, boolean externalUrl, boolean staticFileUrl) {
    
  }
  
  public MappedUrl(String url, String id, boolean redirect) {
    this(url, id, redirect, false, false);
  }
  
  public MappedUrl(String url, String id) {
    this(url, id, false, false, false);
  }
  
  public MappedUrl() {}
  
  public boolean isRedirect() {
    return true;
  }
  
  public void setRedirect(boolean redirect) {
    
  }
  
  public boolean isExternalUrl() {
    return true;
  }
  
  public void setExternalUrl(boolean externalUrl) {
    
  }
  
  public boolean isStaticFileUrl() {
    return true;
  }
  
  public void setStaticFileUrl(boolean staticFileUrl) {
    
  }
  
  public String getLinkUrl() {
    return null;
  }
  
  public void setLinkUrl(String linkUrl) {
    
  }
  
  public String getLinkVCMID() {
    return null;
  }
  
  public void setLinkVCMID(String linkVCMID) {
   
  }
  
  public List getChildFURLList() {
    return null;
  }
  
  public void setChildFURLList(List childFURLList) {
   
  }
  
  public void addChildFURL(String childFURL) {
   
  }
  
  public String getLinkPageId() {
    return null;
  }
  
  public void setLinkPageId(String linkPageId) {
   
  }
  
  public String getSiteId() {
    return null;
  }
  
  public void setSiteId(String siteId) {
    
  }
}
