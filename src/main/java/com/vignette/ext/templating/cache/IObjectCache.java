package com.vignette.ext.templating.cache;

import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.javabean.ManagedObject;

public interface IObjectCache {
  void initialize() throws ApplicationException;
  
  void removeAll() throws ApplicationException;
  
  Object getSimpleObject(String paramString) throws ApplicationException;
  
  void putSimpleObject(String paramString, Object paramObject) throws ApplicationException;
  
  void putSimpleObject(String paramString, Object paramObject, long paramLong) throws ApplicationException;
  
  void removeSimpleObject(String paramString) throws ApplicationException;
  
  void removeAllSimpleObjects() throws ApplicationException;
  
  ManagedObject getManagedObject(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException;
  
  ManagedObject getManagedObject(ManagedObjectRef paramManagedObjectRef) throws ApplicationException;
  
  void putManagedObject(ManagedObject paramManagedObject) throws ApplicationException;
  
  void removeManagedObject(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException;
  
  void removeAllManagedObjects() throws ApplicationException;
  
  String getRenderedManagedObject(RenderedManagedObjectCacheKey paramRenderedManagedObjectCacheKey) throws ApplicationException;
  
  void putRenderedManagedObject(RenderedManagedObjectCacheKey paramRenderedManagedObjectCacheKey, String paramString) throws ApplicationException;
  
  void removeRenderedManagedObject(RenderedManagedObjectCacheKey paramRenderedManagedObjectCacheKey) throws ApplicationException;
  
  void removeAllRenderedManagedObjects() throws ApplicationException;
}
