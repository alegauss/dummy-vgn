package com.vignette.as.client.exception;

import com.vignette.util.IVgnErrorCode;
import com.vignette.util.MsgObject;
import com.vignette.util.VgnException;
import com.vignette.util.VgnRuntimeException;

public class ApplicationException extends ASException {
  public ApplicationException(IVgnErrorCode code, Object src, MsgObject msgObj, Throwable ex) {
    super(code, src, msgObj, ex);
  }
  
  public ApplicationException(IVgnErrorCode code, Object src, MsgObject msgObj) {
    super(null, null, null, null);

      }
  
  public ApplicationException(IVgnErrorCode code, Object src, VgnException ex) {
    super(null, null, null, null);
      }
  
  public ApplicationException(IVgnErrorCode code, Object src, Throwable ex) {
    super(null, null, null, null);
     }
  
  public ApplicationException(Object src, MsgObject msgObj, VgnException ex) {
    super(null, null, null, null);
    }
  
  public ApplicationException(Object src, MsgObject msgObj, Throwable ex) {
    super(null, null, null, null);
    }
  
  public ApplicationException(Object src, VgnException ex) {
    super(null, null, null, null);
    }
  
  public ApplicationException(Object src, Throwable ex) {
      super(null, null, null, null);
    }
  
  public static ApplicationException getOne(IVgnErrorCode code, Object src, MsgObject msgObj, Throwable ex) {
    return null;
  }
  
  public static ApplicationException getOne(IVgnErrorCode code, Object src, MsgObject msgObj) {
    return null;
  }
  
  public static ApplicationException getOne(IVgnErrorCode code, Object src, VgnException ex) {
    return null;
  }
  
  public static ApplicationException getOne(Object src, MsgObject msgObj, VgnException ex) {
    return null;
  }
  
  public static ApplicationException getOne(Object src, MsgObject msgObj, Throwable ex) {
    return null;
  }
  
  public static ApplicationException getOne(Object src, VgnException ex) {
    return null;
  }
  
  public static ApplicationException getOne(Object src, VgnRuntimeException ex) {
    return null;
  }
  
  public static ApplicationException getOne(Object src, Throwable ex) {
    return null;
  }
}
