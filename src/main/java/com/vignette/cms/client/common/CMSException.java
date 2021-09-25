package com.vignette.cms.client.common;

import com.vignette.logging.Priority;
import com.vignette.logging.VgnLoggedException;
import com.vignette.util.IVgnErrorCode;
import com.vignette.util.MsgObject;

public class CMSException extends VgnLoggedException {
  public static CMSException getOne(CMSErrorCode code, Object src, MsgObject msgObj, Throwable ex) {
    return null;
  }
  
  public static CMSException getOne(CMSErrorCode code, Object src, MsgObject msgObj, Throwable ex, Priority priority) {
    return null;
  }
  
  public static CMSException getOne(CMSErrorCode code, Object src, Throwable ex) {
    return null;
  }
  
  public static CMSException getOne(Object src, MsgObject msgObj, Throwable ex) {
    return null;
  }
  
  public static CMSException getOne(Object src, Throwable ex) {
    return null;
  }
  
  public static CMSException getOne(CMSErrorCode code, Object src, MsgObject msgObj) {
    return null;
  }
  
  protected CMSException(CMSErrorCode code, Object src, MsgObject msgObj, Throwable ex) {
      super(code, src, msgObj, ex);
  }
  
  protected CMSException(CMSErrorCode code, Object src, MsgObject msgObj, Throwable ex, Priority priority) {
    super(code, src, msgObj, ex);
  }
  
  protected IVgnErrorCode getUnknownErrorCode() {
    return null;
  }
}
