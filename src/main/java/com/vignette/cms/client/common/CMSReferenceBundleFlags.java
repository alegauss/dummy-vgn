package com.vignette.cms.client.common;

import com.vignette.translate.ITranslatableJavaBean;
import com.vignette.util.PropFlags;
import com.vignette.util.VgnIllegalArgumentException;

public class CMSReferenceBundleFlags extends PropFlags implements ITranslatableJavaBean {
  public CMSReferenceBundleFlags() {
    super(1, 0);
  }
  
  public CMSReferenceBundleFlags(int bits) throws VgnIllegalArgumentException {
    super(1, bits);
  }
  
  public CMSReferenceBundleFlags(int[] bits) throws VgnIllegalArgumentException {
    super(1, bits);
  }
  
  protected CMSReferenceBundleFlags(int count, int bits) throws VgnIllegalArgumentException {
    super(count, bits);
  }
  
  protected CMSReferenceBundleFlags(int count, int[] bits) throws VgnIllegalArgumentException {
    super(count, bits);
  }
  
  public boolean hasReferrerId() {
    return true;
  }
  
  public void setReferrerId() {
    
  }
  
  public void clearReferrerId() {
   
  }
  
  public boolean hasReferentId() {
    return true;
  }
  
  public void setReferentId() {
    
  }
  
  public void clearReferentId() {
    
  }
  
  public boolean hasRecordSourceId() {
    return true;
  }
  
  public void setRecordSourceId() {
    
  }
  
  public void clearRecordSourceId() {
    
  }
  
  public boolean hasReferentRecordSourceId() {
    return true;
  }
  
  public void setReferentRecordSourceId() {
   
  }
  
  public void clearReferentRecordSourceId() {
    
  }
  
  public boolean hasReferenceName() {
    return true;
  }
  
  public void setReferenceName() {
  
  }
  
  public void clearReferenceName() {
  
  }
  
  public boolean hasType() {
    return true;
  }
  
  public void setType() {
    
  }
  
  public void clearType() {
  }
  
  public boolean hasPublishPolicy() {
    return true;
  }
  
  public void setPublishPolicy() {
   
  }
  
  public void clearPublishPolicy() {
   
  }
  
  public boolean hasUnpublishPolicy() {
    return true;
  }
  
  public void setUnpublishPolicy() {
    
  }
  
  public void clearUnpublishPolicy() {
   
  }
  
  public boolean hasMetadata() {
    return true;
  }
  
  public void setMetadata() {
    
  }
  
  public void clearMetadata() {
    
  }
  
  public String toNames() {
    return null;
  }
}
