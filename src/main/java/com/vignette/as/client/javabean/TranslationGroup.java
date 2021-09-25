package com.vignette.as.client.javabean;

import com.vignette.as.client.common.DataObject;
import com.vignette.as.client.common.TranslationGroupMember;
import com.vignette.as.client.common.ref.AsLocaleRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.common.ref.TranslationGroupRef;
import com.vignette.as.client.ejb.ITranslationGroupOps;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import java.util.List;
import java.util.Set;

public class TranslationGroup extends DataObject {
  protected TranslationGroupRef tgRef = null;
  
  protected ObjectTypeRef otRef = null;
  
  protected List<TranslationGroupMember> members = null;
  
  public static TranslationGroup findById(TranslationGroupRef groupRef) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static TranslationGroup findByMember(ManagedObjectVCMRef member) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static List<ManagedObjectVCMRef> getTranslationsByLocale(TranslationGroupRef groupRef, AsLocaleRef locale) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static List<ManagedObjectVCMRef> getTranslationsByLocale(ManagedObjectVCMRef exemplar, AsLocaleRef locale) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static ObjectTypeRef getObjectTypeRef(TranslationGroupRef groupRef) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public TranslationGroup() {}
  
  public TranslationGroup(TranslationGroup tg) {
  }
  
  public TranslationGroupRef getTranslationGroupId() {
    return null;
  }
  
  public ObjectTypeRef getObjectTypeRef() {
    return null;
  }
  
  public List<TranslationGroupMember> getMembers() {
    return null;
  }
  
  public List<TranslationGroupMember> getMembersByLocale(AsLocaleRef locale) {
    return null;
  }
  
  public List<TranslationGroupMember> getSharableMembers() {
    return null;
  }
  
  public Set<AsLocaleRef> getTranslatedLocales() {
    return null;
  }
  
  public Set<AsLocaleRef> getUntranslatedLocales() throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
}
