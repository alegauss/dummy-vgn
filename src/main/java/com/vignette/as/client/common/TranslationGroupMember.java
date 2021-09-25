package com.vignette.as.client.common;

import com.vignette.as.client.common.ref.AsLocaleRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.ejb.ITranslationGroupOps;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.TranslationGroup;
import com.vignette.util.MsgObject;

public class TranslationGroupMember extends DataObject {
  protected TranslationGroup translationGroup = null;
  
  protected ManagedObjectVCMRef moVcmRef = null;
  
  protected AsLocaleRef locale = null;
  
  protected boolean sharableTranslation = false;
  
  public TranslationGroupMember() {}
  
  public TranslationGroupMember(TranslationGroup tg, TranslationGroupMember tgm) {
  
  }
  
  public TranslationGroup getTranslationGroup() {
    return null;
  }
  
  public ManagedObjectVCMRef getContentManagementId() {
    return null;
  }
  
  public AsLocaleRef getLocale() {
    return null;
  }
  
  public boolean getSharableTranslation() {
    return true;
  }
  
  public boolean isExemplarTranslation() throws ApplicationException, AuthorizationException, ValidationException {
    return true;
  }
  
  private static ITranslationGroupOps getOps() throws ApplicationException {
    return null;
  }
}
