package com.vignette.ext.templating.cache;

import com.vignette.as.client.exception.ApplicationException;
import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;


public class CachingDetail implements Serializable {
  public TTL getTtl() {
   return null;
  }
  
  public String getTtlMilliSecs() {
    return null;
  }
  
  public int getTimeBasedInvalidationPolicy() {
    return 0;
  }
  
  public String getStalePageReturnPolicy() {
    return null;
  }
  
  public Date getAbsoluteTime() {
    return null;
  }
  
  public TimeZone getTimeZone() {
    return null;
  }
  
  public Locale getLocale() {
    return null;
  }
  
  public void setTtl(TTL ttl) {
  }
  
  public void setTimeBasedInvalidationPolicy(int timeBasedInvalidationPolicy) {
  }
  
  public void setStalePageReturnPolicy(String stalePageReturnPolicy) {
  }
  
  public void setAbsoluteTime(Date absoluteTime) {
  }
  
  public void setTimeZone(TimeZone timeZone) {
  }
  
  public void setLocale(Locale locale) {
  }
  
  public static class TTL implements Serializable {
    
    public static final int SECONDS = 0;
    
    public static final int MINUTES = 0;
    
    public static final int HOURS = 0;
    
    public static final int DAYS = 0;
    
    public TTL() {}
    
    public TTL(String ttlValue, int ttlUnits) {
    }
    
    public void setTtlValue(String ttlValue) {

    }
    
    public void setTtlUnits(int ttlUnits) {

    }
    
    public String getTtlValue() {
        return null;
    }
    
    public int getTtlUnits() {
        return 0;
    }
    
    public String toMillis() {
        return null;
    }
    
    public String toXML() {
        return null;
    }
    
    public static TTL createFromXML(String xml) throws ApplicationException {
        return null;
    }
    
    public boolean equals(TTL anotherTTL) {
    return true;
    }
  }
}
