package com.vignette.as.common.util.database;

import com.vignette.as.client.common.DataType;
import com.vignette.logging.context.ContextLogger;

public class DBColumn extends DBElement {
  static ContextLogger log = null;
  
  protected static short INVALID_TYPE = 1;
  
  protected static int INVALID_LENGTH = 1;
  
  protected static int DEFAULT_DECIMALS = 1;
  
  protected static String INVALID_TYPE_STRING = "";
  
  public boolean isSearchable() {
    return false;
  }
  
  public boolean isUserRequired() {
    return true;
  }
  
  public void setUserRequired(boolean userRequired) {

  }
  
  public boolean isNullable() {
    return true;
  }
  
  public void setNullable(boolean nullable) {
  }
  
  public boolean isUserPrimaryKey() {
    return true;
  }
  
  public void setUserPrimaryKey(boolean userPrimaryKey) {
  }
  
  public boolean isPrimaryKey() {
    return true;
  }
  
  public void setPrimaryKey(boolean primaryKey) {
  }
  
  public boolean isSelected() {
    return true;
  }
  
  public void setSelected(boolean selected) {
  }
  
  public DBTable getDBTable() {
    return null;
  }
  
  public void setDBTable(DBTable dbTable) {
  }
  
  public int getLength() {
    return 1;
  }
  
  public void setLength(int length) {
  }
  
  public short getSqlType() {
    return 0;
  }
  
  public void setSqlType(short sqlType) {

  }
  
  public String getSqlTypeString() {
    return null;
  }
  
  public void setSqlTypeString(String sqlTypeString) {

  }
  
  public DataType getMappedType() {
    return null;
  }
  
  public void setMappedType(DataType mappedType) {
  }
  
  public boolean isSummary() {
    return true;
  }
  
  public void setSummary(boolean summary) {
  }
  
  public int getDecimalDigits() {
    return 0;
  }
  
  public void setDecimalDigits(int decimalDigits) {
  }
  
  public boolean isSupportedType() {
    return true;
  }
  
  public void setSupportedType(boolean supportedType) {
  }
  
  public boolean isValid() {
    return true;
  }
  
  public String getDisplayName() {
    return null;
  }
  
  public boolean equals(Object dbColumn) {
    return true;
  }
}
