package com.vignette.as.client.ejb;

import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.TouchRequestParameters;
import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.IExportXMLControl;
import com.vignette.as.client.javabean.IImportXMLControl;
import com.vignette.as.client.javabean.IPagingList;
import com.vignette.as.client.javabean.ManagedObject;
import com.vignette.as.client.javabean.StreamOps;
import com.vignette.authz.client.Capability;
import java.io.Reader;
import java.io.Writer;

public interface IManagedObjectOps extends IOps {
  public static final String MAPPED_NAME = "";
  
  public static final String AS_OPS_LOGIC_LOCAL = "";
  
  Capability[] getAllCapabilities();
  
  Capability[] getNewCapabilities();
  
  ManagedObjectRef asManagedObjectRef(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  ManagedObjectVCMRef asManagedObjectVCMRef(ManagedObjectRef paramManagedObjectRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  ManagedObject commit(ManagedObject paramManagedObject) throws ApplicationException, AuthorizationException, ValidationException;
  
  void delete(ManagedObject paramManagedObject) throws ApplicationException, AuthorizationException, ValidationException;
  
  void expireFromCache(ManagedObjectVCMRef[] paramArrayOfManagedObjectVCMRef) throws ApplicationException, AuthorizationException;
  
  StreamOps exportXML(ManagedObject paramManagedObject, IExportXMLControl paramIExportXMLControl) throws ApplicationException, AuthorizationException, ValidationException;
  
  void exportXMLLocal(ManagedObject paramManagedObject, Writer paramWriter, IExportXMLControl paramIExportXMLControl) throws ApplicationException, AuthorizationException, ValidationException;
  
  ManagedObjectRef[] filterRefsForCurrentStage(ManagedObjectRef[] paramArrayOfManagedObjectRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  ManagedObject findByContentManagementId(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, ValidationException;
  
  ManagedObject findByContentManagementId(ManagedObjectVCMRef paramManagedObjectVCMRef, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  IPagingList findByContentManagementIds(ManagedObjectVCMRef[] paramArrayOfManagedObjectVCMRef) throws ApplicationException, ValidationException;
  
  IPagingList findByContentManagementIds(ManagedObjectVCMRef[] paramArrayOfManagedObjectVCMRef, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  ManagedObject findById(ManagedObjectRef paramManagedObjectRef) throws ApplicationException, ValidationException;
  
  ManagedObject findById(ManagedObjectRef paramManagedObjectRef, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  IPagingList findByIds(ManagedObjectRef[] paramArrayOfManagedObjectRef) throws ApplicationException, ValidationException;
  
  IPagingList findByIds(ManagedObjectRef[] paramArrayOfManagedObjectRef, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  IPagingList findManagedObjectsByQuery(ObjectTypeRef paramObjectTypeRef, String paramString1, String paramString2, Object[] paramArrayOfObject) throws ApplicationException;
  
  IPagingList findManagedObjectsByQuery(ObjectTypeRef paramObjectTypeRef, String paramString1, String paramString2, Object[] paramArrayOfObject, RequestParameters paramRequestParameters) throws ApplicationException;
  
  ManagedObjectVCMRef[] getReferredManagedObjects(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  ManagedObjectVCMRef[] getReferringManagedObjects(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  boolean hasReferences(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  ManagedObject importXML(ObjectTypeRef paramObjectTypeRef, StreamOps paramStreamOps, IImportXMLControl paramIImportXMLControl) throws ApplicationException, AuthorizationException, ValidationException;
  
  ManagedObject importXML(ObjectTypeRef paramObjectTypeRef, String paramString, boolean paramBoolean) throws ApplicationException, AuthorizationException, ValidationException;
  
  ManagedObject importXMLLocal(ObjectTypeRef paramObjectTypeRef, Reader paramReader, IImportXMLControl paramIImportXMLControl) throws ApplicationException, AuthorizationException, ValidationException;
  
  boolean isReferenced(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  String toXML(ManagedObject paramManagedObject) throws ApplicationException;
  
  void touch(ManagedObject paramManagedObject, TouchRequestParameters paramTouchRequestParameters) throws ApplicationException, AuthorizationException, ValidationException;
  
  ManagedObject loadReferenceData(ManagedObject paramManagedObject) throws ApplicationException, AuthorizationException, ValidationException;
  
  String encodeFurlName(String paramString) throws ApplicationException;
  
  String decodeFurlName(String paramString) throws ApplicationException;
  
  boolean isPublished(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, AuthorizationException, ValidationException;
}
