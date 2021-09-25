package com.vignette.as.client.common;

import com.vignette.as.client.common.ref.ManagedObjectVCMRef;

public class ChannelContentAssociationData extends ApplicationObjectData {
  
  public ChannelContentAssociationData() {}
  
  public ChannelContentAssociationData(ChannelContentAssociationData data) {

  }
  
  public AppObjectId getId() {
    return null;
  }
  
  public void setId(AppObjectId id) {

  }
  
  public ManagedObjectVCMRef getContentRef() {
    return null;
  }
  
  public void setContentRef(ManagedObjectVCMRef contentRef) {
  }
  
  public boolean equals(Object o) {
    return true;
  }
  
  public boolean isStaticFileAssociation() {
    return true;
  }
}
