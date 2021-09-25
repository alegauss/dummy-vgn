package com.vignette.as.client.api.bean;

import java.util.List;
import java.util.Locale;

public interface ChannelBean extends ManagedObjectBean {
  String getName();
  
  String getDescription();
  
  String getFurlName();
  
  boolean isActive();
  
  ChannelBean getParentChannel();
  
  SiteBean getParentSite();
  
  List<ChannelBean> getBreadcrumbPath();
  
  List<String> getBreadcrumbNamePath();
  
  ContentItemBean getDescriptor();
  
  ChannelBean getRootChannel();
  
  ChannelBean getTopChannel();
  
  List<ChannelBean> getSubChannels();
  
  List<ManagedObjectBean> getNavigationSubChannels();
  
  List<ChannelBean> getActiveSubChannels();
  
  List<ManagedObjectBean> getActiveNavigationSubChannels();
  
  List<ChannelBean> getInactiveSubChannels();
  
  int getSubChannelCount();
  
  int getNavigationSubChannelCount();
  
  int getContentInstanceCount();
  
  int getFileCount();
  
  int getContentAssociationCount();
  
  List<ContentItemBean> getContentInstances();
  
  List<FileBean> getFiles();
  
  List<ContentItemBean> getContentAssociations();
  
  boolean isRootChannel();
  
  List<LocaleData> getLocaleData();
  
  public static interface LocaleData {
    Locale getLocale();
    
    boolean isActive();
    
    String getName();
    
    String getFurlName();
    
    ContentItemBean getDescriptor();
  }
}
