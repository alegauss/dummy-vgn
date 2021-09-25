package com.vignette.as.client.javabean;

import com.vignette.as.client.common.AppObjectId;
import com.vignette.as.client.common.ApplicationObjectData;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.ejb.IUnmanagedObjectOps;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import java.io.Serializable;

public abstract class UnmanagedObject implements IApplicationObject, Serializable {
  protected ApplicationObjectData data;
  
  protected AppObjectId id;
  
  public UnmanagedObject(ApplicationObjectData data) {
   
  }
  
  public boolean isNew() {
   return true;
  }
  
  protected IUnmanagedObjectOps getOps() throws ApplicationException {
    return null;
  }
  
  public void commit() throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public void autocommit() throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public void remove() throws ApplicationException, AuthorizationException {
   
  }
  
  public static UnmanagedObject findById(Class umObjectType, AppObjectId id) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static UnmanagedObject findById(Class umObjectType, AppObjectId id, RequestParameters reqParams) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByIds(Class umObjectType, AppObjectId[] ids) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByIds(Class umObjectType, AppObjectId[] ids, RequestParameters reqParams) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByQuery(Class umObjectType, String query, Object[] queryParams) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByQuery(Class umObjectType, String query, Object[] queryParams, RequestParameters reqParams) throws ApplicationException, ValidationException {
    return null;
  }
  
  protected void invalidate() {}
  
  public ApplicationObjectData getBaseData() {
    return null;
  }
  
  public void setData(ApplicationObjectData data) {
   
  }
  
  public AppObjectId getId() {
    return null;
  }
  
  protected abstract Class getDataObjectClass();
  
  protected Class getLogicInterface() {
    return null;
  }
  
}
