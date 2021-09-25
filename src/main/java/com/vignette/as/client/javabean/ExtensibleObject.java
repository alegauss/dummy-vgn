package com.vignette.as.client.javabean;

import com.vignette.as.client.common.AttributeData;
import com.vignette.as.client.common.AttributeDefinitionData;
import com.vignette.as.client.common.ITrackedProp;
import com.vignette.as.client.common.LOBAttributeData;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.sdo.ExtensibleObjectAttributesData;
import java.io.Serializable;
import java.util.List;

public abstract class ExtensibleObject extends ManagedObject implements Serializable {
  public static final int AS_MAX_NUMBER_EXTENSIBLE_ATTRIBUTES = 10;
  
  public boolean persistsExtensibleObjectAttributes() {
    return true;
  }
  
  public ManagedObjectVCMRef getExtensibleAttributesRecordId() {
    return null;
  }
  
  public String getExtensibleAttributesInternalKey() {
    return null;
  }
  
  public void setAttribute(AttributeData attrData) throws ApplicationException {
    
  }
  
  protected ExtensibleObjectAttributesData getAttrs() {
    return null;
  }
  
  protected void setAttrs(ExtensibleObjectAttributesData attrs) {
   
  }
  
  public ExtensibleObjectAttributesData getExtensibleAttributes() throws ApplicationException {
    return null;
  }
  
  public void setExtensibleAttributes(ExtensibleObjectAttributesData attrs) throws ApplicationException {
   
  }
  
  protected void refresh(ManagedObject obj) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public static String getMethodName(AttributeDefinitionData attr) throws ApplicationException {
    return null;
  }
  
  protected Class getLogicInterface() {
    return null;
  }
  
  protected void locateLOBAttributeData(LOBAttributeData attr, AttributedObject relation) throws ApplicationException {
   
  }
  
  protected List getApprovalRequiredProperties() {
    return null;
  }
  
  protected List getWorkflowRequiredProperties() {
    return null;
  }
  
  protected List<ITrackedProp> getAdhocReferenceAttributeProperties() {
    return null;
  }
  
  protected List<ITrackedProp> getExtensibleAttributeProperties() {
    return null;
  }
}
