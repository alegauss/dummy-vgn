package com.vignette.as.client.ejb;

import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.SharedPropertyPushParameters;
import com.vignette.as.client.common.ref.AsLocaleRef;
import com.vignette.as.client.common.ref.ChannelRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.ContentItem;
import java.util.List;

public interface IContentItemOps extends IManagedObjectOps {
  public static final String MAPPED_NAME = "";
  
  public static final String AS_OPS_LOGIC_LOCAL = "";
  
  boolean isExemplarTranslation(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  List<ContentItem> findByLocale(ManagedObjectVCMRef paramManagedObjectVCMRef, AsLocaleRef paramAsLocaleRef, RequestParameters paramRequestParameters) throws ApplicationException, AuthorizationException, ValidationException;
  
  ContentItem prepareTranslation(ManagedObjectVCMRef paramManagedObjectVCMRef, AsLocaleRef paramAsLocaleRef) throws ApplicationException, ValidationException, AuthorizationException;
  
  ContentItem createTranslationByWorkflow(ManagedObjectVCMRef paramManagedObjectVCMRef, AsLocaleRef paramAsLocaleRef) throws ApplicationException, ValidationException, AuthorizationException;
  
  void pushSharableProperties(ManagedObjectVCMRef paramManagedObjectVCMRef1, ManagedObjectVCMRef paramManagedObjectVCMRef2, SharedPropertyPushParameters paramSharedPropertyPushParameters) throws ApplicationException, ValidationException, AuthorizationException;
  
  List<ManagedObjectVCMRef> findFurlUsage(String paramString, ChannelRef paramChannelRef) throws ApplicationException, AuthorizationException, ValidationException;
}
