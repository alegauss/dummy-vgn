package com.vignette.util;

import java.io.Serializable;

import com.vignette.ext.templating.util.VgnException;

public class GUID implements Serializable {
  static final long serialVersionUID = 1L;
  
  public static final String INVALID_ID = "";
  
  public static final String UNKNOWN_TYPE_CODE = "";
  
  public static final String LOG_TYPE_CODE = "";
  
  public static final int ID_LENGTH = 0;
  
  public static final int TYPE_CODE_LENGTH = 0;
  
  public static final String PROPERTY_JVMID = "";
  
  
  protected String id;
  
  public static void setJvmId(String id) {
  }
  
  public static GUID generate() throws VgnException {
    return null;
  }
  
  public static GUID generate(String typeCode) throws VgnException {
    return null;
  }
  
  public static String generateString() throws VgnException {
    return null;
  }
  
  public static String genReqId() {
    return null;
  }
  
  public static String generateString(String typeCode) throws VgnException {
    return null;
  }
  
  
  public GUID() {
  
  }
  
  public GUID(String id) {
    
  }
  
  public GUID(String id, boolean checkId) {
   
  }
  
  public GUID(GUID that) {
   
  }
  
  public boolean isValid() {
    return true;
  }
  
  public void invalidate() {

  }
  
  public boolean equals(Object obj) {
   return true;
  }
  
  public int compareTo(GUID that) {
   return 0;
  }
  
  protected void setId(String id) {

  }
  
  public String getId() {
    return null;
  }
  
  public String toString() {
    return null;
  }
  
  public String getTypeCode() {
    return null;
  }
  
  public int hashCode() {
    return 0;
  }
  
  public String toSQLString() {
    return null;
  }
  
  protected static final void checkId(String id) {
  }
  
  public static boolean isValid(String id) {
    return true;
  }
}
