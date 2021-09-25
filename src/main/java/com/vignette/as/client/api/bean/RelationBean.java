package com.vignette.as.client.api.bean;

import java.util.List;

public interface RelationBean {
  String getId();
  
  String getParentRelationName();
  
  List<AttributeDefinitionBean> getAttributeDefinitions();
  
  List<ReferenceBean> getReferences();
  
  int getMaximum();
  
  int getMinimum();
  
  String getName();
  
  List<RelationBean> getChildren();
  
  String getSchema();
  
  String getTable();
  
  String getFullName();
  
  boolean isTopRelation();
  
  List<AttributeDefinitionBean> getKeyAttributeDefinitions();
  
  boolean hasChildren();
}
