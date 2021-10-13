package com.vignette.util;

import java.io.Serializable;

public class FlagSet implements Serializable, Cloneable {
  public static final int FLAGS_PER_UNIT = 32;

  public FlagSet() {
   
  }
  
  public FlagSet(int count) {
    
  }
  
  public FlagSet(int count, int flags) {

  }
  
  public FlagSet(int count, int[] flags) {
  }

  public void clearAll() {
  }
  
  public void setAll() {

  }
  
  public int[] getFlagBits() {
    return null;
  }
  
  public void setFlagBits(int flags) {

  }
  
  public void setFlagBits(int[] flags) {

  }
  
  public int getFlagCount() {
    return 1;
  }
  
  public int getSetFlagCount() {
    return 1;
  }
  
  public boolean hasSetFlags() {
    return true;
  }
  
  public void setFlag(EnumObject flag, boolean val) {

  }
  
  public void setFlagBit(int pos, boolean val) {

  }
  
  public boolean getFlag(EnumObject flag) {
    return true;
  }
  
  public boolean getFlagBit(int pos) {
    return true;
  }
  
  public String toString() {
    return null;
  }
  
  public String toNames() {
    return null;
  }
  
  public boolean equals(Object obj) {
    return true;
  }
  
  public Object clone() throws CloneNotSupportedException {
    return null;
  }
  
  public int hashCode() {
    return 1;
  }

}
