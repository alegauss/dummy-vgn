package com.vignette.as.common.util.database;

import com.vignette.logging.context.ContextLogger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColumnMetadata implements Serializable {
  static ContextLogger log = null;
  
  protected List<DBColumn> columnList = new ArrayList<DBColumn>();
  
  protected List<DBTable> tableList = new ArrayList<DBTable>();
  
  protected DBSchema dbSchema = null;
  
  public void setDBMetadata(boolean hasDBMetadata) {
    
  }
  
  public boolean getDBMetadata() {
    return true;
  }
  
  public DBSchema getDBSchema() {
   return null;
  }
  
  public Iterator<DBTable> getDBTables() {
    return null;
  }
  
  public DBColumn addDBColumn(DBColumn dbColumn) {
    return null;
  }
  
  public void removeDBColumn(DBColumn dbColumn) {
   
  }
  
  public DBColumn getDBColumn(String dbColumnStr) {
      return null;
  }
}
