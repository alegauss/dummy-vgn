package com.vignette.config.client.common;

public interface IConfigurable<T extends IConfigurableProperties> {
  T getProperties();
  
  void setProperties(T paramT);
}
