package com.vignette.as.common.util.database;

import com.vignette.logging.context.ContextLogger;

public class DBTable extends DBElement {
  static ContextLogger log = null;
  
  
  public DBTable() {

  }
  
  public String getRelationName() {
    return null;
  }
  
  public void setRelationName(String relationName) {
  }
  
  public boolean hasPrimaryKeyCol() {
    return true;
  }
  
  public void setPrimaryKeyCol(boolean primaryKeyCol) {

  }
  
  public boolean hasNonNullableCol() {
    return true;
  }
  
  public void setNonNullableCol(boolean nonNullCol) {
  }
  
  public DBSchema getDBSchema() {
    return null;
  }
  
  public void setDBSchema(DBSchema dbSchema) {
  }
  
  public boolean isValid() {
    return true;
  }
  
  public boolean equals(Object objectTable) {
    return true;
  }
  
}
