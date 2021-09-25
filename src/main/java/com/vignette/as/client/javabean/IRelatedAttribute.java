package com.vignette.as.client.javabean;

import com.vignette.as.client.common.AttributeData;
import com.vignette.as.client.exception.ApplicationException;
import java.util.Hashtable;

public interface IRelatedAttribute {
  AttributedObject[] getRelations(String paramString) throws ApplicationException;
  
  Hashtable getAllRelations() throws ApplicationException;
  
  String[] getRelationNames() throws ApplicationException;
  
  void setRelations(String paramString, AttributedObject[] paramArrayOfAttributedObject) throws ApplicationException;
  
  AttributeData[] getRelationKeyAttributes() throws ApplicationException;
  
  AttributeData[] getParentRelationKeyAttributes() throws ApplicationException;
  
  AttributeData[] getAttributes() throws ApplicationException;
}
