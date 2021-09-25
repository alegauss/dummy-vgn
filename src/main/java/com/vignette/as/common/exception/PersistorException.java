package com.vignette.as.common.exception;

import com.vignette.logging.VgnLoggedException;
import com.vignette.util.MsgObject;

public abstract class PersistorException extends VgnLoggedException {
  public PersistorException(MsgObject msg, Throwable ex) {
    super(null, null, null, null);
  }
  
  public PersistorException(MsgObject msg) {
    super(null, null, null, null);
  }
}