package com.vignette.as.client.ejb;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.StreamOps;

public interface IStreamOps extends IOps {
  public static final String MAPPED_NAME = "";
  
  public static final String AS_OPS_LOGIC_LOCAL = "";
  
  public static final boolean AS_OPS_CACHEABLE_BEAN = false;
  
  void clean(String paramString) throws ApplicationException, ValidationException;
  
  byte[] downloadBytes(int paramInt) throws ApplicationException, ValidationException;
  
  char[] downloadChars(int paramInt) throws ApplicationException, ValidationException;
  
  void finishDownload() throws ApplicationException, ValidationException;
  
  String finishUpload() throws ApplicationException, ValidationException;
  
  int skipBytes(int paramInt) throws ApplicationException, ValidationException;
  
  String startDownloadBytes(StreamOps paramStreamOps) throws ApplicationException, ValidationException;
  
  String startDownloadChars(StreamOps paramStreamOps) throws ApplicationException, ValidationException;
  
  void startUploadBytes(StreamOps paramStreamOps) throws ApplicationException;
  
  void startUploadChars(StreamOps paramStreamOps) throws ApplicationException;
  
  void uploadBytes(byte[] paramArrayOfbyte) throws ApplicationException, ValidationException;
  
  void uploadChars(char[] paramArrayOfchar) throws ApplicationException, ValidationException;
  
  void remove() throws ApplicationException;
}
