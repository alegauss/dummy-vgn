package com.vignette.as.client.javabean;

import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.SharedPropertyPushParameters;
import com.vignette.as.client.common.ref.AsLocaleRef;
import com.vignette.as.client.common.ref.ChannelRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.TranslationGroupRef;
import com.vignette.as.client.common.wrapper.IFileWrapper;
import com.vignette.as.client.common.wrapper.WrappedFile;
import com.vignette.as.client.common.wrapper.WrappedFileType;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.logging.LoggingManager;
import com.vignette.logging.context.ContextLogger;
import java.util.Date;
import java.util.List;
import java.util.Map;

public abstract class ContentItem extends ExtensibleObject implements IChannelAssociate, IFileWrapper {
  protected static final ContextLogger logger = LoggingManager.getContextLogger(ContentItem.class);
  
  protected ContentItem() {
    
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
  
  protected void refresh(ManagedObject obj) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public boolean isCategoryAssociationsModified() {
	return true;
  }
  
  public boolean isChannelAssociationsModified() {
	return true;
  }
  
  public void addTaxonomyClassification(String classification) {
    
  }
  
  public void removeTaxonomyClassification(String classification) {
   
  }
  
  public void setTaxonomyClassifications(String[] classifications) {
  
  }
  
  public String[] getTaxonomyClassifications() {
	return null;
  }
  
  public void clearTaxonomyClassifications() {
  
  }
  
  public void addChannelAssociation(ChannelRef channelRef) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public void addChannelAssociations(ChannelRef[] channelRefs) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public void removeChannelAssociation(ChannelRef channelRef) throws ApplicationException, AuthorizationException, ValidationException {
  
  }
  
  public void removeChannelAssociations(ChannelRef[] channelRefs) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public void clearChannelAssociations() throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public ChannelRef[] getChannelAssociations() throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public ChannelRef[] getChannelAssociations(boolean filterOnStage) throws ApplicationException, AuthorizationException, ValidationException {
	return null;
  }
  
  public void setChannelAssociations(ChannelRef[] channelRefs) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public boolean hasChannelAssociation(ChannelRef channelRef) throws ApplicationException, AuthorizationException, ValidationException {
	return true;
  }
  
  public IPagingList getAssociatedChannels(RequestParameters params) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public void setPublishDate(Date date) throws ValidationException {
    
  }
  
  public Date getPublishDate() {
    return null;
  }
  
  public void setUnpublishDate(Date date) throws ValidationException {
   
  }
  
  public Date getUnpublishDate() {
	return null;
  }
  
  public WrappedFile getWrappedFile(WrappedFileType fileType) throws ValidationException, ApplicationException, AuthorizationException {
	return null;
  }
  
  public WrappedFile getWrappedFileForFormat(WrappedFileType wrappedFileType, String formatId) throws ValidationException, ApplicationException, AuthorizationException {
    return null;
  }
  
  public void setLocale(AsLocaleRef locale) {
    
  }
  
  public AsLocaleRef getLocale() {
	return null;
  }
  
  public void setTranslationGroupId(TranslationGroupRef translationGroupId) {
   
  }
  
  public TranslationGroupRef getTranslationGroupId() {
    return null;
  }
  
  public void setSharableTranslation(boolean sharable) {
   
  }
  
  public boolean getSharableTranslation() {
    return true;
  }
  
  public boolean getMultilingual() {
	return true;
  }
  
  public void setMultilingual(boolean multilingual) {
    
  }
  
  public boolean isExemplarTranslation() throws ApplicationException, ValidationException, AuthorizationException {
    return true;
  }
  
  public List<ContentItem> findByLocale(AsLocaleRef locale, RequestParameters params) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public void setFurlName(String furlName) {
    
  }
  
  public String getFurlName() throws ApplicationException {
    return null;
  }
  
  public void setAssetExternalIdentifier(String assetExternalIdentifier) {
   
  }
  
  public String getAssetExternalIdentifier() {
	return null;
  }
  
  public Date getAssetExternalModDate() {
	return null;
  }
  
  public void setAssetExternalModDate(Date date) throws ValidationException {

  }
  
  public static List<ContentItem> findByLocale(ManagedObjectVCMRef exemplar, AsLocaleRef locale, RequestParameters params) throws ApplicationException, AuthorizationException, ValidationException {
	return null;
  }
  
  public static ContentItem prepareTranslation(ManagedObjectVCMRef sourceRef, AsLocaleRef locale) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  public static ContentItem createTranslationByWorkflow(ManagedObjectVCMRef sourceRef, AsLocaleRef locale) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  public static void pushSharableProperties(ManagedObjectVCMRef sourceRef, ManagedObjectVCMRef targetRef, SharedPropertyPushParameters options) throws ApplicationException, ValidationException, AuthorizationException {
  }
  
  public static List<ManagedObjectVCMRef> findFurlUsage(String furlName, ChannelRef parentChannel) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static Map<ChannelRef, List<ManagedObjectVCMRef>> checkFurlAvailability(ManagedObjectVCMRef contentRef, String furlName) throws ApplicationException, AuthorizationException, ValidationException {
	return null;
  }
  
  public static Map<ChannelRef, List<ManagedObjectVCMRef>> checkFurlAvailability(ManagedObjectVCMRef contentRef, String furlName, List<ChannelRef> channels) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
}
