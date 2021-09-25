package com.vignette.as.client.javabean;

import com.vignette.as.client.common.AcceptableAttribute;
import com.vignette.as.client.common.AdhocMoReferenceInstance;
import com.vignette.as.client.common.AttributeData;
import com.vignette.as.client.common.AttributeDefinitionData;
import com.vignette.as.client.common.ClientInfo;
import com.vignette.as.client.common.ComputedMoReferenceInstance;
import com.vignette.as.client.common.ContentRelationInstance;
import com.vignette.as.client.common.DataObject;
import com.vignette.as.client.common.ITrackedProp;
import com.vignette.as.client.common.LOBAttributeData;
import com.vignette.as.client.common.ManagedObjectStatus;
import com.vignette.as.client.common.ManagedObjectWorkflowMode;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.ThumbnailFormat;
import com.vignette.as.client.common.ThumbnailSize;
import com.vignette.as.client.common.TouchRequestParameters;
import com.vignette.as.client.common.ref.AsLocaleRef;
import com.vignette.as.client.common.ref.AttributeDataRef;
import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.common.ref.SiteRef;
import com.vignette.as.client.common.ref.TranslationGroupRef;
import com.vignette.as.client.common.ref.VCMObjectRef;
import com.vignette.as.client.common.wrapper.IThumbnailWrapper;
import com.vignette.as.client.common.wrapper.ThumbnailManager;
import com.vignette.as.client.common.wrapper.WrappedFile;
import com.vignette.as.client.ejb.IManagedObjectOps;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.sdo.ManagedObjectMapData;
import com.vignette.as.server.logic.common.IDALogic;
import com.vignette.authz.client.AccessControlList;
import com.vignette.authz.client.Capability;
import com.vignette.logging.LoggingManager;
import com.vignette.logging.context.ContextLogger;
import com.vignette.util.GUID;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public abstract class ManagedObject extends DataObject implements IAttributedObject, IPersistable, IThumbnailWrapper, ITargetable, Serializable {
  protected static final ContextLogger logger = LoggingManager.getContextLogger(ManagedObject.class);
  
  
  public static final String FIELD_REFERENCEDATALOADED = "";
  
  public static final String FIELD_COMPUTEDREFERENCES = "";
  
  public static final String FIELD_ADHOCREFERENCES = "";
  
  protected boolean maintainAppIdOnCreation;
  
  protected ManagedObjectMapData map;
  
  protected Boolean mIsNew;
  
  protected transient IManagedObjectOps managedObjectOps;
  
  public ContentRelationInstance getUserDataTopRelation() throws ApplicationException {
 	return null;
  }
  
  public void setUserDataTopRelation(ContentRelationInstance topRelation) throws ApplicationException {
  }
  
  public boolean hasDataSourceAttributes() throws ApplicationException {
	return true;
  }
  
  public static AttributeData[] sortAttributeDataArray(AttributeData[] array) {
	return null;
  }
  
  public AttributeData getAttribute(String name) throws ApplicationException {
	return null;
  }
  
  public AttributeData getAttribute(AttributeDefinitionData attrDef) throws ApplicationException {
    return null;
  }
  
  public Object getAttributeValue(String name) throws ApplicationException {
	return null;
  }
  
  public Object getAttributeValue(AttributeDefinitionData attrDef) throws ApplicationException {
	return null;
  }
  
  public AttributeData[] getAttributes() throws ApplicationException {
	return null;
  }
  
  public String[] getAttributeNames() throws ApplicationException {
	return null;
  }
  
  public int getIntValue(String name) throws ApplicationException {
	return 0;  
}
  
  public double getDoubleValue(String name) throws ApplicationException {
      return 0.0D; 
  }
  
  public String getStringValue(String name) throws ApplicationException {
	return null;
  }
  
  public void setAttribute(AttributeData attrData) throws ApplicationException {
  }
  
  public void setAttributeValue(String name, Object value) throws ApplicationException {
  }
  
  public void setAttributeValue(AttributeDefinitionData attrDef, Object value) throws ApplicationException {
  }
  
  public void setAttributes(AttributeData[] attributes) throws ApplicationException {
  }
  
  public static ManagedObject newInstance(String objectTypeName) throws ApplicationException {
	return null;
  }
  
  public Capability[] getAllCapabilities() throws ApplicationException {
	return null;
  }
  
  public Capability[] getNewCapabilities() throws ApplicationException {
	return null;
  }
  
  protected boolean getChangeTrackingDefault() {
    return false;
  }
  
  public boolean persistsManagedObjectData() {
    return true;
  }
  
  public String toXML() throws ApplicationException {
	return null;
  }
  
  public void exportXML(Writer writer, IExportXMLControl exportControl) throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  public static ManagedObject importXML(ObjectTypeRef objectTypeRef, Reader reader, IImportXMLControl importControl) throws ApplicationException, AuthorizationException, ValidationException {
	return null;
  }
  
  public static ManagedObject importXML(ObjectTypeRef objectTypeRef, String xmlString, boolean commit) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  protected void setObjectTypeRef(ObjectTypeRef ref) {
  }
  
  public ObjectTypeRef getObjectTypeRef() throws ApplicationException {
	return null;
  }
  
  public ObjectType getObjectType() throws ApplicationException {
	return null;
  }
  
  protected void setObjectType(ObjectType ot) {
  }
  
  public ManagedObjectStatus getManagedObjectStatus() {
	return null;
  }
  
  public void setManagedObjectStatus(ManagedObjectStatus status) {
  }
  
  public String getStatus() {
	return null;
  }
  
  public void setStatus(String s) {
  }
  
  public boolean isStatusEmpty() {
	return true;
  }
  
  public boolean isStatusApproved() {
    return true;
  }
  
  public static boolean isStatusApproved(String status) {
    return true;
  }
  
  public int getModCount() throws AuthorizationException, ApplicationException {
    return 0;
  }
  
  public String getLogicalPath() {
    return null;
  }
  
  public String getTaskId() {
	return null;
  }
  
  public void setTaskId(String s) {
   
  }
  
  public AccessControlList getAcl() {
	return null;
  }
  
  public void setAcl(AccessControlList acl) {
  }
  
  public void setAuthorizedGroups(String[] authorizedGroups) {
  }
  
  public void clearAuthorizedGroups() {
  }
  
  public String getCreator() {
	return null;
  }
  
  public Date getCreationTime() {
    return null;
  }
  
  public String getLastModifier() {
    return null;
  }
  
  public Date getLastModTime() {
    return null;
  }
  
  public String getLastModComment() {
    return null;
  }
  
  public int getLockCount() {
	return 0;
  }
  
  public String getLockOwner() {
    return null;
  }
  
  public Date getLockTime() {
	return null;
  }
  
  public String getProjectPath() {
    return null;
  }
  
  public ManagedObjectVCMRef getParentProjectId() {
	return null;
  }
  
  public ManagedObjectVCMRef getContentManagementId() {
	return null;
  }
  
  public ManagedObjectRef getManagedObjectRef() throws ApplicationException {
    return null;
  }
  
  public boolean isModified() {
    return false;
  }
  
  public void setNew(boolean isNew) {
    
  }
  
  public boolean isNew() {
	return true;
  }
    
  protected void locateLOBAttributeData(LOBAttributeData attr, AttributedObject relation) throws ApplicationException {
  }
  
  public void remove() throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  protected void manageTargetingRuleCleanup(boolean includeCurrent, List targetingRuleChanges) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public static ManagedObject findById(ManagedObjectRef id) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static ManagedObject findById(ManagedObjectRef id, RequestParameters parms) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByIds(ManagedObjectRef[] ids) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByIds(ManagedObjectRef[] ids, RequestParameters parms) throws ApplicationException, ValidationException {
	return null;
  }
  
  static Class getLogicClass(ManagedObjectRef[] ids, int beginIndex, int endIndex) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static ManagedObject findByContentManagementId(ManagedObjectVCMRef cmid) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static ManagedObject findByContentManagementId(ManagedObjectVCMRef cmid, RequestParameters parms) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static IPagingList findByContentManagementIds(ManagedObjectVCMRef[] ids) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static IPagingList findByContentManagementIds(ManagedObjectVCMRef[] ids, RequestParameters parms) throws ApplicationException, ValidationException {
	return null;
  }
  
  public static IPagingList findManagedObjectsByQuery(ObjectTypeRef objectTypeRef, String query, String tableExtras, Object[] queryArgs) throws ApplicationException {
	return null;
  }
  
  public static IPagingList findManagedObjectsByQuery(ObjectTypeRef objectTypeRef, String query, String tableExtras, Object[] queryArgs, RequestParameters parms) throws ApplicationException {
    return null;
  }
  
  static Class findServerOps(ObjectTypeRef objectTypeRef) throws ApplicationException {
    return null;
  }
  
  static Class findServerOps(Class managedObjectOpsInterface) throws ApplicationException {
    return null;
  }
  
  public void setLogicalPath(String logicalPath) {
   
  }
  
  protected void setMap(ManagedObjectMapData map) {
   
  }
  
  protected ManagedObjectMapData getMap() {
    return null;
  }
  
  protected IManagedObjectOps getOps() throws ApplicationException {
	return null;
  }
  
  protected static IManagedObjectOps getBaseOps() throws ApplicationException {
	return null;
  }
  
  protected void refresh(ManagedObject obj) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  protected static IManagedObjectOps findOps(ObjectTypeRef objectType) throws ApplicationException {
	return null;
  }
  
  protected static IManagedObjectOps findOps(ManagedObjectRef[] ids) throws ApplicationException {
	return null;
  }
  
  static Class findByIdsOps(ManagedObjectRef[] ids) throws ApplicationException {
    return null;
  }
  
   
  protected boolean preserveAppId() {
    return true;
  }
  
  protected void preserveAppId(boolean bPreserveAppId) {
    
  }
    
  IDALogic getDALogic() throws ApplicationException {
    return null;
  }
  
  public void touch() throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public void touch(boolean workflow) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public void touch(TouchRequestParameters params) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public static ManagedObjectRef[] filterRefsForCurrentStage(ManagedObjectRef[] refs) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static void expireFromCache(ManagedObjectVCMRef[] vcmRefs) throws ApplicationException, AuthorizationException {
   
  }
  
  public String getName() throws ApplicationException {
	return null;
  }
  
  public boolean isReadOnlyProxy() {
    return true;
  }
  
  void setReadOnlyProxy(boolean val) {
  
  }
  
  public boolean isValidProxy() {
    return true;
  }
  
  protected void checkValid() throws ApplicationException {
   
  }
  
  public void track(ClientInfo info) throws ApplicationException {
    
  }
  
  public void track(ClientInfo info, String deliveryChannel) throws ApplicationException {
    
  }
  
  protected Class getLogicInterface() {
    return IManagedObjectOps.class;
  }
  
  protected ManagedObject() {
    
  }
  
  protected static ConcurrentMap<String, Class> cachedTypeToClassLookup = (ConcurrentMap)new ConcurrentHashMap<String, Class<?>>(64);
  
  protected boolean readOnly;
  
  protected boolean valid;
  
  private boolean resetStatusAfterCommit;
  
  private ManagedObjectWorkflowMode createWorkflowMode;
  
  private ManagedObjectWorkflowMode updateWorkflowMode;
  
  private boolean autoEnlist;
  
  private GUID thumbnailGuid;
  
  public void setResetStatusAfterCommit(boolean reset) {
    
  }
  
  public boolean isResetStatusAfterCommit() {
	return true;
  }
  
  public ManagedObjectWorkflowMode getDefaultCreateWorkflowMode() {
    return null;
  }
  
  public final void setCreateWorkflowMode(ManagedObjectWorkflowMode mode) {
    
  }
  
  public final ManagedObjectWorkflowMode getCreateWorkflowMode() {
	return null;
  }
  
  public ManagedObjectWorkflowMode getDefaultUpdateWorkflowMode() {
	return null;
  }
  
  public final void setUpdateWorkflowMode(ManagedObjectWorkflowMode mode) {
   
  }
  
  public final ManagedObjectWorkflowMode getUpdateWorkflowMode() {
	return null;
  }
  
  public void manageStatus() {
   
  }
  
  public boolean isApprovalRequired() {
	return true;
  }
  
  protected List getApprovalRequiredProperties() {
	return null;
  }
  
  public boolean isCreateWorkflowRequired() {
	return true;
  }
  
  public boolean isUpdateWorkflowRequired() {
	return true;
  }
  
  protected List getWorkflowRequiredProperties() {
	return null;
  }
  
  public boolean isApprovalStatusModified() {
    return true;
  }
  
  public boolean isLogicalPathModified() {
    return true;
  }
  
  public boolean isAclModified() {
    return true;
  }
  
  public boolean isAuthorizedGroupsModified() {
    return true;
  }
  
  public boolean isAdhocReferencesModified() {
	return true;
  }
  
  protected List<ITrackedProp> getAdhocReferenceAttributeProperties() {
    return null;
  }
  
  public boolean hasAdhocReferenceAttributeChanges() {
    return true;
  }
  
  protected List<ITrackedProp> getAdhocReferencePropertyProperties() {
    return null;
  }
  
  public boolean hasAdhocReferencePropertyChanges() {
	return true;
  }
  
  protected List<ITrackedProp> getDataSourceAttributeProperties() {
	return null;
  }
  
  public boolean hasDataSourceAttributeChanges() {
	return true;
  }
  
  protected List<ITrackedProp> getExtensibleAttributeProperties() {
	return null;
  }
  
  public boolean hasExtensibleAttributeChanges() {
	return true;
  }
  
  public boolean hasUserDataChanges() {
    return true;
  }
  
  public void clearChanges() {
  
	
  }
  
  public void init() {
   
  }
  
  public ManagedObjectVCMRef[] findAllReferences(boolean doStatusCheck) throws ApplicationException, ValidationException {
    return null;
  }
  
  public void setPublishDate(Date date) throws ValidationException {}
  
  public Date getPublishDate() {
    return null;
  }
  
  public void setUnpublishDate(Date date) throws ValidationException {}
  
  public Date getUnpublishDate() {
    return null;
  }
  
  protected void setPublishDateInternal(Date date) throws ValidationException {
   
  }
  
  protected Date getPublishDateInternal() {
    return null;
  }
  
  protected void setUnpublishDateInternal(Date date) throws ValidationException {
   
  }
  
  protected Date getUnpublishDateInternal() {
	return null;
  }
  
  public Date getLastPublishDate() {
	return null;
  }
  
  public Date getLastUnpublishDate() {
	return null;
  }
  
  public SiteRef[] getSiteRefs() throws ApplicationException {
	return null;
  }
  public boolean isAutoEnlist() {
    return true;
  }
  
  public void setAutoEnlist(boolean enabled) {
    
  }
  
  public boolean hasChanges(String name) {
	return true;
  }
  
  public Set<String> getComputedReferenceNames() throws ApplicationException, AuthorizationException, ValidationException {
	return null;
  }
  
  public ComputedMoReferenceInstance getComputedReferenceInstance(String referenceName, VCMObjectRef referent) throws ApplicationException, AuthorizationException, ValidationException {
	return null;
  }
  
  public Map<String, Set<ComputedMoReferenceInstance>> getComputedReferenceInstances() throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public Set<ComputedMoReferenceInstance> getComputedReferenceInstances(String referenceName) throws ApplicationException, AuthorizationException, ValidationException {
	return null;
  }
  
  public Set<ComputedMoReferenceInstance> getComputedReferenceInstances(VCMObjectRef referent) throws ApplicationException, AuthorizationException, ValidationException {
	return null;
  }
  
  public Set<String> getAdhocReferenceNames() throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public AdhocMoReferenceInstance getAdhocReferenceInstance(String referenceName, VCMObjectRef referent) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public Map<String, Set<AdhocMoReferenceInstance>> getAdhocReferenceInstances() throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public Set<AdhocMoReferenceInstance> getAdhocReferenceInstances(String referenceName) throws ApplicationException, AuthorizationException, ValidationException {
	return null;
  }
  
  public Set<AdhocMoReferenceInstance> getAdhocReferenceInstances(VCMObjectRef referent) throws ApplicationException, AuthorizationException, ValidationException {
	return null;
  }
  
  public boolean addAdhocReference(AdhocMoReferenceInstance reference) throws ApplicationException, AuthorizationException, ValidationException {
	return true;
  }
  
  public boolean replaceAdhocReference(AdhocMoReferenceInstance reference) throws ApplicationException, AuthorizationException, ValidationException {
	return true;
  }
  
  public boolean removeAdhocReference(AdhocMoReferenceInstance reference) throws ApplicationException, AuthorizationException, ValidationException {
	return true;
  }
  
  public boolean removeAdhocReference(String referenceName, VCMObjectRef referent) throws ApplicationException, AuthorizationException, ValidationException {
    return true;
  }
  
  public boolean removeAdhocReferences(String referenceName) throws ApplicationException, AuthorizationException, ValidationException {
    return true;
  }
  
  public boolean removeAdhocReferences(VCMObjectRef referent) throws ApplicationException, AuthorizationException, ValidationException {
    return true;
  }
  
  public boolean removeAdhocReferences() throws ApplicationException, AuthorizationException, ValidationException {
    return true;
  }
  
    
  public boolean isReferenceDataLoaded() {
    return true;
  }
  
  public static boolean isReferenced(ManagedObjectVCMRef vcmReferent) throws ApplicationException, AuthorizationException, ValidationException {
    return true;
  }
  
  public static boolean hasReferences(ManagedObjectVCMRef vcmReferrer) throws ApplicationException, AuthorizationException, ValidationException {
    return true;
  }
  
  public static ManagedObjectVCMRef[] getReferredManagedObjects(ManagedObjectVCMRef vcmReferrer) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static ManagedObjectVCMRef[] getReferringManagedObjects(ManagedObjectVCMRef vcmReferent) throws ApplicationException, AuthorizationException, ValidationException {
	return null;
  }
  
  public static ManagedObjectRef asManagedObjectRef(ManagedObjectVCMRef movRef) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static ManagedObjectVCMRef asManagedObjectVCMRef(ManagedObjectRef moRef) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static boolean isPublished(ManagedObjectVCMRef movRef) throws ApplicationException, AuthorizationException, ValidationException {
	return true;
  }
  
  public static boolean isPublished(ManagedObjectRef moRef) throws ApplicationException, AuthorizationException, ValidationException {
	return true;
  }
  
  public WrappedFile getWrappedThumbnail() throws AuthorizationException, ValidationException, ApplicationException {
    return null;
  }
  
  public ThumbnailManager.Uri getThumbnailUri(ThumbnailSize size, ThumbnailFormat format) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public void setLocale(AsLocaleRef locale) {}
  
  public AsLocaleRef getLocale() {
    return null;
  }
  
  public boolean isLocaleModified() {
    return true;
  }
  
  public void setTranslationGroupId(TranslationGroupRef translationGroupId) {}
  
  public TranslationGroupRef getTranslationGroupId() {
    return null;
  }
  
  public boolean isTranslationGroupIdModified() {
	return true;
  }
  
  public boolean isTargetingRuleIdModified() {
	return true;
  }
  
  public boolean isSharableTranslationModified() {
	return true;
  }
  
  public void setAssetExternalIdentifier(String assetExternalIdentifier) {}
  
  public String getAssetExternalIdentifier() {
    return null;
  }
  
  public void setAssetExternalModDate(Date date) throws ValidationException {}
  
  public Date getAssetExternalModDate() {
    return null;
  }
  
  public void setSharableTranslation(boolean sharable) {}
  
  public boolean getSharableTranslation() {
    return false;
  }
  
  public void setFurlName(String furlName) {}
  
  public String getFurlName() throws ApplicationException {
    return null;
  }
  
  protected String getManagedFurlName() throws ApplicationException {
    return null;
  }
  
  public static String getFurlSpaceEncodingChar() {
	return null;
  }
  public static String encodeFurlName(String furlName) throws ApplicationException {
    return getBaseOps().encodeFurlName(furlName);
  }
  
  public static String decodeFurlName(String encodedFurlName) throws ApplicationException {
    return getBaseOps().decodeFurlName(encodedFurlName);
  }
  
  public void setTargetingRuleId(ManagedObjectVCMRef targetingRuleIdId) {}
  
  public ManagedObjectVCMRef getTargetingRuleId() {
    return null;
  }
  
  public AttributedObject getRelationInstance(String identity) throws ApplicationException {
	return null;
  }
  
  public List<AttributeDataRef> getAttributeDataRefs() throws ApplicationException {
	return null;
  }
  
  public List<AttributeDataRef> getAttributeDataRefs(AcceptableAttribute filter) throws ApplicationException {
	return null;
  }
  
  public Object getAttributeValue(AttributeDataRef attrRef) throws ApplicationException {
    return null;
  }
  
  public void setAttributeValue(AttributeDataRef attrRef, Object value) throws ApplicationException {
   
  }
  
  public boolean getMultilingual() {
    return false;
  }
  
  public void setMultilingual(boolean multilingual) {}
  
  public boolean isTargetable() throws AuthorizationException, ValidationException, ApplicationException {
    return true;
  }
  
  public Set<ManagedObjectVCMRef> getReferredSegments() throws AuthorizationException, ValidationException, ApplicationException {
	return null;
  }
  
  public abstract AttributeData[] getPrimaryKeys() throws ApplicationException;
}
