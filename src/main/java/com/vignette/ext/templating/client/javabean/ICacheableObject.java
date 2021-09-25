package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.ext.templating.cache.RenderedManagedObjectCacheKey;

public interface ICacheableObject {
  boolean isCacheable() throws ApplicationException;
  
  long getTTL() throws ApplicationException;
  
  String createCacheKey(RenderedManagedObjectCacheKey paramRenderedManagedObjectCacheKey) throws ApplicationException;
}
