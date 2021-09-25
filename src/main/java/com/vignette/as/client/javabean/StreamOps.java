package com.vignette.as.client.javabean;

import com.vignette.as.client.ejb.IStreamOps;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.ValidationException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;

public class StreamOps implements Serializable {
  static final int DEFAULT_CHUNK_SIZE = 32768;
  
  static final int DEFAULT_TTL = 3600;
  
  String _key;
  
  int _chunksize = 32768;
  
  int _ttl = 3600;
  
  public String getKey() {
    return null;
  }
  
  public void setKey(String key) throws ValidationException {
   
  }
  
  public int getChunksize() {
    return 1;
  }
  
  public void setChunksize(int chunksize) throws ValidationException {
  }
  
  public int getTTL() {
    return 1;
  }
  
  public void setTTL(int ttl) {
  }
  
  public void uploadStream(InputStream inputStream) throws ApplicationException, ValidationException {
  
  }
  
  public void uploadReader(Reader reader) throws ApplicationException, ValidationException {
 
  }
  
  public void clean() throws ApplicationException, ValidationException {
  
  }
  
  public void downloadStream(OutputStream outputStream) throws ApplicationException, ValidationException {
   
  }
  
  public void downloadWriter(Writer writer) throws ApplicationException, ValidationException {
    
  }
  
  private static IStreamOps getLocalOps() throws ApplicationException {
    return null;
  }
}
