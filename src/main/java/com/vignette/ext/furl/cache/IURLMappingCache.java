package com.vignette.ext.furl.cache;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.javabean.ManagedObject;
import com.vignette.ext.furl.javabean.UrlMapping;

public interface IURLMappingCache {
  void addMapping(String paramString, UrlMapping paramUrlMapping) throws ApplicationException;
  
  UrlMapping getMapping(String paramString) throws ApplicationException;
  
  void removeMapping(String paramString) throws ApplicationException;
  
  void removeMappingsForManagedObject(ManagedObject paramManagedObject) throws ApplicationException;
}
