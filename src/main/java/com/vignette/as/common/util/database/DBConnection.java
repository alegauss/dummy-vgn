package com.vignette.as.common.util.database;

import com.vignette.config.client.common.ConfigException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class DBConnection {
  
  public Connection getConnection() {
   return null;
  }
  
  public void setResourceName(String resourceName) {
  }
  
  public void establishConnection() throws ConfigException {

  }
  
  public void closeConnection() {
  }
  
  protected void finalize() throws Throwable {
  
  }
  
  public boolean testConnection() {
    return true;
  }
  
  public DatabaseMetaData getMetaData() throws SQLException {
    return null;
  }
}
