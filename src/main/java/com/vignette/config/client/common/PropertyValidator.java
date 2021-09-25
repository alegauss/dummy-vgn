package com.vignette.config.client.common;

import com.vignette.as.client.exception.ValidationException;
import com.vignette.translate.ITranslatableJavaBean;
import java.io.Serializable;

public class PropertyValidator implements Serializable, ITranslatableJavaBean {
  private static final long serialVersionUID = 1L;
  
  public void validate(String value) throws ValidationException {
   
  }
  
  public void validate(String name, String value) throws ValidationException {}
  
  protected static ValidationException invalid(String name, String value) {
   return null;
  }
  
  protected static ValidationException invalid(String name, String value, Throwable t) {
    return null;
  }
  
  public static PropertyValidator getIntegerValidator() {
    return null;
  }
  
  public static PropertyValidator getBooleanValidator() {
    return null;
  }
  
  public static PropertyValidator getLocaleTagValidator() {
    return null;
  }
}
