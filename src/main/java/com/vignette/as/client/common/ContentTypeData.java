package com.vignette.as.client.common;

import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.as.client.common.ref.StaticFileRef;
import com.vignette.as.common.exception.PersistorFinderException;
import com.vignette.logging.LoggingManager;
import com.vignette.logging.context.ContextLogger;
import com.vignette.util.MsgObject;
import java.util.ArrayList;
import java.util.Enumeration;

public class ContentTypeData extends ContentTypeBaseData {
   
  public ContentTypeData() {
   
  }
  
  public void postLoad() throws PersistorFinderException {
   
  }
  
  public String getRootPath() {
    return null;
  }
  
  public StaticFileRef getFileXSDRef() {
    return null;
  }
  
  public void setFileXSDRef(StaticFileRef staticFileRef) {
    
  }
  
  public void setPageRef(String pageRef) {
   
  }
  
  public String getBeanClassName() {
    return null;
  }
  
  public void setBeanClassName(String name) {
   
  }
    
  public void setName(String name) {

  }
  
  public ContentTypeRef[] findReferencedTypes() {
    return null;
  }
  
  public MsgObject[] validate() {
   return null;
  }
  
  protected boolean supportsMultilingual() {
    return true;
  }
  
  protected boolean supportsTargetableChanges() {
    return true;
  }
}
