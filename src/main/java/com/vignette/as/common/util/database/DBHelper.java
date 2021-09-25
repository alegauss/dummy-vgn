package com.vignette.as.common.util.database;

import com.vignette.as.client.common.AttributeDefinitionData;
import com.vignette.as.client.common.ObjectTypeData;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.config.client.common.ConfigException;
import com.vignette.logging.context.ContextLogger;
import java.util.ArrayList;

public class DBHelper {
  static ContextLogger log = null;

  
  public void setDBConnection(String resourceName) throws ConfigException {

  }
  
  public void closeDBConnection() {
    
  }
  
  public DBSchema getDBSchema() throws ApplicationException {
    return null;
  }
  
  public ArrayList getDBTable(DBSchema dbSchema) throws ApplicationException {
    return null;
  }
  
  public ArrayList getDBColumn(DBTable dbTable) throws ApplicationException {
    return null;
  }
  
  public String getDBName() throws ApplicationException {
    return null;
  }
  
  public static DBHelper getDBHelper(String resourceName) throws ConfigException {
    return null;
  }
  
  public void setDBColumnAttributes(ColumnMetadata columnMetadata, ObjectTypeData otd, AttributeDefinitionData add) throws ApplicationException {
  }
  
}
