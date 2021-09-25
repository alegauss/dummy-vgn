package com.vignette.as.client.javabean;

import com.vignette.as.client.common.AppObjectId;
import com.vignette.as.client.common.AttributeData;
import com.vignette.as.client.common.ITrackedProp;
import com.vignette.as.client.common.ReferenceValueData;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.ref.ChannelRef;
import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.authz.client.Capability;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

public class ContentInstance extends ContentItem implements IRelatedAttribute {
  public static final String DEFAULT_NAME_DELIMITER = "";
  
  protected AttributeData[] keys;
  
  public ContentInstance() {
  }
  
  public ManagedObjectRef getManagedObjectRef() throws ApplicationException {
  return null;
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
  
  protected List<ITrackedProp> getDataSourceAttributeProperties() {
    return null;
  }
  
  public void setTaxonomyClassifications(String[] classifications) {
  }
  
  public String[] getTaxonomyClassifications() {
    return null;
  }
  
  public void addTaxonomyClassification(String classification) {
    
  }
  
  public void removeTaxonomyClassification(String classification) {
   
  }
  
  public void setChannelRefs(ChannelRef[] channelRefs) {
   
  }
  
  public ChannelRef[] getChannelRefs() {
	return null;
  }
  
  public void setChannels(Channel[] channels) throws ApplicationException, ValidationException {
   
  }
  
  public IPagingList getChannels(RequestParameters reqParams) throws ApplicationException, ValidationException {
	return null;
  }
  
  public void addChannelRef(ChannelRef channelRef) {

  }
  
  public void addChannel(Channel channel) throws ApplicationException, ValidationException {

  }
  
  public void removeChannelRef(ChannelRef channelRef) {

  }
  
  public void removeChannel(Channel channel) throws ApplicationException, ValidationException {

  }
  
  public AppObjectId getRelationId() throws ApplicationException {
	return null;
  }
  
  public AttributedObject getRelationInstance(AppObjectId id) throws ApplicationException {
	return null;
  }
  
  public AttributeData[] getPrimaryKeys() {
	return null;
  }
  
  public boolean hasUserTables() throws ApplicationException {
    return true;
  }
  
  public boolean hasDataSourceAttributes() throws ApplicationException {
	return true;
  }
  
  public AttributedObject[] getRelations(String name) throws ApplicationException {
    return null;
  }
  
  public Hashtable getAllRelations() throws ApplicationException {
    return null;
  }
  
  public String[] getRelationNames() throws ApplicationException {
    return null;
  }
  
  public ObjectTypeRef getObjectTypeRef() throws ApplicationException {
	return null;
  }
  
  public void setRelations(String name, AttributedObject[] attrs) throws ApplicationException {
    
  }
  
  public ReferenceValueData[] getReferences() throws ApplicationException {
	return null;
  }
  
  public void commit() throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  protected void refresh(ManagedObject obj) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public void remove() throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public void attach(AttributeData[] keys) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public void detach() throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  protected void setAttaching(boolean attaching) {
  }
  
  public boolean isAttaching() {
    return true;
  }
  
  protected void setDetaching(boolean detaching) {
   
  }
  
  public boolean isDetaching() {
    return true;
  }
  
  public void unattach() throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  public boolean isAttach() {
    return false;
  }
  
  public void setPrimaryKeys(AttributeData[] keys) {
    
  }
  
  public boolean isWfValid() throws ApplicationException {
  return true;
  }
  
 
  protected AttributedObject getCustomerTableAttrs() {
	return null;
  }
  
  protected void setCustomerTableAttrs(AttributedObject attrs) {
   
  }
  
  protected Class getLogicInterface() {
    return null;
  }
  
  public AttributeData[] getRelationKeyAttributes() throws ApplicationException {
	return null;
  }
  
  public AttributeData[] getParentRelationKeyAttributes() throws ApplicationException {
	return null;
  }
  
  public Capability[] getAllCapabilities() throws ApplicationException {
	return null;
  }
  
  public String getName() throws ApplicationException {
    return null;
  }
  
  public String getName(String delimiter) throws ApplicationException {
	return null;
  }

  public void setPublishDate(Date date) throws ValidationException {
    
  }
  
  public Date getPublishDate() {
    return null;
  }
  
  public void setUnpublishDate(Date date) throws ValidationException {
   
  }
  
  public Date getUnpublishDate() {
	return null;
  }
  
  public void setTargetingRuleId(ManagedObjectVCMRef targetingRuleIdId) {
    
  }
  
  public ManagedObjectVCMRef getTargetingRuleId() {
	return null;
  }

  @Override
  public AttributeData[] getAttributes() throws ApplicationException {
       return null;
  }
}
