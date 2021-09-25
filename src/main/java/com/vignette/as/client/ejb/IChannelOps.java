package com.vignette.as.client.ejb;

import com.vignette.as.client.common.ChannelContentAssociationData;
import com.vignette.as.client.common.ChannelViewCISummaryData;
import com.vignette.as.client.common.ChannelViewSortOrder;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.ref.AsLocaleRef;
import com.vignette.as.client.common.ref.ChannelRef;
import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.SiteRef;
import com.vignette.as.client.common.ref.StaticFileRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.IPagingList;
import com.vignette.as.client.javabean.ManagedObject;
import java.util.LinkedHashMap;
import java.util.List;

public interface IChannelOps extends IExtensibleApplicationObjectOps {
  public static final String MAPPED_NAME = "";
  
  public static final String AS_OPS_LOGIC_LOCAL = "";
  
  void addContentAssociation(ChannelRef paramChannelRef, ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  void addContentAssociations(ChannelRef paramChannelRef, ManagedObjectVCMRef[] paramArrayOfManagedObjectVCMRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  void clearContentAssociations(ChannelRef paramChannelRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  ManagedObject commit(ManagedObject paramManagedObject) throws ValidationException, ApplicationException, AuthorizationException;
  
  void delete(ManagedObject paramManagedObject) throws ValidationException, AuthorizationException, ApplicationException;
  
  ManagedObjectVCMRef[] findAllReferences(ChannelRef paramChannelRef, boolean paramBoolean) throws ApplicationException, ValidationException;
  
  IPagingList findByContentInstance(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, ValidationException;
  
  IPagingList findByContentInstance(ManagedObjectVCMRef paramManagedObjectVCMRef, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  IPagingList findByContentItem(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, ValidationException;
  
  IPagingList findByContentItem(ManagedObjectVCMRef paramManagedObjectVCMRef, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  ManagedObject findByContentManagementId(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, ValidationException;
  
  ManagedObject findByContentManagementId(ManagedObjectVCMRef paramManagedObjectVCMRef, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  ManagedObject findById(ManagedObjectRef paramManagedObjectRef, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  IPagingList findByName(String paramString) throws ApplicationException, ValidationException;
  
  IPagingList findByName(String paramString, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  IPagingList findBySiteRef(SiteRef paramSiteRef, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  IPagingList findByStaticFile(StaticFileRef paramStaticFileRef) throws ApplicationException, ValidationException;
  
  IPagingList findByStaticFile(StaticFileRef paramStaticFileRef, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  String[] getBreadcrumbNamePath(ChannelRef paramChannelRef, boolean paramBoolean) throws ApplicationException, ValidationException;
  
  ChannelRef[] getBreadcrumbPath(ChannelRef paramChannelRef, boolean paramBoolean, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  ChannelViewCISummaryData[] getChannelViewCISummaryData(ChannelViewSortOrder paramChannelViewSortOrder, ChannelRef paramChannelRef, String paramString, int paramInt1, int paramInt2) throws ApplicationException, ValidationException;
  
  ManagedObjectVCMRef[] getContentAssociations(ChannelRef paramChannelRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  int getContentInstanceCount(ChannelRef paramChannelRef) throws ApplicationException, ValidationException;
  
  IPagingList getContentInstances(ChannelRef paramChannelRef, RequestParameters paramRequestParameters) throws ValidationException, ApplicationException;
  
  ChannelContentAssociationData[] getLegacyContentAssociations(ChannelRef paramChannelRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  int getNonChannelContentCount(ChannelRef paramChannelRef) throws ApplicationException, ValidationException;
  
  ChannelRef getRootChannel(ChannelRef paramChannelRef) throws ApplicationException, ValidationException;
  
  int getStaticFileCount(ChannelRef paramChannelRef) throws ApplicationException, ValidationException;
  
  IPagingList getStaticFileManagedObjects(ChannelRef paramChannelRef, RequestParameters paramRequestParameters) throws ValidationException, ApplicationException;
  
  IPagingList getStaticFiles(ChannelRef paramChannelRef, RequestParameters paramRequestParameters) throws ValidationException, ApplicationException;
  
  int getSubchannelCount(ChannelRef paramChannelRef) throws ApplicationException, ValidationException;
  
  int getNavigationSubChannelCount(ChannelRef paramChannelRef) throws ApplicationException, ValidationException;
  
  int getSubchannelMaxOrderAsSibling(ChannelRef paramChannelRef) throws ApplicationException, ValidationException;
  
  LinkedHashMap<ManagedObjectRef, Boolean> getNavigationSubChannelRefs(ChannelRef paramChannelRef) throws ApplicationException;
  
  ChannelRef[] getSubchannels(ChannelRef paramChannelRef, Boolean paramBoolean, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  void moveContentAssociation(ChannelRef paramChannelRef1, ManagedObjectVCMRef paramManagedObjectVCMRef, ChannelRef paramChannelRef2) throws ApplicationException, ValidationException, AuthorizationException;
  
  void moveContentAssociations(ChannelRef paramChannelRef1, ManagedObjectVCMRef[] paramArrayOfManagedObjectVCMRef, ChannelRef paramChannelRef2) throws ApplicationException, ValidationException, AuthorizationException;
  
  void moveContentInstance(ChannelRef paramChannelRef1, ManagedObjectVCMRef[] paramArrayOfManagedObjectVCMRef, ChannelRef paramChannelRef2) throws ApplicationException, ValidationException, AuthorizationException;
  
  void moveStaticFile(ChannelRef paramChannelRef1, StaticFileRef[] paramArrayOfStaticFileRef, ChannelRef paramChannelRef2) throws ApplicationException, ValidationException, AuthorizationException;
  
  void removeContentAssociation(ChannelRef paramChannelRef, ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  void removeContentAssociations(ChannelRef paramChannelRef, ManagedObjectVCMRef[] paramArrayOfManagedObjectVCMRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  void reorderSubchannels(ChannelRef[] paramArrayOfChannelRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  void reorderNavigationSubChannels(ChannelRef paramChannelRef, ManagedObjectRef[] paramArrayOfManagedObjectRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  void setContentAssociations(ChannelRef paramChannelRef, ManagedObjectVCMRef[] paramArrayOfManagedObjectVCMRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  void setContentAssociations(ChannelRef paramChannelRef, ManagedObjectVCMRef[] paramArrayOfManagedObjectVCMRef, boolean paramBoolean) throws ApplicationException, AuthorizationException, ValidationException;
  
  List<ManagedObjectVCMRef> findFurlUsage(String paramString, AsLocaleRef paramAsLocaleRef, SiteRef paramSiteRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  List<ManagedObjectVCMRef> findFurlUsage(String paramString, AsLocaleRef paramAsLocaleRef, ChannelRef paramChannelRef) throws ApplicationException, AuthorizationException, ValidationException;
}
