package com.vignette.ext.templating.link;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.javabean.Channel;
import com.vignette.as.client.javabean.Site;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;

public class LinkSpec {
  String context;
  
  String channelId;
  
  String path;
  
  String formatName;
  
  String locale;
  
  String oid;
  
  String primaryObjectName;
  
  String linkUriFrag;
  
  String linkPrefix;
  
  Site currentSite;
  
  Channel currentChannel;
  
  String placementPath;
  
  public String getChannelId() {
    return null;
  }
  
  public void setChannelId(String channelId) {
    
  }
  
  public String getPath() {
    return null;
  }
  
  public void setPath(String path) {
    
  }
  
  public String getFormatName() {
    return null;
  }
  
  public void setFormat(String formatName) {
   
  }
  
  public String getLocale() {
    return null;
  }
  
  public void setLocale(String locale) {
   
  }
  
  public boolean getGenerateFull() {
    return true;
  }
  
  public void setGenerateFull(boolean generateFull) {
    }
  
  public String getOid() {
    return null;
  }
  
  public void setOid(String oid) {
    
  }
  
  public String getAttribute(String attrName) {
    return null;
  }
  
  public void setAttribute(String attrName, String value) {
   
  }
  
  public void removeAttribute(String attrName) {
   
  }
  
  public String[] getAttributeNames() {
    return null;
  }
  
  Hashtable<String, String> getAttributes() {
    return null;
  }
  
  Map<String, String> getAttributesMap() {
    return null;
  }
  
  public String getLinkUriFrag() throws ApplicationException {
    return null;
  }
  
  public void setLinkUriFrag(String linkUriFrag) {

  }
  
  public String getLinkPrefix() {
    return null;
  }
  
  public void setLinkPrefix(String linkPrefix) {
   
  }
  
  public int getTemplateType() {
    return 0;
  }
  
  public void setTemplateType(int templateType) {
    
  }
  
  public String getSite() {
    return null;
  }
  
  public String getSiteName() {
    return null;
  }
  
  public void setVapSite(String vapSite) {
    
  }
  
  public void setSiteName(String siteName) {
    
  }
  
  public String getContext() {
    return null;
  }
  
  public void setContext(String context) {
    
  }
  
  public boolean isOverrideLinkPrinterForRender() {
    return true;
  }
  
  public void setOverrideLinkPrinterForRender(boolean overrideLinkPrinterForRender) {
    
  }
  
  public Site getCurrentSite() {
    return null;
  }
  
  public void setCurrentSite(Site currentSite) {
    
  }
  
  public String getPlacementPath() {
    return null;
  }
  
  public void setPlacementPath(String placementPath) {
    
  }
  
  public boolean isDefaultFileSourceOnly() {
    return true;
  }
  
  public void setDefaultFileSourceOnly(boolean defaultFileSourceOnly) {
    
  }
  
  public boolean isPortalRequest() {
    return true;
  }
  
  public void setPortalRequest(boolean portalRequest) {
    
  }
  
  public Channel getCurrentChannel() {
    return null;
  }
  
  public void setCurrentChannel(Channel currentChannel) {
    
  }
  
  public String getPrimaryObjectName() {
    return null;
  }
  
  public void setPrimaryObjectName(String primaryObjectName) {
    
  }
  
  public Locale getCurrentLocale() {
    return null;
  }
  
  public void setCurrentLocale(Locale currentLocale) {
   
  }
  
  public String getExternalUrl() {
    return null;
  }
  
  public void setExternalUrl(String externalUrl) {
   
  }
  
  public String getStaticFileUrl() {
    return null;
  }
  
  public void setStaticFileUrl(String staticFileUrl) {
    
  }
  
  public Boolean getIncludeContext() {
    return null;
  }
  
  public void setIncludeContext(Boolean includeContext) {
    
  }
  
  public Boolean getIncludeSite() {
    return null;
  }
  
  public void setIncludeSite(Boolean includeSite) {
    
  }
  
  public Boolean getIncludeFormat() {
    return null;
  }
  
  public void setIncludeFormat(Boolean includeFormat) {
    
  }
  
  public Boolean getIncludeLocale() {
    return null;
  }
  
  public void setIncludeLocale(Boolean includeLocale) {
   

  }
  
  public boolean isCrossEnvironmentLink() {
    return true;
  }
  
  public void setCrossEnvironmentLink(boolean crossEnvironmentLink) {
    
  }
  
  public String getExternalItemId() {
    return null;
  }
  
  public void setExternalItemId(String externalItemId) {
    
  }
  
  public String getExternalParentId() {
    return null;
  }
  
  public void setExternalParentId(String externalParentId) {
   
  }
  
  boolean generateFull = false;
  
  boolean defaultFileSourceOnly = true;
  
  boolean isPortalRequest;
  
  int templateType = -1;
  
  String siteName;
  
  Map<String, String> attributes;
  
  boolean overrideLinkPrinterForRender;
  
  Locale currentLocale;
  
  String externalUrl;
  
  String staticFileUrl;
  
  Boolean includeContext;
  
  Boolean includeSite;
  
  Boolean includeFormat;
  
  Boolean includeLocale;
  
  boolean isCrossEnvironmentLink;
  
  String externalItemId;
  
  String externalParentId;
}
