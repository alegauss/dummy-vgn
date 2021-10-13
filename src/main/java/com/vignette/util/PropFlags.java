package com.vignette.util;

public class PropFlags extends FlagSet {
  protected PropFlags(int count, int bits) {
    super(count, bits);
  }
  
  protected PropFlags(int count, int[] bits) {
    super(count, bits);
  }
  
  public void set(IObjectProp flag) {
    setFlag((EnumObject)flag, true);
  }
  
  public void clear(IObjectProp flag) {
    
  }
  
  public boolean isSet(IObjectProp flag) {
    return true;
  }
}
