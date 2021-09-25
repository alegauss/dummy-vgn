package com.vignette.as.client.common;

import com.vignette.as.client.common.ref.ContentTypeRef;
import java.io.Serializable;
import java.util.Collection;
import java.util.Enumeration;

public class ReferenceBaseData extends ApplicationObjectData implements Serializable {
    
  public ReferenceBaseData() {
  
  }
  
  public void addKey(KeyData vKey) throws IndexOutOfBoundsException {
 
  }
  
  public void addKey(int index, KeyData vKey) throws IndexOutOfBoundsException {
   
  }
  
  public void clearKey() {
   
  }
  
  public void deleteDeletionPolicyValue() {
  
  }
  
  public void deleteDemotionPolicyValue() {
  
  }
  
  public void deleteExportPolicyValue() {
 
  }
  
  public void deletePromotionPolicyValue() {
   
  }
  
  public void deleteSnapshotPolicyValue() {
    
  }
  
  public Enumeration enumerateKey() {
    return null;
  }
  
  public int getDeletionPolicyValue() {
    return 1;
  }
  
  public int getDemotionPolicyValue() {
    return 1;
  }
  
  public int getExportPolicyValue() {
    return 0;
  }
  
  public KeyData getKey(int index) throws IndexOutOfBoundsException {
    return null;
  }
  
  public KeyData[] getKey() {
    return null;
  }
  
  public Collection getKeyCollection() {
    return null;
  }
  
  public int getKeyCount() {
    return 0;
  }
  
  public int getPromotionPolicyValue() {
    return 0;
  }
  
  public int getReferenceTypeValue() {
    return 0;
  }
  
  public ContentTypeRef getReferencedContentType() {
    return null;
  }
  
  public int getSnapshotPolicyValue() {
    return 0;
  }
  
  public boolean hasDeletionPolicyValue() {
    return true;
  }
  
  public boolean hasDemotionPolicyValue() {
    return true;
  }
  
  public boolean hasExportPolicyValue() {
    return true;
  }
  
  public boolean hasPromotionPolicyValue() {
    return true;
  }
  
  public boolean hasReferenceTypeValue() {
    return true;
  }
  
  public boolean hasSnapshotPolicyValue() {
    return true;
  }
  
  public boolean removeKey(KeyData vKey) {
    return true;
  }
  
  public void setDeletionPolicyValue(int deletionPolicyValue) {
    
  }
  
  public void setDemotionPolicyValue(int demotionPolicyValue) {
    
  }
  
  public void setExportPolicyValue(int exportPolicyValue) {
   
  }
  
  public void setKey(int index, KeyData vKey) throws IndexOutOfBoundsException {
  
  }
  
  public void setKey(KeyData[] keyArray) {
    
  }
  
  public void setKeyCollection(Collection pCollection) {
  
  }
  
  public void setPromotionPolicyValue(int promotionPolicyValue) {
   
  }
  
  public void setReferenceTypeValue(int referenceTypeValue) {
 
  }
  
  public void setReferencedContentType(ContentTypeRef referencedContentType) {
  
  }
  
  public void setSnapshotPolicyValue(int snapshotPolicyValue) {
  
  }
}
