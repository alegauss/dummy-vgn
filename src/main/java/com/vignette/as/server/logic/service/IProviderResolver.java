package com.vignette.as.server.logic.service;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.ext.templating.util.RequestContext;
import java.util.List;

public interface IProviderResolver {
  <T extends com.vignette.as.server.pluggable.service.Provider<?>> T getProvider(RequestContext paramRequestContext, String paramString, Class<T> paramClass) throws AuthorizationException, ValidationException, ApplicationException;
  
  <T extends com.vignette.as.server.pluggable.service.Provider<?>> List<T> getProviders(RequestContext paramRequestContext, Class<T> paramClass) throws AuthorizationException, ValidationException, ApplicationException;
}
