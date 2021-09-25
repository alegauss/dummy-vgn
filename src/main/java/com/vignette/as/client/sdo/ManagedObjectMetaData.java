package com.vignette.as.client.sdo;

import com.vignette.as.client.common.AppObjectId;
import com.vignette.as.client.common.ApplicationObjectData;
import com.vignette.as.client.common.ITrackedChange;
import com.vignette.as.client.common.ITrackedProp;
import com.vignette.as.client.common.ref.AsLocaleRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.common.ref.TranslationGroupRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.authz.client.AccessControlList;
import com.vignette.cms.client.common.Association;
import java.util.Date;

public class ManagedObjectMetaData extends ApplicationObjectData {
  public static final long NULL_DATE = 0L;
  
  public static final String FIELD_INTERNAL_COMMIT = "";
  

  public ManagedObjectMetaData() {
  }
  
  public ITrackedChange trackChange(ITrackedProp property) {
   return null;
  }
  
  public boolean hasChanges(ITrackedProp property) {
    return true;
  }
  
  public void clearChanges() {

  }
  
  public boolean isInternalCommit() {
    return true;
  }
  
  public ManagedObjectVCMRef getContentManagementId() {
    return null;
  }
  
  public final void setContentManagementId(ManagedObjectVCMRef cmId) {
  }
  
  public final String getStatus() {
    return null;
  }
  
  public final void setStatus(String status) {
  }
  
  public final String getName() {
    return null;
  }
  
  public final void setName(String name) {
  }
  
  public final boolean getIsModified() {
    return false;
  }
  
  public final void setIsModified(boolean isModified) {}
  
  public final ObjectTypeRef getObjectTypeId() {
    return null;
  }
  
  public final void setObjectTypeId(ObjectTypeRef objectTypeId) {
  }
  
  public final String getPublishStatus() {
    return null;
  }
  
  public final void setPublishStatus(String publishStatus) {
  }
  
  public final Object getOutOfBoxValue(Object key) {
    return null;
  }
  
  public final void setOutOfBoxValue(Object key, Object value) {
  }
  
  public final String getLogicalPath() {
    return null;
  }
  
  public final void setLogicalPath(String logicalPath) {
  }
  
  public final String getTaskId() {
    return null;
  }
  
  public final void setTaskId(String taskId) {
  }
  
  public final Association[] getAssociationList() {
    return null;
  }
  
  public final void setAssociationList(Association[] associationList) {

  }
  
  public final int getModCount() {
    return 1;
  }
  
  public final void setModCount(int modCount) {
  }
  
  public final String getCreator() {
    return null;
  }
  
  public final void setCreator(String creator) {
  }
  
  public final Date getCreationTime() {
    return null;
  }
  
  public final void setCreationTime(Date creationTime) {
  }
  
  public final String getLastModifier() {
    return null;
  }
  
  public final void setLastModifier(String lastModifier) {
  }
  
  public final Date getLastModTime() {
    return null;
  }
  
  public final void setLastModTime(Date lastModTime) {
  }
  
  public final String getLastModComment() {
    return null;
  }
  
  public final void setLastModComment(String lastModComment) {
  }
  
  public final int getLockCount() {
    return 0;
  }
  
  public final void setLockCount(int lockCount) {
  }
  
  public final String getLockOwner() {
    return null;
  }
  
  public final void setLockOwner(String lockOwner) {
  }
  
  public final Date getLockTime() {
    return null;
  }
  
  public final void setLockTime(Date lockTime) {
  }
  
  public final String getProjectPath() {
    return null;
  }
  
  public final void setProjectPath(String projectPath) {
  }
  
  public final ManagedObjectVCMRef getParentProjectId() {
    return null;
  }
  
  public final void setParentProjectId(ManagedObjectVCMRef parentProjectId) {
  }
  
  public final AccessControlList getAccessControlList() {
    return null;
  }
  
  public final AccessControlList getAcl() throws ApplicationException, AuthorizationException {
    return null;
  }
  
  public final AccessControlList getAcl(boolean lazyLoad) throws ApplicationException, AuthorizationException {
    return null;
  }
  
  public final void setAcl(AccessControlList acl) {
  }
  
  public final String[] getAuthorizedGroups() throws ApplicationException, AuthorizationException {
    return null;
  }
  
  public final String[] getAuthorizedGroups(boolean lazyLoad) throws ApplicationException, AuthorizationException {
    return null;
  }
  
  public final void setAuthorizedGroups(String[] authorizedGroupsList) {
  }
  
  public final void clearAuthorizedGroups() {
  }
  
  public final InheritanceLevelType getInheritanceLevel() {
    return null;
  }
  
  public final void setInheritanceLevel(InheritanceLevelType inheritanceLevel) {
  }
  
  public final AppObjectId getId() {
    return null;
  }
  
  public void setPublishDate(long publishDate) {
  }
  
  public long getPublishDate() {
    return 0L;
  }
  
  public void clearPublishDate() {

  }
  
  public void setUnpublishDate(long unpublishDate) {
  }
  
  public long getUnpublishDate() {
      return 0L;
  }
  
  public void clearUnpublishDate() {
  }
  
  public void setLastPublishDate(long lastPublishDate) {
  }
  
  public long getLastPublishDate() {
    return 0L;
  }
  
  public void clearLastPublishDate() {
  }
  
  public void setLastUnpublishDate(long lastUnpublishDate) {
  }
  
  public long getLastUnpublishDate() {
    return 0L;
  }
  
  public void clearLastUnpublishDate() {
  }
  
  public AsLocaleRef getLocale() {
    return null;
  }
  
  public void setLocale(AsLocaleRef locale) {
  }
  
  public TranslationGroupRef getTranslationGroupId() {
    return null;
  }
  
  public void setTranslationGroupId(TranslationGroupRef translationGroupId) {
  }
  
  public String getAssetExternalIdentifier() {
    return null;
  }
  
  public void setAssetExternalIdentifier(String assetExternalIdentifier) {
  }
  
  public void setAssetExternalModDate(long assetExternalModDate) {
  }
  
  public long getAssetExternalModDate() {
    return 0L;
  }
  
  public void clearAssetExternalModDate() {
  }
  
  public boolean getSharableTranslation() {
    return true;
  }
  
  public final void setSharableTranslation(boolean sharableTranslation) {
  }
  
  public final String getFurlName() throws ApplicationException {
    return null;
  }
  
  public final void setFurlName(String furlName) {
  }
  
  public ManagedObjectVCMRef getTargetingRuleId() {
    return null;
  }
  
  public void setTargetingRuleId(ManagedObjectVCMRef targetingRuleId) {
  }
  
  public boolean isPublished() {
 return true;
  }
}
