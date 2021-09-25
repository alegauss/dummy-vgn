package com.vignette.util;

import java.io.Serializable;

public interface IImportXMLControl extends Serializable {
  void setNamespacePrefix(String paramString);
  
  String getNamespacePrefix();
  
  void setValidate(boolean paramBoolean);
  
  boolean getValidate();
  
  void setVersion(String paramString);
  
  String getVersion();
  
  void setXMLSchemaPath(String paramString);
  
  String getXMLSchemaPath();
}
