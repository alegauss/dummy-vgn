package com.vignette.as.client.api.bean;

import java.util.List;

public interface ReferenceBean {
  public static final int CONTENT_TYPE_KEYS_VAL = 0;
  
  public static final int FILE_PATH_VAL = 0;
  
  public static final int VCM_GUID_VAL = 0;
  
  String getId();
  
  String getParentRelationId();
  
  RelationBean getParentRelation();
  
  List<String> getKeys();
  
  ContentTypeBean getReferencedContentType();
  
  int getReferenceTypeValue();
  
  boolean isFilePath();
  
  boolean isContentTypeKeys();
  
  boolean isVCMGUID();
}
