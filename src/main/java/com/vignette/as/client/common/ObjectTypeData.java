package com.vignette.as.client.common;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.javabean.ManagedObject;
import com.vignette.as.common.util.database.ColumnMetadata;
import com.vignette.config.client.common.ConfigException;
import com.vignette.util.MsgObject;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

public class ObjectTypeData extends ObjectTypeBaseData {
  public static final String VALID_XML_SPECIAL_CHARS = "";
    
  public static final int MAX_NAME_LENGTH = 1;
  
  public static final int MAX_PKG_NAME_LENGTH = 1;
  
  public static final int MAX_NUMBER_EXTENSIBLE_ATTRIBUTES = 1;
  
  public static final String V7_EDITOR_STYLE = "";
  
  public static final String V8_EDITOR_STYLE = "";
  
  public static final String DEFAULT_EDITOR_STYLE = "";
  
  public static final String[] EDITOR_STYLES = new String[] { ""};

  
  public static final String DEFAULT_CUSTOM_FOLDER_CLASSNAME = "";
  
  public ObjectTypeData() {
  }
  
  public String getName() {
   return null;
  }
  
  public void setName(String name) {
    
  }
  
  public String getDescription() {
    return null;
  }
  
  public void setDescription(String description) {
  
  }
  
  public String getPrimaryTable() {
    return null;
  }
  
  public String getDataSourceLabel() {
    return null;
  }
  
  public void setDataSourceLabel(String dataSourceLabel) {

  }
  
  public RelationData getTopRelation() {
    return null;
  }
  
  public RelationData getTopRelation(boolean addTop) {
    return null;
  }
  
  public int getTopRelationCount() {
    return 1;
  }
  
  public void setTopRelation(RelationData relation) {
  }
  
  protected void manageDefaultTopRelation(RelationData relation) {

  }
  
  public void addRelation(RelationData newRelation) throws IndexOutOfBoundsException {
  }
  
  public void addRelation(int i, RelationData relationData) throws IndexOutOfBoundsException {
  }
  
  public boolean removeRelation(RelationData relation) {
    return true;
  }
  
  public void clearRelation() {
  }
  
  public Collection getRelationCollection() {
    return null;
  }
  
  public void setRelation(int index, RelationData relationData) throws IndexOutOfBoundsException {
  }
  
  public void setRelation(RelationData[] relationDatas) {

  }
  
  public void setRelationCollection(Collection pCollection) {
  }

  public String getRecordSourceName() {
    return null;
  }
  
  public VCMGUID getWorkflowCreate() {
    return null;
  }
  
  public void setWorkflowCreate(VCMGUID workflowCreate) {
  }
  
  public VCMGUID getWorkflowEdit() {
    return null;
  }
  
  public void setWorkflowEdit(VCMGUID workflowEdit) {
  }
  
  public String getIconPath() {
    return null;
  }
  
  public void setIconPath(String iconPath) {
  }
  
  public String getSmallIconPath() {
    return null;
  }
  
  public void setSmallIconPath(String iconPath) {

  }
  
  public String getLargeIconPath() {
    return null;
  }
  
  public void setLargeIconPath(String iconPath) {
  }
  
  public String getDefaultThumbnailPath() {
    return null;
  }
  
  public void setDefaultThumbnailPath(String thumbnailPath) {
  }
  
  public static String buildFullPath(String rootPath, String logicalPath) {
    return null;
  }
  
  public String getDefaultFullPath() {
    return null;
  }
  
  protected String buildRootPath(String name) {
    return null;
  }
  
  public String getRootPath() {
    return null;
  }
  
  public String getDefaultLogicalPath() {
    return null;
  }
  
  public void setDefaultLogicalPath(String path) {
  }
  
  public String getUserApplURL() {
    return null;
  }
  
  public void setUserApplURL(String url) {
  }
  
  public String getJavaClassName() {
    return null;
  }
  
  public void setJavaClassName(String className) {
  }
  
  public String getEligibilitiesClassName() {
    return null;
  }
  
  public void setEligibilitiesClassName(String className) {
  }
  
  public RelationData getRelation(String name) {
    return null;
  }
  
  public AttributeDefinitionData[] getAllAttributeDefinitions(AttributeType[] type) {
    return null;
  }
  
  public AttributeDefinitionData[] getAllAttributeDefinitions() {
    return null;
  }
  
  public AttributeDefinitionData[] getClientAttributeDefinitions() {
    return null;
  }
  
  public AttributeDefinitionData getAttributeDefinition(String name) {
    return null;
  }
  
  public AttributeDefinitionData getAttributeDefinition(AppObjectId id) {
    return null;
  }
  
  public AttributeDefinitionData[] getExtensibleAttributeDefinitions() {
    return null;
  }
  
  public AttributeDefinitionData[] getSharableAttributeDefinitions() {
    return null;
  }
  
  public List<String> getSharableAttributeNames() {
    return null;
  }
  
  public AttributeDefinitionData[] getBusinessObjectFixedAttributeDefinitions() {
    return null;
  }
  
  public AttributeDefinitionData[] getKeyAttributeDefinitions() {
    return null;
  }
  
  public boolean nameInUse(String name) {
    return true;
  }
  
