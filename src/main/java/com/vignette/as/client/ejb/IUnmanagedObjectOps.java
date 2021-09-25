package com.vignette.as.client.ejb;

import com.vignette.as.client.common.AppObjectId;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.IPagingList;
import com.vignette.as.client.javabean.UnmanagedObject;

public interface IUnmanagedObjectOps extends IOps {
  public static final String MAPPED_NAME = "";
  
  public static final String AS_OPS_LOGIC_LOCAL = "";
  
  UnmanagedObject commit(UnmanagedObject paramUnmanagedObject) throws ApplicationException, AuthorizationException, ValidationException;
  
  UnmanagedObject autocommit(UnmanagedObject paramUnmanagedObject) throws ApplicationException, AuthorizationException, ValidationException;
  
  void delete(UnmanagedObject paramUnmanagedObject) throws ApplicationException, AuthorizationException;
  
  UnmanagedObject findById(Class paramClass, AppObjectId paramAppObjectId) throws ApplicationException, ValidationException;
  
  UnmanagedObject findById(Class paramClass, AppObjectId paramAppObjectId, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  IPagingList findByIds(Class paramClass, AppObjectId[] paramArrayOfAppObjectId) throws ApplicationException, ValidationException;
  
  IPagingList findByIds(Class paramClass, AppObjectId[] paramArrayOfAppObjectId, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
  
  IPagingList findByQuery(Class paramClass, String paramString, Object[] paramArrayOfObject) throws ApplicationException, ValidationException;
  
  IPagingList findByQuery(Class paramClass, String paramString, Object[] paramArrayOfObject, RequestParameters paramRequestParameters) throws ApplicationException, ValidationException;
}
