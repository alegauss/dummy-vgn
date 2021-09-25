package com.vignette.util;

import com.vignette.logging.ILogMsg;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Locale;

public class MsgObject implements Serializable, ILogMsg {
  
  protected String mDefaultMsg = null;
  
  protected String mBundleName;
  
  protected String mMsgKey;
  
  protected Object[] mArgs;
  
  protected int mPackageId;
  
  protected int mProductId;
  
  
  protected MsgObject(String bundleName, String msgKey, Object[] args, int pkgId, int productId, ClassLoader loader) {
  
  }
  
  public String localize(Locale locale, ClassLoader loader) {
    return null;
  }
  
  public String localize(Locale locale) {
    return null;
  }
  
  public String localize(ClassLoader loader) {
    return null;
  }
  
  public String localize() {
    return null;
  }
  
  public String getMsgId() {
    return null;
  }
  
  public String toString() {
    return null;
  }
  
  public String toBundleString() {
    return null;
  }
  
  public Object[] getMsgArgs() {
    return null;
  }
  
  public String[] getMsgArgsAsString() {
    return null;
  }
  
  public String getBundleName() {
    return null;
  }
  public String getMsgKey() {
    return null;
  }
}
