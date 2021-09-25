package com.vignette.as.client.common;

public abstract class Acceptable<T> {
  public boolean accept(T element) {
    return true;
  }
}
