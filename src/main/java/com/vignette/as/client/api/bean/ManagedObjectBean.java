package com.vignette.as.client.api.bean;

import com.vignette.as.client.common.ManagedObjectStatus;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.ext.templating.util.RequestContext;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public interface ManagedObjectBean {
  SystemMetadata getSystem();
  
  int hashCode();
  
  boolean equals(Object paramObject);
  
  void setRequestContext(RequestContext paramRequestContext);
  
  public static interface SystemMetadata {
    String getName();
    
    String getId();
    
    String getExemplarId();
    
    String getXml();
    
    ObjectTypeBean getObjectType();
    
    ManagedObjectStatus getStatus();
    
    boolean isApproved();
    
    String getLogicalPath();
    
    Date getLastPublishDate();
    
    Date getLastUnpublishDate();
    
    String getCreator();
    
    Date getCreationTime();
    
    String getLastModifier();
    
    Date getLastModTime();
    
    ManagedObjectVCMRef getParentProjectId();
    
    Map<String, Set<AdhocMoReferenceBean>> getAdhocReferences();
    
    Map<String, Set<ComputedMoReferenceBean>> getComputedReferences();
    
    String getFurlName();
    
    boolean getMultilingual();
    
    ContentItemBean getTargetingRule();
  }
}
