package com.vignette.as.client.javabean;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;

public interface IPersistable {
  void commit() throws ApplicationException, AuthorizationException, ValidationException;
  
  void remove() throws ApplicationException, AuthorizationException, ValidationException;
}
