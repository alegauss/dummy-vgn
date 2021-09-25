package com.vignette.as.client.javabean;

import com.vignette.as.client.common.AppObjectId;
import com.vignette.as.client.common.AttributeData;
import com.vignette.as.client.common.AttributeDefinitionData;
import com.vignette.as.client.common.DataLocalizer;
import com.vignette.as.client.common.ReferenceValueData;
import com.vignette.as.client.exception.ApplicationException;

public abstract class AttributedObject extends DataLocalizer implements IAttributedObject, IRelatedAttribute {
  
  public abstract void setAttribute(AttributeData paramAttributeData) throws ApplicationException;
  
  public abstract void setAttributeValue(String paramString, Object paramObject) throws ApplicationException;
  
  public abstract void setAttribute(AttributeDefinitionData paramAttributeDefinitionData, Object paramObject) throws ApplicationException;
  
  public abstract void setAttributes(AttributeData[] paramArrayOfAttributeData) throws ApplicationException;
  
  public abstract ReferenceValueData[] getReferences() throws ApplicationException;
  
  public abstract AppObjectId getRelationId() throws ApplicationException;
  
  public abstract AttributedObject getRelationInstance(AppObjectId paramAppObjectId) throws ApplicationException;
  
  public abstract String getRelationIdentity() throws ApplicationException;
  
  public abstract AttributedObject getRelationInstance(String paramString) throws ApplicationException;
  
  public boolean isPendingAdd() {
    return true;
  }
  
  public void setPendingAdd(boolean pendingAdd) {
    
  }
  
  public boolean isPendingEdit() {
    return true;
  }
  
  public void setPendingEdit(boolean pendingEdit) {

  }
  
  public AttributedObject getBackUp() {
    return null;
  }
  
  public void setBackUp(AttributedObject backUp) {
  }
  
  public abstract void restoreBackup() throws ApplicationException;
  
  public static boolean attributeValuesEqual(AttributedObject attrObject0, AttributedObject attrObject1) {
    return true;
  }
  
  public static boolean relationIdsEqual(AttributedObject[] relations0, AttributedObject[] relations1) {
	return true;
  }
}
