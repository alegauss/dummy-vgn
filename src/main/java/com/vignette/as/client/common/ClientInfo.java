package com.vignette.as.client.common;

import com.vignette.as.client.common.ref.ChannelRef;
import com.vignette.as.client.common.ref.SiteRef;
import java.io.Serializable;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;

public class ClientInfo implements Serializable {
  public static final String DELIVERY_CHANNEL_WEB = "";
  
  public ClientInfo() {}
  
  public ClientInfo(ClientInfo Info) {
  
  }
  
  public ClientInfo(String VisitorId, String IPaddress, String BrowserInfo, String SessionId) {
    
  }
  
  public ClientInfo(String VisitorId, String IPaddress, String BrowserInfo, String SessionId, ChannelRef channelRef, SiteRef siteRef, String Region) {
   
  }
  
  public ClientInfo(HttpServletRequest Request) {
   
  }
  
  public ClientInfo(HttpServletRequest Request, ChannelRef channelRef, SiteRef siteRef, String Region) {
   
  }
  
  
  public static void setVisitorIdMechanisms(String[] VisitorIdLocations) {
   
  }
  
  public void setVisitorId(String VisitorId) {
    
  }
  
  public String getVisitorId() {
    return null;
  }
  
  public void setIPaddress(String IPaddress) {
  }
  
  public String getIPaddress() {
    return null;
  }
  
  public void setBrowserInfo(String BrowserInfo) {
  }
  
  public String getBrowserInfo() {
    return null;
  }
  
  public void setSessionId(String SessionId) {
  }
  
  public String getSessionId() {
    return null;
  }
  
  public void setChannel(ChannelRef channelRef) {
  }
  
  public void setChannelGUID(String channelGUID) {
  }
  
  public String getChannelGUID() {
    return null;
  }
  
  public void setSite(SiteRef siteRef) {}
  
  
  public void setSiteGUID(String siteGUID) {
    
  }
  
  public String getSiteGUID() {
    return null;
  }
  
  public void setRegion(String Region) {
   
  }
  
  public String getRegion() {
    return null;
  }
  
  public void setContext(HashMap Context) {
      }
  
  public HashMap getContext() {
    return null;
  }
}
