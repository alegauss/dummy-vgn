package com.vignette.as.client.common.ref;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.TranslationGroup;
import com.vignette.cms.client.common.ObjectId;

public class TranslationGroupRef extends VCMObjectRef {
  public static String TRANSLATION_GROUP_ID_TYPE_CODE = "";
   
  public static TranslationGroupRef generateNew() throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public TranslationGroupRef(ObjectId id) {
  }
  
  public TranslationGroupRef(String id) {
  }
  
  public TranslationGroupRef(TranslationGroup group) {
  }
  
  public boolean isValid() {
    return true;
  }
  
  public void setId(String id) {
   
  }
  
  public void setObjectId(ObjectId id) {
   
  }
  
  public TranslationGroup getTranslationGroup() throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public TranslationGroupRef clone() {
    return null;
  }
  
  public TranslationGroupRef() {}
}
