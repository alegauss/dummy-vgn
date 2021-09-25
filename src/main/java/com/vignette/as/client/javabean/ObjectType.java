package com.vignette.as.client.javabean;

import com.vignette.as.client.common.AttributeDefinitionData;
import com.vignette.as.client.common.ChangeTracker;
import com.vignette.as.client.common.ITrackedProp;
import com.vignette.as.client.common.ObjectTypeData;
import com.vignette.as.client.common.ReferenceData;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.common.ref.VCMObjectRef;
import com.vignette.as.client.ejb.IObjectTypeOps;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.util.MsgObject;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class ObjectType extends ExtensibleApplicationObject implements Serializable {
  public static final String TRANSLATE_WF_SOURCE_LOCALE_PARAMETER = "";
  
  public static final String TRANSLATE_WF_TARGET_LOCALE_PARAMETER = "";
  
  public static final String OBJECT_TYPE_NAME = "";
  
  protected boolean getChangeTrackingDefault() {
    return true;
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
  
  protected List<ITrackedProp> getAdhocReferencePropertyProperties() {
	return null;
  }
  
  public boolean hasStructuralChanges() {
    return true;
  }
  
  public boolean hasReferenceChanges(boolean definiteOnly) {
    return true;  }
  
  public boolean hasDataGeneratorChanges(boolean definiteOnly) {
    return true;  }
  
  public boolean hasDataSourceChanges() {
	return true;  }
  
  public boolean hasXmlNameChanges() {
	return true;  }
  
  public boolean hasAttributeXmlNameChanges() {
	return true;
  }
  
  public boolean hasPrimaryKeyAttributeChanges() {
	return true;
  }
  
  public void commit() throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  public static ObjectTypeRef getTypeObjectTypeRef() {
    return null;
  }
  
  public ObjectType() {
   super(null);
  }
  
  protected ObjectType(ObjectTypeData data) {
	super(null);
  }
  
  public ObjectTypeData getData() {
	return null;
  }
  
  public ManagedObject newInstance() throws ApplicationException {
    return null;
  }
  
  public boolean hasInstances() throws ApplicationException {
	return true;
  }
  
  public boolean hasMultilingualInstances() throws ApplicationException {
	return true;
  }
  
  public boolean hasTargetedInstances() throws ApplicationException {
	return true;
  }
  
  public int findObjectCount() throws ApplicationException {
    return 0;
  }
  
  public static void flushObjectType(ObjectTypeRef id) throws ApplicationException {
    
  }
  
  public static void clearCache() throws ApplicationException {
    
  }
  
  public AttributeDefinitionData[] findAllSearchableAttributeDefinitions() throws ApplicationException, RemoteException {
    return null;
  }
  
  protected AttributeDefinitionData[] findAllSearchableAttributeDefinitions(Set<String> visited) throws ApplicationException, RemoteException {
    return null;
  }
  
  public boolean isKeySearchable(ReferenceData reference) {
	return true;
  }
  
  public AttributeDefinitionData[] getAllAttributeDefinitions(boolean expandReferences) throws ApplicationException, RemoteException {
	return null;
  }
  
  public TreeMap getRelationMap(boolean expandReferences) throws ApplicationException, RemoteException {
    return null;
  }
  
  public MsgObject[] validate() {
	return null;
  }
  
  public static IPagingList findAll() throws ApplicationException, ValidationException {
	return null;
  }
  
  public static IPagingList findAll(RequestParameters parms) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static ManagedObject findById(ManagedObjectRef id) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static ManagedObject findById(ManagedObjectRef id, RequestParameters parms) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static ObjectTypeRef findObjectTypeRef(ManagedObjectVCMRef id) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static IPagingList findByIds(ManagedObjectRef[] ids) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static IPagingList findByIds(ManagedObjectRef[] ids, RequestParameters parms) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static ObjectType findByName(String name) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static ObjectType findObjectTypeByJavaClassName(String javaClassName) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static Set<ObjectTypeRef> findObjectTypeRefsForProject(VCMObjectRef projectRef) throws ApplicationException {
	return null;
  }
  
  public static String getRecordSourceXML(ManagedObjectRef id) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static String getRecordSourceXML(ObjectTypeData otd) throws ApplicationException, ValidationException {
	return null;
  }
  
  protected TreeMap<String, ChangeTracker> getRelationMap(String prefix, boolean expandReferences) throws ApplicationException, RemoteException {
	return null;
  }
  
  protected static IObjectTypeOps getOpsImpl() throws ApplicationException {
	return null;
  }
  
  protected Class getLogicInterface() {
    return null;
  }
  
  protected Class getDataObjectClass() {
	return null;
  }
  
  public String getName() throws ApplicationException {
	return null;
  }
  
  public String getTypeCapabilityPrefix() {
    return null;
  }
  
  public boolean hasGeneratedCapabilityDefinition() throws ApplicationException {
    return true;
  }
  
  public boolean isSearchable() throws ApplicationException {
	return true;
  }
  
  public void setStructuralChangesAllowed(boolean structuralChangesAllowed) {
    
  }
  
  public boolean isStructuralChangesAllowed() {
    return true;
  }
  
  public ManagedObjectRef getManagedObjectRef() throws ApplicationException {
	return null;
  }
  
  public void setMultilingual(boolean multilingual) {

  }
  
  public boolean getMultilingual() {
    return true;
  }
}
