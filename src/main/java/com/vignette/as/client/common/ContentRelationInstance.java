package com.vignette.as.client.common;

import com.vignette.as.client.common.ref.AttributeDataRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.javabean.AttributedObject;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.List;


public class ContentRelationInstance extends AttributedObject implements Serializable {
  
  public ContentRelationInstance() {
  }
  
  public ContentRelationInstance(ObjectTypeRef ref) {
  }
  
  public AttributeData getAttribute(String name) throws ApplicationException {
    return null;
  }
  
  public Object getAttributeValue(String name) throws ApplicationException {
    return null;
  }
  
  public AttributeData[] getAttributes() throws ApplicationException {
    return null;
  }
  
  public String[] getAttributeNames() throws ApplicationException {
    return null;
  }
  
  public void setAttribute(AttributeData attrData) throws ApplicationException {
  }
  
  public void setAttribute(AttributeDefinitionData attrDef, Object value) throws ApplicationException {
   
  }
  
  public void setAttributeValue(String name, Object value) throws ApplicationException {

  }
  
  public void setAttributeValue(AttributeDefinitionData attrDef, Object value) throws ApplicationException {
  }
  
  public void setAttributes(AttributeData[] attributes) throws ApplicationException {
  }
  
  public AppObjectId getRelationId() throws ApplicationException {
    return null;
  }
  
  public AttributedObject getRelationInstance(AppObjectId id) throws ApplicationException {
    return null;
  }
  
  public Boolean isExtensibleOnly() throws ApplicationException {
    return null;
  }
  
  public String getRelationIdentity() throws ApplicationException {
    return null;
  }
  
  public static String formatRelationIdentity(String relationName, Object[] keyValues) {
    return null;
  }
  
  public AttributedObject getRelationInstance(String identity) throws ApplicationException {
    return null;
  }
  
  public void setObjectTypeRef(ObjectTypeRef ref) {
  }
  
  public ObjectTypeRef getObjectTypeRef() {
    return null;
  }
  
  public AttributedObject[] getRelations(String name) {
    return null;
  }
  
  public Hashtable getAllRelations() {
    return null;
  }
  
  public void setAllRelations(Hashtable relations) {

  }
  
  public String[] getRelationNames() {
    return null;
  }
  
  public void setRelations(String name, AttributedObject[] relation) {
  }
  public ReferenceValueData[] getReferences() throws ApplicationException {
    return null;
  }
  
  public AttributeData[] getRelationKeyAttributes() throws ApplicationException {
    return null;
  }
  
  public AttributeData[] getParentRelationKeyAttributes() throws ApplicationException {
    return null;
  }
  
  public String getRelationName() {
    return null;
  }
  
  public void setRelationName(String value) {
  }
  
  public static ContentRelationInstance clone(ContentRelationInstance source) throws ApplicationException {
    return null;
  }
  
  public ContentRelationInstance clone(boolean includeKeys) throws ApplicationException {
    return null;
  }
  
  public void restoreBackup() throws ApplicationException {
   
  }
  
  public void restoreFromCopy(AttributedObject copy) throws ApplicationException {
  
  }
  
  public static boolean relationIdsEqual(Hashtable relations0, Hashtable relations1) {
    return true;
  }
  
  public List<AttributeDataRef> getAttributeDataRefs(ManagedObjectVCMRef movr, List<AttributeDataRef> list, AcceptableAttribute filter) throws ApplicationException {
    return null;
  }
}
