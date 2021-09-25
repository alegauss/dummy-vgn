package com.vignette.as.client.common;

import com.vignette.as.client.common.ref.ManagedObjectVCMRef;

public class ContentInstanceAssociationData extends ChannelContentAssociationData {
  public ContentInstanceAssociationData() {}
  
  public ContentInstanceAssociationData(ChannelContentAssociationData data) {
    super(data);
  }
  
  public ManagedObjectVCMRef getContentInstanceRef() {
    return null;
  }
  
  public void setContentInstanceRef(ManagedObjectVCMRef contentInstanceRef) {
  }
}
