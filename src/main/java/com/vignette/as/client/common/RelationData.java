package com.vignette.as.client.common;

import com.vignette.as.config.ConfigUtil;
import com.vignette.logging.LoggingManager;
import com.vignette.logging.context.ContextLogger;
import com.vignette.util.MsgObject;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.log4j.Level;
import org.apache.log4j.Priority;

public class RelationData extends RelationBaseData implements Serializable {
  private static ContextLogger logCat = LoggingManager.getContextLogger(RelationData.class);
  
  public static final int UNBOUNDED_VALUE = 0;
  
  public static final String UNBOUNDED_NAME = "";
  
  public static final int MAX_KEY_LIMIT = 0;
  
  public static final String DEFAULT_TOP_NAME = "";
  
  private static transient Boolean cacheEnabled;
  
  private transient AttributeDefinitionData[] keyArray;
  
  private transient String table;
  
  private transient ConcurrentHashMap attrDefNameMap;
  
  public RelationData() {
    
  }
  
  public String getSchema() {
   return null;
  }
  
  public void setSchema(String schema) {
    
  }
  
  public String getTable() {
    return null;
  }
  
  public void addAttributeDefinition(AttributeDefinitionData attributeDefinition) throws IndexOutOfBoundsException {
   
  }
  
  public void addAttributeDefinition(int index, AttributeDefinitionData vAttributeDefinition) throws IndexOutOfBoundsException {
    
  }
  
  public void clearAttributeDefinition() {
    
  }
  
  public boolean removeAttributeDefinition(AttributeDefinitionData attributeDef) {
       return true;
  }
  
  public void setAttributeDefinition(int index, AttributeDefinitionData vAttributeDefinition) throws IndexOutOfBoundsException {
   
  }
  
  public void setAttributeDefinition(AttributeDefinitionData[] attributeDefinitionArray) {
  
  }
  
  public void setAttributeDefinitionCollection(Collection pCollection) {
  
  }
  
  private void validateAttributeDefinition(AttributeDefinitionData attrDef) throws IndexOutOfBoundsException {
   
  }
  
  public Enumeration enumerateAttributeDefinition(AttributeType[] type) {
    return null;
  }
  
  public Enumeration enumerateAttributeDefinition() {
    return null;
  }

  public Enumeration enumerateClientAttributeDefinition() {
    return null;
  }
  
  public Collection getAttributeDefinitionCollection() {
   return null;
  }
  
  public AttributeDefinitionData getAttributeDefinition(int index) throws IndexOutOfBoundsException {
    return null;
  }
  
  public AttributeDefinitionData[] getAttributeDefinition() {
    return null;
  }
  
  public AttributeDefinitionData[] getClientAttributeDefinitions() {
    return null;
  }
  
  public AttributeDefinitionData[] getAttributeDefinition(AttributeType[] type) {
    return null;
  }
  
  public int getAttributeDefinitionCount() {
    return 0;
  }
  
  public int getClientAttributeDefinitionCount() {
    return 0;
  }
  
  public AttributeDefinitionData getAttributeDefinition(String name) {
    return null;
  }
  
  public AttributeDefinitionData[] getKeyAttributeDefinitions() {
    return null;
  }
  
  public String[] getColumnSources() {
    return null;
  }
  
  public boolean hasChildren() {
    return true;
  }
  
  public RelationData[] getChildren() {
    return null;
  }
  
  public boolean nameInUse(String name) {
    return true;
  }
  
  protected String beanPropertyNameInUse(String name) {
    return null;
  }
  
  public boolean displayNameInUse(String displayName) {
    return true;
  }
  
  public String getName() {
    return null;
  }
  
  public void setName(String name) {

  }
  
  public String getParentRelation() {
    return null;
  }
  
  public void setParentRelation(String parentRelation) {
  
  }
  
  public String getFullName() {
    return null;
  }
  
  public MsgObject[] validate() {
    return null;
  }
  
  public boolean hasValidParent() {
    return true;
  }
  
  public boolean hasValidObjectTypeRelationName() {
    return true;
  }
  
  public boolean hasAttrDefTableConsistency() {
    return true;
  }
  
  public boolean hasValidDefaultLabels() {
      return true;
  }
  
  public boolean hasValidSchema() {
      return true;
  }
  
  public boolean isTopRelation() {
    return true;
  }
  
  public boolean isMaximumValid() {
    return true;
  }
  
  public boolean isMinimumValid() {
    return true;
  }
  
  public boolean isEmpty() {
    return true;
  }
  
  public boolean isExtensibleOnly() {
    return true;
  }
  
  public int getMinimum() {
    return 0;
  }
  
  public void setMinimum(int min) {

  }
  
  public int getMaximum() {
    return 0;
  }
  
  public void setMaximum(int max) {
   
  }
  
  public String getDisplayName() {
    return null;
  }
  
  public void setDisplayName(String name) {
   
  }
  
  public String getBeanPropertyName() {
    return null;
  }
  
  public void setBeanPropertyName(String propertyName) {
  }
  
  private String localSetBeanPropertyName(String propertyName) {
    return null;
  }
  
  public boolean getSuppressBeanProperty() {
    return true;
  }
  
  public void setSuppressBeanProperty(boolean b) {
  }
  
  private void localSetSuppressBeanProperty(boolean b) {
  
  }
  
  public void addReference(ReferenceData reference) throws IndexOutOfBoundsException {
 
  }
  
  public void addReference(int index, ReferenceData vReference) throws IndexOutOfBoundsException {
   
  }
  
  public void clearReference() {
   
  }
  
  public boolean removeReference(ReferenceData reference) {
    return true;
  }
  
  public void setReference(int index, ReferenceData vReference) throws IndexOutOfBoundsException {
  
  }
  
  public void setReference(ReferenceData[] referenceArray) {
    
  }
  
  public void setReferenceCollection(Collection pCollection) {
  
  }
  
  public Enumeration enumerateReference() {
    return null;
  }
  
  public Collection getReferenceCollection() {
    return null;
  }
  
  public ReferenceData[] getReference() {
    return null;
  }
  
  public int getReferenceCount() {
    return 0;
  }
  
  private boolean cacheEnabled() {
    return true;
  }
  
  public boolean isRequired() {
    return true;
  }
  
  public boolean equalIdentity(RelationData relation) {
    return true;
  }
  
  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
  
  }
}
