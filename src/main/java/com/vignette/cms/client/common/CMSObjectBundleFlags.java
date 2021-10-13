package com.vignette.cms.client.common;

import com.vignette.translate.ITranslatableJavaBean;
import com.vignette.util.PropFlags;
import com.vignette.util.VgnIllegalArgumentException;

public class CMSObjectBundleFlags extends PropFlags implements ITranslatableJavaBean {
  public CMSObjectBundleFlags() {
    super(1,1);
  }
  
  public CMSObjectBundleFlags(int bits) throws VgnIllegalArgumentException {
    super(1, bits);
  }
  
  public CMSObjectBundleFlags(int[] bits) throws VgnIllegalArgumentException {
    super(1, bits);
  }
  
  protected CMSObjectBundleFlags(int count, int bits) throws VgnIllegalArgumentException {
    super(count, bits);
  }
  
  protected CMSObjectBundleFlags(int count, int[] bits) throws VgnIllegalArgumentException {
    super(count, bits);
  }
  
  public boolean hasCreationTime() {
    return true;
  }
  
  public void setCreationTime() {
    
  }
  
  public void clearCreationTime() {
    
  }
  
  public boolean hasCreator() {
    return true;
  }
  
  public void setCreator() {
    
  }
  
  public void clearCreator() {
   
  }
  
  public boolean hasLastModComment() {
    return true;
  }
  
  public void setLastModComment() {
    
  }
  
  public void clearLastModComment() {
    
  }
  
  public boolean hasHistoryList() {
    return true;
  }
  
  public void setHistoryList() {
    
  }
  
  public void clearHistoryList() {
    
  }
  
  public boolean hasLastModifier() {
    return true;
  }
  
  public void setLastModifier() {
   
  }
  
  public void clearLastModifier() {
   
  }
  
  public boolean hasLastModTime() {
    return true;
  }
  
  public void setLastModTime() {
    
  }
  
  public void clearLastModTime() {
    
  }
  
  public boolean hasLockCount() {
    return true;
  }
  
  public void setLockCount() {
    
  }
  
  public void clearLockCount() {
    
  }
  
  public boolean hasLockOwner() {
    return true;
  }
  
  public void setLockOwner() {
    
  }
  
  public void clearLockOwner() {
   
  }
  
  public boolean hasLockTime() {
    return true;
  }
  
  public void setLockTime() {
    
  }
  
  public void clearLockTime() {
    
  }
  
  public boolean hasModCount() {
    return true;
  }
  
  public void setModCount() {
    
  }
  
  public void clearModCount() {
    
  }
  
  public boolean hasPubModCount1() {
    return true;
  }
  
  public void setPubModCount1() {
    
  }
  
  public void clearPubModCount1() {
    
  }
  
  public boolean hasPubModCount2() {
    return true;
  }
  
  public void setPubModCount2() {
    
  }
  
  public void clearPubModCount2() {
   
  }
  
  public boolean hasPubModTime() {
    return true;
  }
  
  public void setPubModTime() {
    
  }
  
  public void clearPubModTime() {
   
  }
  
  public boolean hasName() {
    return true;
  }
  
  public void setName() {
    
  }
  
  public void clearName() {
   
  }
  
  public boolean hasNoteList() {
    return true;
  }
  
  public void setNoteList() {
    
  }
  
  public void clearNoteList() {
    
  }
  
  public boolean hasId() {
    return true;
  }
  
  public void setId() {
   
  }
  
  public void clearId() {
   
  }
  
  public boolean hasObjectType() {
    return true;
  }
  
  public void setObjectType() {
    
  }
  
  public void clearObjectType() {
  
  }
  
  public boolean hasDeploymentType() {
    return true;
  }
  
  public void setDeploymentType() {
   
  }
  
  public void clearDeploymentType() {
    
  }
  
  public boolean hasSnapshotList() {
    return true;
  }
  
  public void setSnapshotList() {
    
  }
  
  public void clearSnapshotList() {
    
  }
  
  public boolean hasDeploymentGroupList() {
    return true;
  }
  
  public void setDeploymentGroupList() {
    
  }
  
  public void clearDeploymentGroupList() {
    
  }
  
  public boolean hasAcl() {
    return true;
  }
  
  public void setAcl() {

  }
  
  public void clearAcl() {
  }
  
  public boolean hasAssociationList() {
    return true;
  }
  
  public void setAssociationList() {
    
  }
  
  public void clearAssociationList() {
    
  }
  
  public boolean hasAutoChangeHistoryTracking() {
    return true;
  }
  
  public void setAutoChangeHistoryTracking() {
   
  }
  
  public void clearAutoChangeHistoryTracking() {
   
  }
  
  public boolean hasHiddenComputedReferenceList() {
    return true;
  }
  
  public void setHiddenComputedReferenceList() {
   
  }
  
  public void clearHiddenComputedReferenceList() {
   
  }
  
  public boolean hasComputedReferenceList() {
    return true;
  }
  
  public void setComputedReferenceList() {
   
  }
  
  public void clearComputedReferenceList() {
    
  }
  
  public boolean hasAdhocReferenceList() {
    return true;
  }
  
  public void setAdhocReferenceList() {
   
  }
  
  public void clearAdhocReferenceList() {
   
  }
  
  public boolean hasLocaleId() {
    return true;
  }
  
  public void setLocaleId() {
   
  }
  
  public void clearLocaleId() {
    
  }
  
  public boolean hasTranslationGroupId() {
    return true;
  }
  
  public void setTranslationGroupId() {
    
  }
  public void clearTranslationGroupId() {
    
  }
  
  public String toNames() {
    return null;
  }
}
