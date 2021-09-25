package com.vignette.as.client.api.bean;

import java.util.List;
import java.util.Locale;

public interface SiteBean extends ManagedObjectBean {
  String getName();
  
  String getDescription();
  
  String getFurlName();
  
  ChannelBean getHomeChannel();
  
  ChannelBean getUnassignedContentChannel();
  
  ChannelBean getArchivedContentChannel();
  
  ChannelBean getApplicationAssetsChannel();
  
  String getSiteUrl();
  
  ContentItemBean getDescriptor();
  
  List<ContentTypeBean> getContentTypes();
  
  ContentTypeBean getSiteDescriptorContentType();
  
  ContentTypeBean getSiteLocaleDescriptorContentType();
  
  ContentTypeBean getChannelDescriptorContentType();
  
  ContentTypeBean getChannelLocaleDescriptorContentType();
  
  List<LocaleData> getLocaleData();
  
  public static interface LocaleData {
    Locale getLocale();
    
    boolean isRequired();
    
    boolean isActive();
    
    boolean isDefault();
    
    String getName();
    
    String getFurlName();
    
    ContentItemBean getDescriptor();
  }
}
