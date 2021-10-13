package com.vignette.ext.furl.cache;

import com.vignette.as.client.exception.ApplicationException;

public interface IFriendlyURLLinkPrinterCache {
  void addManualFURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) throws ApplicationException;
  
  void addToChannelBreadCrumbs(String paramString1, String paramString2, String paramString3) throws ApplicationException;
  
  void addToContentNames(String paramString1, String paramString2) throws ApplicationException;
  
  boolean clearChannelBreadCrumb(String paramString) throws ApplicationException;
  
  boolean clearContentName(String paramString);
  
  void clearContentNames();
  
  String getChannelBreadCrumb(String paramString1, String paramString2) throws ApplicationException;
  
  String getContentName(String paramString);
  
  String getManualFURL(String paramString1, String paramString2, String paramString3) throws ApplicationException;
  
  void clearManualFurlsForCIorChannel(String paramString) throws ApplicationException;
  
  void clearManualFurl(String paramString) throws ApplicationException;
}
