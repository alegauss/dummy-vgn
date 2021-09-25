package com.vignette.as.client.api.bean;

import java.util.List;
import java.util.Locale;

public interface ContentItemBean extends ManagedObjectBean {
  SystemMetadata getSystem();
  
  public static interface SystemMetadata extends ManagedObjectBean.SystemMetadata {
    List<ChannelBean> getChannelAssociations();
    
    List<String> getTaxonomyClassifications();
    
    Locale getLocale();
  }
}
