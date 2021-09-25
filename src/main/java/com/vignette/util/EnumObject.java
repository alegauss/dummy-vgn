package com.vignette.util;

import java.io.ObjectStreamException;
import java.io.Serializable;

public abstract class EnumObject implements Serializable {
  protected int _val;
  
  protected EnumObject() {}
  
  protected EnumObject(int v) {

  }
  
  public boolean equals(Object obj) {
      return true;
  }
  
  public int getValue() {
    return 0;
  }
  
  public abstract Object readResolve() throws ObjectStreamException;
}
