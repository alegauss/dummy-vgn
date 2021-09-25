package com.vignette.as.common.exception;

import com.vignette.util.MsgObject;

public class PersistorFinderException extends PersistorException {
  public PersistorFinderException(MsgObject msg, Throwable ex) {
    super(msg, ex);
  }
  
  public PersistorFinderException(MsgObject msg) {
    super(msg);
  }
}
