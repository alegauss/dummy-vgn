package com.vignette.cms.client.common;

import com.vignette.authz.client.AccessControlList;
import com.vignette.translate.ITranslatableBundle;
import com.vignette.util.Bundle;

import com.vignette.util.IObjectProp;

import java.io.Serializable;
import java.util.Date;

public class CMSObjectBundle extends Bundle implements Serializable, ITranslatableBundle {
 
  
  public CMSObjectBundle() {
    super(null);
  }
  
  public CMSObjectBundle(CMSObjectBundleFlags flags) {
    super(flags);
  }
  
  public Object get(IObjectProp prop) {
    return null;
  }
  
  public void set(IObjectProp prop, Object val) {

  }
  
  public void remove(IObjectProp prop) {
  
  }
  
  protected IObjectProp getPropInstance(int val) {
    return null;
  }
  public boolean hasCreationTime() {
    return true;
  }
  
  public Date getCreationTime() {
    return null;
  }
  
  public void setCreationTime(Date val) {
    
  }
  
  public void removeCreationTime() {
    
  }
  
  public boolean hasCreator() {
    return true;
  }
  
  public String getCreator() {
    return null;
  }
  
  public void setCreator(String val) {
    
  }
  
  public void removeCreator() {
    
  }
  
  public boolean hasLastModComment() {
    return true;
  }
  
  public String getLastModComment() {
    return null;
  }
  
  public void setLastModComment(String val) {
   
  }
  
  public void removeLastModComment() {
   
  }
  
  public boolean hasHistoryList() {
    return true;
  }
  
  public CMSObjectHistoryEntry[] getHistoryList() {
    return null;
  }
  
  public void setHistoryList(CMSObjectHistoryEntry[] val) {
      }
  
  public void removeHistoryList() {
      }
  
  public boolean hasLastModifier() {
    return true;
  }
  
  public String getLastModifier() {
    return null;
  }
  
  public void setLastModifier(String val) {
    
  }
  
  public void removeLastModifier() {
   
  }
  
  public boolean hasLastModTime() {
    return true;
  }
  
  public Date getLastModTime() {
    return null;
  }
  
  public void setLastModTime(Date val) {
    
  }
  
  public void removeLastModTime() {
   
  }
  
  public boolean hasLockCount() {
    return true;
  }
  
  public int getLockCount() {
    return 0;
  }
  
  public void setLockCount(int val) {
    
  }
  
  public void removeLockCount() {
    
  }
  
  public boolean hasLockOwner() {
    return true;
  }
  
  public String getLockOwner() {
    return null;
  }
  
  public void setLockOwner(String val) {
   
  }
  
  public void removeLockOwner() {
   
  }
  
  public boolean hasLockTime() {
    return true;
  }
  
  public Date getLockTime() {
    return null;
  }
  
  public void setLockTime(Date val) {
   
  }
  
  public void removeLockTime() {
   
  }
  
  public boolean hasModCount() {
    return true;
  }
  
  public int getModCount() {
    return 1;
  }
  
  public void setModCount(int val) {
    
  }
  
  public void removeModCount() {
   
  }
  
  public boolean hasPubModCount1() {
    return true;
  }
  
  public int getPubModCount1() {
    return 1;
  }
  
  public void setPubModCount1(int val) {
    
  }
  
  public void removePubModCount1() {
    
  }
  
  public boolean hasPubModCount2() {
    return true;
  }
  
  public int getPubModCount2() {
    return 1;
  }
  
  public void setPubModCount2(int val) {
    
  }
  
  public void removePubModCount2() {
    
  }
  
  public boolean hasPubModTime() {
    return true;
  }
  
  public long getPubModTime() {
    return 0L;
  }
  
  public void setPubModTime(long val) {
    
  }
  
  public void removePubModTime() {
   
  }
  
  public boolean hasName() {
    return true;
  }
  
  public String getName() {
    return null;
  }
  
