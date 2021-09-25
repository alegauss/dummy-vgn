package com.vignette.config.client.common;

import java.io.Serializable;
import java.util.Map;
import java.util.Properties;

public interface IConfigurableProperties extends Serializable {
  Map<String, PropertyMetadata> getMetadata();
  
  void setProperties(Properties paramProperties);
  
  Properties getProperties();
  
  String getProperty(PropertyMetadata paramPropertyMetadata);
  
  Object setProperty(String paramString1, String paramString2);
}
