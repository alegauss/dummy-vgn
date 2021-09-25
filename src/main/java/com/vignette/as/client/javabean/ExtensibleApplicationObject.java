package com.vignette.as.client.javabean;

import com.vignette.as.client.common.AppObjectId;
import com.vignette.as.client.common.ApplicationObjectData;
import com.vignette.as.client.common.AttributeData;
import com.vignette.as.client.common.AttributeDefinitionData;
import com.vignette.as.client.common.ManagedObjectWorkflowMode;
import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.sdo.ManagedObjectMapData;
import java.io.Serializable;
import java.util.List;

public abstract class ExtensibleApplicationObject extends ExtensibleObject implements IApplicationObject, Serializable {
  
  protected ApplicationObjectData data;
  
  protected AppObjectId id;
  
  protected ExtensibleApplicationObject(ApplicationObjectData data) {
  }
  
  protected abstract Class getDataObjectClass();
  
  protected void invalidate() {}
  
  public ApplicationObjectData getBaseData() {
    return null;
  }
  
  protected void setMap(ManagedObjectMapData map) {
  }
  
  public void setData(ApplicationObjectData data) {
  }
  
  public AppObjectId getId() {
    return null;
  }
  
  protected void setId(AppObjectId objectId) {

  }
  
  protected void refresh(ManagedObject obj) throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  public ObjectTypeRef getObjectTypeRef() throws ApplicationException {
    return null;
  }
  
  public AttributeData[] getPrimaryKeys() throws ApplicationException {
    return null;
  }
  
  public ManagedObjectRef getManagedObjectRef() throws ApplicationException {
    return null;
  }
  
  public boolean equals(Object obj) {
    return true;
  }
  
  public AttributeData getAttribute(String name) throws ApplicationException {
    return null;
  }
  
  public AttributeData getAttribute(AttributeDefinitionData attrDef) throws ApplicationException {
    return null;
  }

  public AttributeData[] getAttributes() throws ApplicationException {
    return null;
  }
  
  public String[] getAttributeNames() throws ApplicationException {
    return null;
  }
  
  public void setAttribute(AttributeData attribute) throws ApplicationException {
  }
  
  public String getName() throws ApplicationException {
    return null;
  }
  
  protected Class getLogicInterface() {
    return null;
  }
  
  protected List getApprovalRequiredProperties() {
    return null;
  }
  
  public ManagedObjectWorkflowMode getDefaultUpdateWorkflowMode() {
    return null;
  }
  
  protected List getWorkflowRequiredProperties() {
    return null;
  }
}
