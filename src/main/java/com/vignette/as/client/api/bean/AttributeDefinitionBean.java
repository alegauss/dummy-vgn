package com.vignette.as.client.api.bean;

public interface AttributeDefinitionBean {
  public static final int EXTENSIBLE_VAL = 0;
  
  public static final int USER_VAL = 0;
  
  public static final int STRING_VAL = 0;
  
  public static final int DECIMAL_VAL = 0;
  
  public static final int INT_VAL = 0;
  
  public static final int TINY_INT_VAL = 0;
  
  public static final int DATE_VAL = 0;
  
  public static final int BOOLEAN_VAL = 0;
  
  public static final int CLOB_VAL = 0;
  
  public static final int BLOB_VAL = 0;
  
  public static final int FILE_PATH_VAL = 0;
  
  public static final int GUID_VAL = 0;
  
  String getId();
  
  String getParentRelationId();
  
  RelationBean getParentRelation();
  
  String getReferencedAttributeDefinitionName();
  
  String getName();
  
  String getDisplayName();
  
  String getBeanPropertyName();
  
  boolean getSuppressBeanProperty();
  
  int getAttributeTypeValue();
  
  int getOrdering();
  
  int getDataTypeValue();
  
  boolean isSearchable();
  
  boolean isDefaultLabel();
  
  boolean isSummaryField();
  
  boolean isVisible();
  
  boolean isRequired();
  
  boolean isKeyField();
  
  String getColumnSource();
  
  String getComment();
  
  String getHelpText();
  
  boolean isAutoGen();
  
  int getExtensibleOrdinal();
  
  boolean isExtensible();
  
  String getFullName();
  
  ReferenceBean getReference();
}
