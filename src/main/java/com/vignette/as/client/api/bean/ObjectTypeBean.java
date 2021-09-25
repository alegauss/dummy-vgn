package com.vignette.as.client.api.bean;

import java.util.List;
import java.util.Map;

public interface ObjectTypeBean extends ManagedObjectBean {
  String getDisplayName();
  
  String getDescription();
  
  String getJavaClassName();
  
  String getWrapperSpec();
  
  RelationBean getTopRelation();
  
  List<AttributeDefinitionBean> getAllAttributeDefinitions();
  
  Map<String, RelationBean> getRelationMap();
  
  boolean hasInstances();
  
  int getObjectCount();
  
  String getEditorStyle();
  
  String getEditorStyleLocalized();
  
  boolean getTargetable();
}
