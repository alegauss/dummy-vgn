package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.common.ref.ContentTypeRef;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;

import com.vignette.as.client.javabean.IPagingList;

import com.vignette.as.server.event.AsPrePersistenceEvent;



public class PresentationFormat extends VgnExtTemplatingObject {

  
  public static final String CONTENT_TYPE_NAME = "";
  
  public static final String ATTR_NAME = "";
  
  public static final String ATTR_DISPLAY_NAME = "";
  
  public static final String ATTR_DESCRIPTION = "";

  
  public PresentationFormat() {
      }
  
  protected boolean isInternal() {
    return false;
  }
  
  public void commit() throws ApplicationException, AuthorizationException, ValidationException {
   
  }

  public String getDisplayName() throws ApplicationException {
    return null;
  }
  
  public String getDescription() throws ApplicationException {
    return null;
  }
  
  public static synchronized ContentTypeRef getContentTypeRef() throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByName(String name) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByNameIgnoreCase(String name) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findAll() throws ApplicationException, ValidationException {
    return null;
  }
  
  public void handlePreCreate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public void handlePreUpdate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public void handlePreDelete(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
    super.handlePreDelete(event);
    checkForReferents();
  }
  
  private void checkForReferents() throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public static String getFormatNameFromId(String formatId) {
    return null;
  }
}
