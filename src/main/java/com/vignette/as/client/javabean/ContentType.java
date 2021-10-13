package com.vignette.as.client.javabean;

import com.vignette.as.client.common.ContentTypeData;
import com.vignette.as.client.common.ObjectTypeData;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.common.ref.VCMObjectRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.ValidationException;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class ContentType extends ObjectType implements Serializable {
  
  public static final String CONTENT_TYPE_NAME = "";
  
  public static final String PREVIEW_TEMPLATE_ATTRIBUTE_NAME = "";
  
  
  public ContentType() {
    super((ObjectTypeData)new ContentTypeData());
  }
  
  protected ContentType(ContentTypeData data) {
    super((ObjectTypeData)data);
  }
  
  protected List getApprovalRequiredProperties() {
	return null;
  }
  
  protected List getWorkflowRequiredProperties() {
	return null;
  }
  
  public boolean persistsManagedObjectData() {
    return true;
  }
  
  public boolean persistsExtensibleObjectAttributes() {
    return true;
  }
  
  public ObjectTypeData getData() {
	return null;
  }
  
  public static ObjectTypeRef getTypeObjectTypeRef() {
	return null;
  }
  
  public ManagedObject newInstance() throws ApplicationException {
    return null;
  }
  
  public static IPagingList findAll() throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findAll(RequestParameters parms) throws ApplicationException, ValidationException {
	return null;
  }
  
  public ContentType[] findAllReferencedTypes() throws ApplicationException, ValidationException {
    return null;
  }
  
  public ContentType[] findAllWhoReferToMe() throws ApplicationException, ValidationException {
    return null;
  }
  
  public static Set<ContentTypeRef> findContentTypeRefsForProject(VCMObjectRef projectRef) throws ApplicationException {
    return null;
  }
  
  protected Class getLogicInterface() {
	return null;
  }
  
  public static void flushContentTypes() throws ApplicationException {
   
  }
  
  public static void clearCache() throws ApplicationException {
   
  }
  
  public String getTypeCapabilityPrefix() {
    return null;
  }
  
  public ManagedObjectRef getManagedObjectRef() throws ApplicationException {
  	return null;
  }
}
