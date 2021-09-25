package com.vignette.ext.templating.client.javabean;

import java.io.Serializable;
import java.util.Comparator;

public class RegionEntry implements Serializable {
  
  public RegionEntry() {}
  
  public RegionEntry(String regionId, int sequenceNumber) {
    
  }
  
  public String getRegionId() {
    return null;
  }
  
  public void setRegionId(String regionId) {
  }
  
  public int getSequenceNumber() {
    return 0;
  }
  
  public void setSequenceNumber(int sequenceNumber) {
  }
  
  public static Comparator<RegionEntry> getSequenceComparator(final boolean asc) {
    return null;
  }
}
