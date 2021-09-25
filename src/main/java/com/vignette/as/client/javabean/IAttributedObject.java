package com.vignette.as.client.javabean;

import com.vignette.as.client.common.AttributeData;
import com.vignette.as.client.exception.ApplicationException;
import java.io.Serializable;

public interface IAttributedObject extends Serializable {
  AttributeData getAttribute(String paramString) throws ApplicationException;
  
  void setAttribute(AttributeData paramAttributeData) throws ApplicationException;
  
  void setAttributeValue(String paramString, Object paramObject) throws ApplicationException;
  
  AttributeData[] getAttributes() throws ApplicationException;
  
  void setAttributes(AttributeData[] paramArrayOfAttributeData) throws ApplicationException;
  
  String[] getAttributeNames() throws ApplicationException;
  
  Object getAttributeValue(String paramString) throws ApplicationException;
}