  public TreeMap getRelationMap() {
    return null;
  }
  
  public RelationData[] getChildRelations(String relation) {
    return null;
  }
  
  public boolean hasUserTable() throws ApplicationException {
    return true;
  }
  
  public MsgObject[] validate() {
    return null;
  }
  
  public ManagedObject getManagedObjectFromJavaClassName() throws ApplicationException {
    return null;
  }
  
  public IPublishEligibilities getPublishEligibilities() throws ApplicationException {
    return null;
  }
  
  public boolean hasValidUserData() {
    return true;
  }
  
  public static boolean hasValidName(String name) {
    return true;
  }
  
  public boolean hasKey() {
    return true;
  }
  
  public boolean canCreateInstances() {
    return true;
  }
  
  public boolean hasNullContentTypeReferences() {
    return true;
  }
  
  public ReferenceData[] getContentTypeReferences() {
    return null;
  }
  
  public ReferenceData[] getReferenceData(ReferenceType[] type) {
    return null;
  }
  
  public int getNextExtensibleOrdinal() {
    return 0;
  }
  
  public String getRelationName(AttributeDefinitionData attrDef) {
    return null;
  }
  
  public RelationData[] getRelationsForTable(String tableName) {
    return null;
  }
  
  public Enumeration enumerateRelation() {
    return null;
  }
  
  public int getRelationCount() {
    return 1;
  }
  
  public String getDisplayName() {
    return null;
  }
  
  public String getDisplayName(Locale locale) {
    return null;
  }
  
  public void setDisplayName(String name) {
  }
  
  public boolean getSiteAffinity() {
    return true;
  }
  
  public void setSiteAffinity(boolean b) {

  }
  
  public String getEditorStyle() {
    return null;
  }
  
  public MsgObject getEditorStyleMsgObject() {
    return null;
  }
  
  public static MsgObject getEditorStyleMsgObject(String editorStyle) {
    return null;
  }
  
  public void setEditorStyle(String style) {
  }
  
  public void addExtensibleAttributeDefinition(AttributeDefinitionData attrDef) throws ApplicationException {
  }
  
  public boolean removeExtensibleAttributeDefinition(AttributeDefinitionData attrDef) throws ApplicationException {
    return true;
  }
  
  public String getDefaultLabel(String delimiter) {
    return null;
  }
  
  public AttributeDefinitionData[] getDefaultLabelAttrDef() {
    return null;
  }
  
  public AttributeDefinitionData[] orderAttributeDefinitionArray(AttributeDefinitionData[] attrDef) {
    return null;
  }
  
  public ColumnMetadata getColumnMetadata() throws ApplicationException, ConfigException {
    return null;
  }
  
  protected void transferTopRelationOnlyAttributeDefinitions(RelationData fromRelation, RelationData toRelation) {
  }
  
  public static String convertXmlNameToJavaName(String xmlName) {
    return null;
  }
  
  public static String convertXmlNameToJavaClassName(String xmlName) {
    return null;
  }
  
  public static boolean isValidJavaName(String name) {
    return true;
  }
  
  public static boolean isValidQualifiedName(String name) {
    return true;
  }
  
  public String getWrapperSpec() {
    return null;
  }
  
  public void setWrapperSpec(String spec) {
  }
  
  protected MsgObject[] validateTargetingSettings() {
    return null;
  }
  
  protected MsgObject[] validateMultilingualSettings() {
    return null;
  }
  
  public boolean hasMlSettings() {
  return true;
  }
  
  public void clearMlSettings() {
    
  }
  
  public void setMlSettingsDefaults() {
    
  }
  
  public VCMGUID getWorkflowTranslate() {
    return null;
  }
  
  public void setWorkflowTranslate(VCMGUID workflowTranslate) {
   
  }
   
  public boolean getMultilingual() {
    return true;
  }
  
  public void setMultilingual(boolean multilingual) {
  
  }
  
  public boolean getMlInstanceDefault() {
    return true;
  }
  
  public void setMlInstanceDefault(boolean mlInstanceDefault) {

  }
  
  public void setMlcOptions(int mlcOptions) {

  }
  
  public MlSetFolderType getMlSetFolderType() {
    return null;
  }
  
  public void setMlSetFolderType(MlSetFolderType mlSetFolderType) {
  }
  
  public void setMlSetFolder(String mlSetFolder) {

  }
  
  public String getMlCustomFolderClassName() {
    return null;
  }
  
  public void setMlCustomFolderClassName(String mlCustomFolderClassName) {
  }
  
  public boolean getMlShareChannels() {
    return true;
  }
  
  public void setMlShareChannels(boolean mlShareChannels) {
  }
  
  public boolean getMlShareCategories() {
    return true;
  }
  
  public void setMlShareCategories(boolean mlShareCategories) {

  }
  
  public boolean getMlShareSchedules() {
    return true;
  }
  
  public void setMlShareSchedules(boolean mlShareSchedules) {
  }
  
  public boolean getTargetable() {
    return true;
  }
  
  public void setTargetable(boolean targetable) {

  }
  
  protected boolean supportsMultilingual() {
    return true;
  }
  
  protected boolean supportsTargetableChanges() {
    return true;
  }
}
