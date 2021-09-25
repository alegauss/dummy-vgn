package com.vignette.as.server.pluggable.service;

import com.vignette.config.client.common.IConfigurable;
import com.vignette.config.client.common.IConfigurableProperties;

public interface Provider<T extends Provider.Properties> extends IConfigurable<T> {
  T getProperties(java.util.Properties paramProperties);
  
  void init(T paramT);
  
  boolean testConnection();
  
  public static interface Properties extends IConfigurableProperties {
    public static final String NAME_PROPERTY = "NAME";
    
    public static final String CLASSNAME_PROPERTY = "CLASSNAME";
    
    public static final String CODE_PROPERTY = "CODE";
    
    String getName();
    
    String getClassName();
    
    Code getCode();
  }
}
