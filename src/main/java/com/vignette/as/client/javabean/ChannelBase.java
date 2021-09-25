package com.vignette.as.client.javabean;

import com.vignette.as.client.common.ITrackedProp;
import com.vignette.as.client.common.ManagedObjectWorkflowMode;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.ref.ChannelRef;
import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.SiteRef;
import com.vignette.as.client.ejb.IChannelOps;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.server.logic.common.IDALogic;
import java.util.Date;
import java.util.List;

public abstract class ChannelBase extends ExtensibleApplicationObject {
  
  public ChannelBase() {
    super(null);

  }
  
  public static Channel newInstance() throws ApplicationException {
    return null;
  }
  
  protected boolean getChangeTrackingDefault() {
    return true;
  }
  
  protected List getApprovalRequiredProperties() {
    return null;
  }
  
  public ManagedObjectWorkflowMode getDefaultUpdateWorkflowMode() {
    return ManagedObjectWorkflowMode.SELECTIVE;
  }
  
  protected List getWorkflowRequiredProperties() {
    return null;
  }
  
  protected List<ITrackedProp> getAdhocReferencePropertyProperties() {
    return null;
  }
  
  public void commit() throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  public Channel[] getBreadcrumbPath(boolean inDescendingOrder) throws ApplicationException, ValidationException {
    return null;
  }
  
  public Channel[] getBreadcrumbPath(boolean inDescendingOrder, RequestParameters rp) throws ApplicationException, ValidationException {
    return null;
  }
  
  public Channel getRootChannel() throws ApplicationException, ValidationException {
    return null;
  }
  
  public Channel[] getAllSubchannels() throws ApplicationException, ValidationException {
    return null;
  }
  
  public Channel[] getAllSubchannels(RequestParameters rp) throws ApplicationException, ValidationException {
    return null;
  }
  
  public Channel[] getActiveSubchannels(RequestParameters reqParams) throws ApplicationException, ValidationException {
    return null;
  }
  
  public Channel[] getInactiveSubchannels(RequestParameters reqParams) throws ApplicationException, ValidationException {
    return null;
  }
  
  public int getSubchannelCount() throws ApplicationException, ValidationException {
    return 1;
  }

  protected static IChannelOps getLocalOps() throws ApplicationException {
    return null;
  }
  
  IDALogic getDALogic() {
    return null;
  }
  public String getName() throws ApplicationException {
    return null;
  }
  
  public String getDescription() {
    return null;
  }
  
  public boolean getActive() {
    return true;
  }
  
  public ChannelRef getParentChannelRef() {
    return null;
  }
  
  public int getOrderAsSibling() {
    return 1;
  }
  
  public String getPageRef() {
    return null;
  }
  
  public void setPublishDate(Date date) throws ValidationException {

  }
  
  public Date getPublishDate() {
    return null;
  }
  
  protected void setCreatingFromSystem(boolean systemCreatedChannel) {
  }
  
  protected boolean isCreatingFromSystem() {
    return true;
  }
  
  public SiteRef[] getSiteRefs() throws ApplicationException {
    return null;
  }
  
  public void addContentAssociation(ManagedObjectVCMRef moRef) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public void addContentAssociations(ManagedObjectVCMRef[] moRefs) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public void removeContentAssociation(ManagedObjectVCMRef moRef) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public void removeContentAssociations(ManagedObjectVCMRef[] moRefs) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public void clearContentAssociations() throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public void setContentAssociations(ManagedObjectVCMRef[] moRefs) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public void moveContentAssociation(ManagedObjectVCMRef moRef, ChannelRef targetChannelRef) throws ApplicationException, ValidationException, AuthorizationException {

  }
  
  public void moveContentAssociations(ManagedObjectVCMRef[] moRefs, ChannelRef targetChannelRef) throws ApplicationException, ValidationException, AuthorizationException {
  
  }
  
  public static void addContentAssociation(ChannelRef channelRef, ManagedObjectVCMRef moRef) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public static void addContentAssociations(ChannelRef channelRef, ManagedObjectVCMRef[] moRefs) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public static void clearContentAssociations(ChannelRef channelRef) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public static ManagedObjectVCMRef[] getContentAssociations(ChannelRef channelRef) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static void removeContentAssociation(ChannelRef channelRef, ManagedObjectVCMRef moRef) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public static void removeContentAssociations(ChannelRef channelRef, ManagedObjectVCMRef[] moRefs) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public static void setContentAssociations(ChannelRef channelRef, ManagedObjectVCMRef[] moRefs) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public static void moveContentAssociation(ChannelRef channelRef, ManagedObjectVCMRef moRef, ChannelRef targetChannelRef) throws ApplicationException, ValidationException, AuthorizationException {
   
  }
  
  public static void moveContentAssociations(ChannelRef channelRef, ManagedObjectVCMRef[] moRefs, ChannelRef targetChannelRef) throws ApplicationException, ValidationException, AuthorizationException {
   
  }
  
  public ManagedObjectRef getManagedObjectRef() throws ApplicationException {
    return null;
  }
}
