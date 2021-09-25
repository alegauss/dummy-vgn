package com.vignette.as.client.ejb;

import com.vignette.as.client.common.ObjectTypeData;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.common.ref.VCMObjectRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.IPagingList;
import com.vignette.as.client.javabean.ManagedObject;
import com.vignette.as.client.javabean.ObjectType;
import java.util.Set;

public interface IObjectTypeOps extends IExtensibleApplicationObjectOps {
  public static final String MAPPED_NAME = "";
  
  public static final String AS_OPS_LOGIC_LOCAL = "";
  
  void clearCache() throws ApplicationException;
  
  ManagedObject commit(ManagedObject paramManagedObject) throws ApplicationException, AuthorizationException, ValidationException;
  
  void delete(ManagedObject paramManagedObject) throws ApplicationException, AuthorizationException, ValidationException;
  
  IPagingList findAll() throws ApplicationException, ValidationException;
  
  IPagingList findAll(RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  ManagedObject findById(ManagedObjectRef paramManagedObjectRef) throws ApplicationException, ValidationException;
  
  ManagedObject findById(ManagedObjectRef paramManagedObjectRef, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  IPagingList findByIds(ManagedObjectRef[] paramArrayOfManagedObjectRef) throws ApplicationException, ValidationException;
  
  IPagingList findByIds(ManagedObjectRef[] paramArrayOfManagedObjectRef, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  ObjectType findByName(String paramString) throws ApplicationException, ValidationException;
  
  int findObjectCount(ObjectTypeRef paramObjectTypeRef) throws ApplicationException;
  
  ObjectType findObjectTypeByJavaClassName(String paramString) throws ApplicationException, ValidationException;
  
  ObjectTypeRef findObjectTypeRef(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, ValidationException;
  
  void flushObjectType(ObjectTypeRef paramObjectTypeRef) throws ApplicationException;
  
  String getRecordSourceXML(ObjectTypeData paramObjectTypeData) throws ApplicationException, ValidationException;
  
  String getRecordSourceXML(ManagedObjectRef paramManagedObjectRef) throws ApplicationException, ValidationException;
  
  boolean hasInstances(ObjectTypeRef paramObjectTypeRef) throws ApplicationException;
  
  boolean hasMultilingualInstances(ObjectTypeRef paramObjectTypeRef) throws ApplicationException;
  
  boolean hasTargetedInstances(ObjectTypeRef paramObjectTypeRef) throws ApplicationException;
  
  void projectNameChanged(String paramString1, String paramString2) throws ApplicationException, AuthorizationException, ValidationException;
  
  Set<ObjectTypeRef> findObjectTypeRefsForProject(VCMObjectRef paramVCMObjectRef) throws ApplicationException;
}
