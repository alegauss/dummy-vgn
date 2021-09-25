package com.vignette.util;

import java.io.Serializable;

public interface IExportXMLControl extends Serializable {
  void setNamespacePrefix(String paramString);
  
  String getNamespacePrefix();
  
  void setVersion(String paramString);
  
  String getVersion();
}
