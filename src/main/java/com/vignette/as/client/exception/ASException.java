package com.vignette.as.client.exception;

import com.vignette.logging.VgnLoggedException;
import com.vignette.util.IVgnErrorCode;
import com.vignette.util.MsgObject;

public abstract class ASException extends VgnLoggedException {
  public ASException(IVgnErrorCode code, Object src, MsgObject msgObj, Throwable ex) {
      super(code, src, msgObj, ex);
     }
}
