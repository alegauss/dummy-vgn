package com.vignette.as.client.common;

import com.vignette.as.client.common.ref.StaticFileRef;

public class StaticFileAssociationData extends ChannelContentAssociationData {
  public StaticFileAssociationData() {}
  
  public StaticFileAssociationData(ChannelContentAssociationData data) {
    super(data);
  }
  
  public StaticFileRef getStaticFileRef() {
    return null;
  }
  
  public void setStaticFileRef(StaticFileRef staticFileRef) {
  }
}
