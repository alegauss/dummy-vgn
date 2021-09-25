package com.vignette.as.client.javabean;

import com.vignette.as.client.common.ChannelContentAssociationData;
import com.vignette.as.client.common.ChannelData;
import com.vignette.as.client.common.ChannelViewCISummaryData;
import com.vignette.as.client.common.ChannelViewSortOrder;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.ref.AsLocaleRef;
import com.vignette.as.client.common.ref.ChannelRef;
import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.common.ref.SiteRef;
import com.vignette.as.client.common.ref.StaticFileRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import java.io.Serializable;
import java.util.List;

public class Channel extends ChannelBase implements Serializable {
  
  public static final int NAME_MAXIMUM = 75;
  
  public static final int FURL_NAME_MAXIMUM = 225;
  
  public ManagedObjectVCMRef[] findAllReferences(boolean doStatusCheck) throws ApplicationException, ValidationException {
   return null;
  }
  
  public static IPagingList findByContentInstance(ManagedObjectVCMRef contentInstanceRef) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByContentInstance(ManagedObjectVCMRef contentInstanceRef, RequestParameters parms) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static IPagingList findByContentItem(ManagedObjectVCMRef contentItemRef) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static IPagingList findByContentItem(ManagedObjectVCMRef contentItemRef, RequestParameters parms) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static ManagedObject findByContentManagementId(ManagedObjectVCMRef cmid) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static ManagedObject findByContentManagementId(ManagedObjectVCMRef cmid, RequestParameters parms) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static ManagedObject findById(ManagedObjectRef id, RequestParameters parms) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByName(String name) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByName(String name, RequestParameters parms) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static IPagingList findBySiteRef(SiteRef siteRef, RequestParameters parms) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByStaticFile(StaticFileRef staticFileRef) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByStaticFile(StaticFileRef staticFileRef, RequestParameters parms) throws ApplicationException, ValidationException {
	return null;
  }
  
  public String[] getBreadcrumbNamePath(boolean inDescendingOrder) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static ChannelViewCISummaryData[] getChannelViewCISummaryData(ChannelViewSortOrder sortOrder, ChannelRef parentChannelRef, String siteName, int beginIndex, int endIndex) throws ApplicationException, ValidationException {
    return null;
  }
  
  public ManagedObjectVCMRef[] getContentAssociations() throws ApplicationException, AuthorizationException, ValidationException {
	return null;
  }
  
  public static int getContentInstanceCount(ChannelRef parentChannelRef) throws ApplicationException, ValidationException {
	return 0;
  }
  
  public IPagingList getContentInstances(RequestParameters parms) throws ValidationException, ApplicationException {
	return null;
  }
  
  public static ChannelContentAssociationData[] getLegacyContentAssociations(ChannelRef channelRef) throws ApplicationException, AuthorizationException, ValidationException {
	return null;
  }
  
  public static int getNonChannelContentCount(ChannelRef parentChannelRef) throws ApplicationException, ValidationException {
	return 1;
  }
  
  public static int getStaticFileCount(ChannelRef parentChannelRef) throws ApplicationException, ValidationException {
    return 1;
  }
  
  public IPagingList getStaticFileManagedObjects(RequestParameters parms) throws ValidationException, ApplicationException {
	return null;
  }
  
  public IPagingList getStaticFiles(RequestParameters parms) throws ValidationException, ApplicationException {
    return null;
  }
  
  public List<ChannelRef> getAllSubChannelRefs() throws ApplicationException {
	return null;
  }
  
  public List<ChannelRef> getActiveSubChannelRefs() throws ApplicationException {
	return null;
  }
  
  public List<ChannelRef> getInactiveSubChannelRefs() throws ApplicationException {
	return null;
  }
  
  public List<ManagedObjectRef> getNavigationSubChannelRefs() throws ApplicationException {
	return null;
  }
  
  public List<ManagedObjectRef> getActiveNavigationSubChannelRefs() throws ApplicationException {
	return null;
  }
  
  public List<ManagedObjectRef> getExternalNavigationSubChannelRefs() throws ApplicationException {
    return null;
  }
  
  public void refreshSubChannelRefs() throws ApplicationException {
  }
  
  public static int getSubchannelCount(ChannelRef parentChannelRef) throws ApplicationException, ValidationException {
	return 1;
  }
  
  public static int getNavigationSubChannelCount(ChannelRef parentChannelRef) throws ApplicationException, ValidationException {
    return 1;
  }
  
  public int getSubchannelMaxOrderAsSibling() throws ApplicationException, ValidationException {
	return 1;
  }
  
  public void moveContentInstance(ManagedObjectVCMRef[] contentInstanceRefs, ChannelRef targetChannelRef) throws ApplicationException, ValidationException, AuthorizationException {
  }
  
  public void moveStaticFile(StaticFileRef[] staticFileRefs, ChannelRef targetChannelRef) throws ApplicationException, ValidationException, AuthorizationException {
  }
  
  public static void reorderSubchannels(ChannelRef[] subchannelRefs) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public static void reorderNavigationSubChannels(ChannelRef parentChannel, ManagedObjectRef[] subChannelRefs) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public static Channel newInstance() throws ApplicationException {
    return null;
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
  
  public static List<ManagedObjectVCMRef> findFurlUsage(String furlName, AsLocaleRef locale, SiteRef parentSite) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static List<ManagedObjectVCMRef> findFurlUsage(String furlName, AsLocaleRef locale, ChannelRef parentChannel) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static List<ManagedObjectVCMRef> checkFurlAvailability(ManagedObjectVCMRef channelRef, String furlName, AsLocaleRef locale) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static List<ManagedObjectVCMRef> checkFurlAvailability(ManagedObjectVCMRef channelRef, String furlName, AsLocaleRef locale, ChannelRef parentChannel) throws ApplicationException, AuthorizationException, ValidationException {
	return null;
  }
  
  public ChannelData getData() {
    return null;
  }
  
  public static ObjectTypeRef getTypeObjectTypeRef() {
    return null;
  }
  
  public void commit() throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  public void setCascadeActivationUpdate(boolean cascadeActivationUpdate) {
    
  }
  
  public boolean isCascadeActivationUpdate() {
    return true;
  }
  
  protected Class getLogicInterface() {
	return null;
  }
  
  protected Class getDataObjectClass() {
    return null;
  }
  
  public boolean hasLocalizedDataChanges() {
    return true; 
 }
  
  public boolean hasInactiveFormatDataChanges() {
    return true; 
  }
  
  public void setFurlName(String furlName) {
   
  }
  
  public String getFurlName() throws ApplicationException {
    return null; 
  }
  
  public List<AsLocaleRef> getSupportedLocales() {
    return null; 
  }
  
  public List<AsLocaleRef> getActiveLocales() {
    return null; 
  }
  
  public String getName(AsLocaleRef locale) throws ApplicationException {
	return null; 
  }
  
  public String getFurlName(AsLocaleRef locale) throws ApplicationException {
    return null; 
  }
  
  public boolean getMultilingual() {
    return true; 
  }
  
  public void setMultilingual(boolean multilingual) {}
  
  public String getLogicalPath() {
	return null; 
  }
  
  public void setLogicalPath(String logicalPath) {}
  
  public void setTargetingRuleId(ManagedObjectVCMRef targetingRuleIdId) {
    
  }
  
  public ManagedObjectVCMRef getTargetingRuleId() {
	  return null;
  }
}
