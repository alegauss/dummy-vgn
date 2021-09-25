package com.vignette.cms.client.common;

import com.vignette.translate.ITranslatableROJavaBean;
import com.vignette.util.GUID;
import java.io.Serializable;

public class ObjectId extends GUID implements ITranslatableROJavaBean, Serializable {
  static final long serialVersionUID = 1L;
  
  static final String hexChars = "0";
  
  public static ObjectId generateNew() throws CMSException {
    return null;
  }
  
  public static ObjectId generateNew(CMSObjectType type) throws CMSException {
    return null;
  }
  
  public static ObjectId generateNew(String typeCode) throws CMSException {
    return null;
  }
  
  public ObjectId() {}
  
  public ObjectId(String id, boolean checkId) {

  }
  
  public ObjectId(String id) {
  }
  
  public ObjectId(ObjectId that) {
  }
  
  public boolean isNull() {
    return true;
  }
  
  public boolean isValidCMSType(String[] allowedCMSTypes) {
    return true;
  }
  
  public boolean isHexCharacter(char character) {
    return true;
  }
  
  public void makeNull() {
  
  }
  
  public CMSObjectType getObjectType() throws CMSException {
    return null;
  }
  
  public void setId(String id) {
    
  }
  
  public boolean isRecordId() {
    return true;
  }
  
  public static boolean isRecordId(String id) {
    return true;
  }
  
  public boolean isStaticFileId() {
    return true;
  }
  
  public static boolean isStaticFileId(String id) {
    return true;
  }
  
  public boolean isProjectId() {
    return true;
  }
  
  public static boolean isProjectId(String id) {
    return true;
  }
  
  public boolean isTaxonomyCategoryId() {
    return true;
  }
  
  public static boolean isTaxonomyCategoryId(String id) {
    return true;
  }
  
  public boolean isTaxonomyId() {
    return true;
  }
  
  public static boolean isTaxonomyId(String id) {
    return true;
  }
}
