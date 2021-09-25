package com.vignette.config.client.common;

import com.vignette.as.client.exception.ValidationException;
import com.vignette.translate.ITranslatableJavaBean;
import com.vignette.util.MsgObject;
import java.io.Serializable;
import java.util.Locale;

public class PropertyMetadata implements Serializable, ITranslatableJavaBean {
  private static final long serialVersionUID = 6175542618643888512L;
  
  public enum Type {
    REQUIRED, OPTIONAL, INTERNAL, READONLY;
  }
  
  public boolean isRequired() {
    return true;
  }
  
  public boolean isOptional() {
    return true;
  }
  
  public boolean isInternal() {
    return true;
  }
  
  public boolean isReadonly() {
    return true;
  }
  
  public void setType(Type type) {
  }
  
  public Type getType() {
    return null;
  }
  
  public void setName(String name) {
  }
  
  public String getName() {
    return null;
  }
  
  public void setDisplayName(MsgObject displayName) {
   
  }
  
  public MsgObject getDisplayName() {
    return null;
  }
  
  public String getDisplayName(Locale locale) {
    return null;
  }
  
  public void setDescription(MsgObject description) {
    
  }
  
  public String getDescription(Locale locale) {
    return null;
  }
  
  public void setDescription(String description) {
   
  }
  
  public String getDescription() {
    return null;
  }
  
  public void setMultiValued(boolean multiValued) {
  }
  
  public boolean isMultiValued() {
    return true;
  }
  
  public void setDefaultValue(String defaultValue) {

  }
  
  public String getDefaultValue() {
    return null;
  }
  
  public void setOptions(String[] options) {
    
  }
  
  public String[] getOptions() {
    return null;
  }
  
  public void setEncrypted(boolean encrypted) {
    
  }
  
  public boolean isEncrypted() {
    return true;
  }
  
   public void setNormalizer(PropertyNormalizer normalizer) {
    
  }
  
  public PropertyNormalizer getNormalizer() {
    return null;
  }
  
  public String normalize(String value) {
    return null;
  }
  
  public void setValidator(PropertyValidator validator) {
    
  }
  
  public PropertyValidator getValidator() {
    return null;
  }
  
  public void validate(String value) throws ValidationException {
   
  }
  
  public PropertyMetadata() {}
  
  public PropertyMetadata(String name) {
    
  }
  
  public PropertyMetadata(String name, MsgObject displayName, MsgObject description) {
   
  }
  
  public PropertyMetadata(String name, MsgObject displayName, MsgObject description, boolean encrypted) {
   
  }
  
  public PropertyMetadata(String name, MsgObject displayName, MsgObject description, PropertyValidator validator) {
    
  }
  
  public PropertyMetadata(String name, MsgObject displayName, MsgObject description, Type type) {
   
  }
  
  public PropertyMetadata(String name, MsgObject displayName, MsgObject description, String defaultValue, Type type) {
    
  }
  
  public PropertyMetadata(String name, MsgObject displayName, MsgObject description, String defaultValue, PropertyValidator validator, Type type) {
    
  }
  
  public PropertyMetadata(String name, MsgObject displayName, MsgObject description, Type type, boolean encrypted) {
    
  }
  
  public PropertyMetadata(String name, MsgObject displayName, MsgObject description, String defaultValue, Type type, boolean encrypted) {
   
  }
}
