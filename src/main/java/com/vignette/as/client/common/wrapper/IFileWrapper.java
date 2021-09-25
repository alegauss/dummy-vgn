package com.vignette.as.client.common.wrapper;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;

public interface IFileWrapper {
  WrappedFile getWrappedFile(WrappedFileType paramWrappedFileType) throws ValidationException, ApplicationException, AuthorizationException;
  
  WrappedFile getWrappedFileForFormat(WrappedFileType paramWrappedFileType, String paramString) throws ValidationException, ApplicationException, AuthorizationException;
}