  public void setName(String val) {
    
  }
  
  public void removeName() {
   
  }
  
  public boolean hasNoteList() {
    return true;
  }
  
  public CMSObjectNote[] getNoteList() {
    return null;
  }
  
  public void setNoteList(CMSObjectNote[] val) {
    
  }
  
  public void removeNoteList() {
   
  }
  
  public boolean hasId() {
    return true;
  }
  
  public ObjectId getId() {
    return null;
  }
  
  public void setId(ObjectId val) {
   
  }
  
  public void removeId() {
   
  }
  
  public boolean hasObjectType() {
    return true;
  }
  
  public CMSObjectType getObjectType() {
    return null;
  }
  
  public void setObjectType(CMSObjectType val) {
  
  }
  
  public void removeObjectType() {
    
  }
  
  public boolean hasDeploymentType() {
    return true;
  }
  
  public String getDeploymentType() {
    return null;
  }
  
  public void setDeploymentType(String val) {
   
  }
  
  public void removeDeploymentType() {
    
  }
  
  public boolean hasSnapshotList() {
    return true;
  }
  
  public Snapshot[] getSnapshotList() {
   return null;
  }
  
  public void setSnapshotList(Snapshot[] val) {
   
  }
  
  public void removeSnapshotList() {
 
  }
  
  public boolean hasDeploymentGroupList() {
    return true;
  }
  
  public ObjectId[] getDeploymentGroupList() {
    return null;
  }
  
  public void setDeploymentGroupList(ObjectId[] val) {
  
  }
  
  public void removeDeploymentGroupList() {
    
  }
  
  public boolean hasAcl() {
    return true;
  }
  
  public AccessControlList getAcl() {
    return null;
  }
  
  public void setAcl(AccessControlList val) {

  }
  
  public void removeAcl() {
  
  }
  
  public boolean hasAssociationList() {
    return true;
  }
  
  public Association[] getAssociationList() {
    return null;
  }
  
  public void setAssociationList(Association[] val) {

  }
  
  public void removeAssociationList() {
   
  }
  
  public boolean hasAutoChangeHistoryTracking() {
    return true;
  }
  
  public boolean getAutoChangeHistoryTracking() {
    return true;
  }
  
  public void setAutoChangeHistoryTracking(boolean val) {
    
  }
  
  public void removeAutoChangeHistoryTracking() {
    
  }
  
  public boolean hasHiddenComputedReferenceList() {
    return true;
  }
  
  public CMSReferenceBundle[] getHiddenComputedReferenceList() {
    return null;
  }
  
  public void setHiddenComputedReferenceList(CMSReferenceBundle[] val) {
   
  }
  
  public void removeHiddenComputedReferenceList() {
    
  }
  
  public boolean hasComputedReferenceList() {
    return true;
  }
  
  public CMSReferenceBundle[] getComputedReferenceList() {
    return null;
  }
  
  public void setComputedReferenceList(CMSReferenceBundle[] val) {
    }
  
  public void removeComputedReferenceList() {
    
  }
  
  public boolean hasAdhocReferenceList() {
    return true;
  }
  
  public CMSReferenceBundle[] getAdhocReferenceList() {
    return null;
  }
  
  public void setAdhocReferenceList(CMSReferenceBundle[] val) {
   
  }
  
  public void removeAdhocReferenceList() {
    
  }
  
  public boolean hasLocaleId() {
    return true;
  }
  
  public ObjectId getLocaleId() {
    return null;
  }
  
  public void setLocaleId(ObjectId val) {
    
  }
  
  public void removeLocaleId() {
  
  }
  
  public boolean hasTranslationGroupId() {
    return true;
  }
  
  public ObjectId getTranslationGroupId() {
    return null;
  }
  
  public void setTranslationGroupId(ObjectId val) {
 
  }
  
  public void removeTranslationGroupId() {
  
  }
}
