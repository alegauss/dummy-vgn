package com.vignette.util;

import java.io.Serializable;

public abstract class Bundle implements Serializable {
  protected PropFlags _flags;
  
  public Bundle(PropFlags flags) {

  }
  
  public PropFlags getFlags() {
    return null;
  }
  
  public void clearFlags() {

  }
  
  public IObjectProp[] getProperties() {
    return null;
  }
  
  public IObjectProp[] getSupportedProperties() {
    return null;
  }
  
  protected abstract IObjectProp getPropInstance(int paramInt);
  
  public boolean equals(Object obj) {
    return true;
  }
  
  public String toString() {
    return null;
  }
  
  public String toString(String delim) {
    return null;
  }
  
  protected boolean isPrintable(IObjectProp prop) {
    return true;
  }
  
  public boolean has(IObjectProp prop) {
    return true;
  }
  
  public Object get(IObjectProp prop) {
    throw new VgnIllegalArgumentException("null");
  }
  
  public void set(IObjectProp prop, Object val) {
    throw new VgnIllegalArgumentException("null");
  }
  
  public void remove(IObjectProp prop) {
    throw new VgnIllegalArgumentException("null");
  }
  
  public void copyValuesTo(Bundle that) {
 
  }
  
  public void copyValuesFrom(Bundle that) {

  }
  
  public void mergeValuesFrom(Bundle that) {

  }
}
