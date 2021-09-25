package com.vignette.as.client.ejb;

import com.vignette.as.client.common.ref.AsLocaleRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.common.ref.TranslationGroupRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.TranslationGroup;
import java.util.List;

public interface ITranslationGroupOps extends IOps {
  public static final String MAPPED_NAME = "";
  
  public static final String AS_OPS_LOGIC_LOCAL = "";
  
  TranslationGroup findById(TranslationGroupRef paramTranslationGroupRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  TranslationGroup findByMember(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  List<ManagedObjectVCMRef> getTranslationsByLocale(TranslationGroupRef paramTranslationGroupRef, AsLocaleRef paramAsLocaleRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  List<ManagedObjectVCMRef> getTranslationsByLocale(ManagedObjectVCMRef paramManagedObjectVCMRef, AsLocaleRef paramAsLocaleRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  boolean isExemplarTranslation(ManagedObjectVCMRef paramManagedObjectVCMRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  ObjectTypeRef getObjectTypeRef(TranslationGroupRef paramTranslationGroupRef) throws ApplicationException, AuthorizationException, ValidationException;
}
