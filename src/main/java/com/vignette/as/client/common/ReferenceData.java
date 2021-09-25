package com.vignette.as.client.common;

import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.logging.LoggingManager;
import com.vignette.logging.context.ContextLogger;
import com.vignette.util.MsgObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ReferenceData extends ReferenceBaseData implements Serializable {
  private static ContextLogger logCat = LoggingManager.getContextLogger(ReferenceData.class);
  
  private static ReferenceType defaultReferenceType = ReferenceType.CONTENT_TYPE_KEYS;
  
  private static final String KEY_NAME_DELIM = "+";
  
  public void setParentData(ApplicationObjectData parent) {
   
  }
  
  public ReferenceData(ReferenceType type) {
  
  }
  
  public ReferenceData() {
    
  }
  
  public ReferenceType getReferenceType() {
    return null;
  }
  
  public void setReferenceType(ReferenceType referenceType) {
    
  }
  
  public void setReferenceTypeValue(int referenceTypeValue) {

  }
  
  public ContentTypeRef getReferencedContentType() {
    return null;
  }
  
  public void setReferencedContentType(ContentTypeRef ref) {

  }
  
  public PolicyType getDeletionPolicy() {
    return null;
  }
  
  public void setDeletionPolicy(PolicyType policy) {

  }
  
  public void setDeletionPolicyValue(int deletionPolicyValue) {

  }
  
  public PolicyType getDemotionPolicy() {
    return null;
  }
  
  public void setDemotionPolicy(PolicyType policy) {

  }
  
  public void setDemotionPolicyValue(int demotionPolicyValue) {

  }
  
  public PolicyType getExportPolicy() {
    return null;
  }
  
  public void setExportPolicy(PolicyType policy) {

  }
  
  public void setExportPolicyValue(int exportPolicyValue) {

  }
  
  public PolicyType getPromotionPolicy() {
    return null;
  }
  
  public int getPromotionPolicyValue() {
    return 1;
  }
  
  public void setPromotionPolicy(PolicyType policy) {

  }
  
  public void setPromotionPolicyValue(int promotionPolicyValue) {

  }
  
  private PolicyType convertPromotionPolicyType(PolicyType policy) {
    return null;
  }
  
  public PolicyType getSnapshotPolicy() {
    return null;
  }
  
  public void setSnapshotPolicy(PolicyType policy) {

  }
  
  public void setSnapshotPolicyValue(int snapshotPolicyValue) {

  }
  
  public boolean isFilePath() {
    return true;
  }
  
  public boolean isContentTypeKeys() {
    return true;
  }
  
  public boolean isVCMGUID() {
    return true;
  }
  
  public MsgObject[] validate() {
    return null;
  }
  
  public boolean hasValidReferenceType() {
    return true;
  }
  
  public boolean hasValidKeys() {
    return true;
  }
  
  public boolean hasValidKeySequence() {
    return true;
  }
  
  public Enumeration enumerateKey() {
    return null;
  }
  public KeyData[] getKey() {
    return null;
  }
  public int getKeyCount() {
    return 0;
  }
  
  public void addKey(KeyData key) throws IndexOutOfBoundsException {
  }
  
  public void addKey(int index, KeyData vKey) throws IndexOutOfBoundsException {
  }
  
  public boolean removeKey(KeyData key) {
    return true;
  }
  
  public void clearKey() {
  }
  
  public Collection getKeyCollection() {
    return null;
  }
  
  public void setKey(int index, KeyData vKey) throws IndexOutOfBoundsException {
  }
  
  public void setKey(KeyData[] keyArray) {
  }
  
  public void setKeyCollection(Collection pCollection) {
  }
  
  public boolean isRequired() {
    return true;
  }
  
  public String getReferenceName() {
    return null;
  }
  
  public static String getReferenceName(String[] keyNames) {
    return null;
  }
  
  public boolean equalIdentity(ReferenceData reference) {
    return true;
  }
}
