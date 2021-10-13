package com.vignette.as.client.javabean;

import com.vignette.as.client.common.AsLocaleData;
import com.vignette.as.client.common.AttributeData;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.ThumbnailFormat;
import com.vignette.as.client.common.ThumbnailSize;
import com.vignette.as.client.common.ref.AsLocaleRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.common.wrapper.ThumbnailManager;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import java.util.List;
import java.util.Locale;

public class AsLocale extends ExtensibleObject {
  public static final String STANDARD_FLAG_IMAGE_PROJECT = "";
  
  public static final String STANDARD_TINY_FLAG_IMAGE_PROJECT = "";
  
  public static final String STANDARD_SMALL_FLAG_IMAGE_PROJECT = "";
  
  public static final int LANGUAGE_CODE_LEN = 1;
  
  public static final int COUNTRY_CODE_LEN = 1;
  
  public AsLocale() {
   
  }
  
  protected boolean getChangeTrackingDefault() {
    return true;
  }
  
  protected List getApprovalRequiredProperties() {
    return null;
  }
  
  protected List getWorkflowRequiredProperties() {
    return null;
  }
  
  public ObjectTypeRef getObjectTypeRef() throws ApplicationException {
    return null;
  }
  
  public static ObjectTypeRef getTypeObjectTypeRef() {
    return null;
  }
  
  public static AsLocale newInstance() throws ApplicationException {
    return null;
  }
  
  public AsLocaleRef getManagedObjectRef() throws ApplicationException {
    return null;
  }
  
  public AttributeData[] getPrimaryKeys() throws ApplicationException {
    return null;
  }
  
  public AsLocaleData getData() {
    return null;
  }
  
  public void setData(AsLocaleData data) {
   
  }
  
  protected void refresh(ManagedObject obj) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public String getName() throws ApplicationException {
    return null;
  }
  
  public String getName(AsLocaleRef locale) throws ApplicationException {
    return null;
  }
  
  public Locale getJavaLocale() {
    return null;
  }
  
  public String formatLocaleCode(boolean encodeVariant) throws ApplicationException {
    return null;
  }
  
  public String getStandardFlagImageStaticFileName() throws ApplicationException {
    return null;
  }
  
   public boolean assignStandardTinyFlagImage() throws ApplicationException, ValidationException {
    return true;
  }
  
  public boolean assignStandardSmallFlagImage() throws ApplicationException, ValidationException {
    return true;
  }
  
  public boolean assignStandardFlagImages() throws ApplicationException, ValidationException {
    return true;
  }
  
  public void manageStatus() {
    
  }
  
  protected Class getDataObjectClass() {
    return null;
  }
  protected Class getLogicInterface() {
    return null;
  }

  public static String calculateLocaleId(String localeCode) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static String calculateLocaleId(String language, String country, String variant) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static Locale calculateLocale(String localeId) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static String normalizeLanguageCode(String language) {
    return null;
  }
    
  public static AsLocale findById(AsLocaleRef ref) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static AsLocale findById(AsLocaleRef ref, RequestParameters params) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static AsLocale findByContentManagementId(ManagedObjectVCMRef ref) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static AsLocale findByContentManagementId(ManagedObjectVCMRef ref, RequestParameters params) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static AsLocale findByLocale(String language, String country, String variant, RequestParameters params) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static AsLocale findByLocale(String language, String country, RequestParameters params) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static AsLocale findByLocale(String language, RequestParameters params) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static AsLocale findByLocaleCode(String localeCode, RequestParameters params) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static AsLocale findByLocale(Locale locale, RequestParameters params) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findAll(RequestParameters params) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static IPagingList findActive(RequestParameters params) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static boolean assignStandardFlagImages(AsLocaleRef ref) throws ApplicationException, AuthorizationException, ValidationException {
    return true;
  }
  
  public ThumbnailManager.Uri getThumbnailUri(ThumbnailSize size, ThumbnailFormat format) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }

@Override
public void commit() throws ApplicationException, AuthorizationException, ValidationException {
    // TODO Auto-generated method stub
    
}
}
