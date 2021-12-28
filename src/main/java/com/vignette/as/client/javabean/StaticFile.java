package com.vignette.as.client.javabean;

import com.vignette.as.client.common.AttributeData;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.StaticFileData;
import com.vignette.as.client.common.ref.ChannelRef;
import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.common.ref.StaticFileRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Date;
import java.util.List;

public class StaticFile extends ContentItem {
  
  protected List getApprovalRequiredProperties() {
	return null;
  }
  
  protected List getWorkflowRequiredProperties() {
	return null;
  }
  
  public StaticFileData getStaticFileData() {
	return null;
  }
  
  public void setStaticFileData(StaticFileData data) {

  }
  
  public void setTaxonomyClassifications(String[] classifications) {

  }
  
  public String[] getTaxonomyClassifications() {
	return null;
  }
  
  public void addTaxonomyClassification(String classification) {

  }
  
  public void removeTaxonomyClassification(String classification) {

  }
  
  public void setChannelRefs(ChannelRef[] channelRefs) {

  }
  
  public ChannelRef[] getChannelRefs() {
	return null;
  }
  
  public void setChannels(Channel[] channels) throws ApplicationException, ValidationException {

  }
  
  public IPagingList getChannels(RequestParameters reqParams) throws ApplicationException, ValidationException {
	return null;
  }
  
  public void addChannelRef(ChannelRef channelRef) {

  }
  
  public void addChannel(Channel channel) throws ApplicationException, ValidationException {

  }
  
  public void removeChannelRef(ChannelRef channelRef) {

  }
  
  public void removeChannel(Channel channel) throws ApplicationException, ValidationException {

  }
  
  public static IPagingList findByPlacementPath(String[] placementPath, RequestParameters p) throws ApplicationException, ValidationException {
	return null;
  }
  
  public AttributeData[] getPrimaryKeys() throws ApplicationException {
	return null;
  }
  
  private void setPrimaryKeys(AttributeData[] keys) {
  }
  
  public static StaticFile newInstance() throws ApplicationException {
	return null;
  }
  
  public static ObjectTypeRef getTypeObjectTypeRef() {
	return null;
  }
  
  public ObjectTypeRef getObjectTypeRef() throws ApplicationException {
	return null;
  }
  
  protected Class getLogicInterface() {
	return null;
  }
  
  
  public void setName(String name) {

  }
  
  public String getName() throws ApplicationException {
	return null;
  }
  
  public void setPlacementPath(String placementPath) {

  }
  
  public String getPlacementPath() {
	return null;
  }
  
  public void setDirectory(String directory) {

  }
  
  public String getDirectory() {
	return null;
  }
  
  public void setFileName(String fileName) {

  }
  
  public String getFileName() {
	return null;
  }
  
  public void setFileNameBase(String fileNameBase) {
  }
  
  public String getFileNameBase() {
	return null;
  }
  
  public void setFileNameExtension(String extension) {
  }
  
  public String getFileNameExtension() {
	return null;
  }
  
  public void setDeploymentType(String deploymentType) {
  }
  
  public String getDeploymentType() {
	return null;
  }
  
  public void setDescription(String description) {
  }
  
  public String getDescription() {
	return null;
  }
  
  public void setFileSourceName(String fileSourceName) {

  }
  
  public String getFileSourceName() {
    return null;
  }
  
  public String getMgmtStageURLPath() {
    return null;
  }
  
  public String getMgmtStageURL() {
	return null;
  }
  
  public String getMgmtStageMountPath() {
	return null;
  }
  
  public void setFileSize(long fileSize) {

  }
  
  public long getFileSize() {
    return 0L;
  }
  
  public void setFileModificationTime(Date fileModificationTime) {

  }
  
  public Date getFileModificationTime() {
	return null;
  }
  
  public void setFileContents(InputStream fileContents) {

  }
  
  public InputStream getFileContents() throws ApplicationException, ValidationException {
	return null;
  }
  
  public String getTempUploadPath() throws ApplicationException {
	return null;
  }
  
  public static void setFileContents(StaticFileRef sfRef, InputStream fileContents) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public static InputStream getFileContents(StaticFileRef sfRef) throws ValidationException {
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
  
  public static StaticFile importXML(ObjectTypeRef objectTypeRef, Reader reader, InputStream fileBody, IImportXMLControl importControl) throws ApplicationException, AuthorizationException, ValidationException {
	return null;
  }
  
  public void commit() throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public void attach(String fileSource, String placementPath) throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public void detach() throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  protected void setAttaching(boolean attaching) {

  }
  
  public boolean isAttaching() {
    return true;
  }
  
  protected void setDetaching(boolean detaching) {
   
  }
  
  public boolean isDetaching() {
    return true;
  }
  
  protected void refresh(ManagedObject obj) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public ManagedObjectRef getManagedObjectRef() throws ApplicationException {
    return null;
  }
  
  public String getMimeType() {
    return null;
  }
  
}
