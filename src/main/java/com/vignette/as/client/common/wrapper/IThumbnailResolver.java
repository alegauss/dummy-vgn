package com.vignette.as.client.common.wrapper;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import java.io.Serializable;
import java.util.List;

public interface IThumbnailResolver extends Serializable {
  ThumbnailClass getThumbnailClass();
  
  ThumbnailScope getThumbnailScope();
  
  String getSourceId();
  
  WrappedFile getThumbnail() throws ApplicationException, ValidationException, AuthorizationException;
  
  List<String> getVisitedObjects();
}
