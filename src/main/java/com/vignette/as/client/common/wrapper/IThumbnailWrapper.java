package com.vignette.as.client.common.wrapper;

import com.vignette.as.client.common.ThumbnailFormat;
import com.vignette.as.client.common.ThumbnailSize;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;

public interface IThumbnailWrapper {
  WrappedFile getWrappedThumbnail() throws AuthorizationException, ValidationException, ApplicationException;
  
  ThumbnailManager.Uri getThumbnailUri(ThumbnailSize paramThumbnailSize, ThumbnailFormat paramThumbnailFormat) throws AuthorizationException, ValidationException, ApplicationException;
}
