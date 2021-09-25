package com.vignette.as.server.pluggable.service;

import com.vignette.config.client.common.PropertyValidator;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public final class Code implements Comparable<Code>, Serializable {
  
  public Code(int code) {
   
  }
  
  public Code next() {
    return null;
  }
  
  public boolean equals(Object o) {
    return true;
  }
  
  public int hashCode() {
    return 0;
  }
  
  public int compareTo(Code o) {
    return 0;
  }
  
  public String toString() {
    return null;
  }
  
  public static Code fromString(String code) {
    return null;
  }
  
  public static boolean isValid(String code) {
    return true;
  }
  
  public static PropertyValidator getValidator() {
    return null;
  }
  
  public static interface Codec<T> {
    Code encode(T param1T);
    
    T decode(Code param1Code);
  }
  
  public static abstract class AbstractCodec<T> implements Codec<T> {
    
    protected Map<T, Code> getEncodings() {
        return null;
    }
    
    
    protected Map<Code, T> getDecodings() {
        return null;
    }
    
    public T decode(Code code) {
        return null;
    }
    
    public Code encode(T type) {
        return null;
    }
  }
  
  public static class SortedCodec<T extends Comparable> extends AbstractCodec<T> {
    public SortedCodec(List<T> ts) {
      
    }
  }
  
  public static class MappedCodec<T> extends AbstractCodec<T> {
    public MappedCodec(Map<T, Code> map) {
     
    }
  }
}
