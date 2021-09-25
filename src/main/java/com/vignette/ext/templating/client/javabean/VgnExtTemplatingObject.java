package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.common.ContentInstanceDBQuery;
import com.vignette.as.client.common.ContentInstanceWhereClause;
import com.vignette.as.client.common.Query;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.WhereClause;
import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.ContentInstance;
import com.vignette.as.client.javabean.IPagingList;
import com.vignette.as.client.javabean.QueryManager;
import com.vignette.as.config.ConfigUtil;
import com.vignette.as.server.event.AsPostPersistenceEvent;
import com.vignette.as.server.event.AsPrePersistenceEvent;
import com.vignette.config.client.common.ConfigException;
import com.vignette.ext.templating.cache.CachingDetail;
import com.vignette.ext.templating.cache.RenderedManagedObjectCacheKey;
import com.vignette.ext.templating.util.CustomerMsg;
import com.vignette.ext.templating.util.MsgObject;

import java.rmi.RemoteException;

public class VgnExtTemplatingObject extends ContentInstance implements ICacheableObject {
  static final long serialVersionUID = 1L;
  
  public void commit() throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  public boolean isCacheable() throws ApplicationException {
    return true;
  }
  
  public long getTTL() throws ApplicationException {
    return 0L;
  }
  
  public String createCacheKey(RenderedManagedObjectCacheKey key) throws ApplicationException {
    return null;
  }
  
  public void handlePreCreate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  public void handlePreUpdate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  public void handlePreDelete(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {}
  
  public void handlePostCreate(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {}
  
  public void handlePostUpdate(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {}
  
  public void handlePostDelete(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {}
  
  protected void validatePubUnpubDates() throws ApplicationException, ValidationException {

  }
  
  protected boolean isInternal() {
    return true;
  }
  
  private void maybeApproveObject() {
  }
  
  private void maybeAuthorizeObject() throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  protected void validateCachingAttributes(String attrTTL) throws ApplicationException, ValidationException {
  }
  
  public static IPagingList findByAttribute(ContentTypeRef ctRef, String attrName, String attrValue) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByAttribute(ContentTypeRef ctRef, String attrName, String attrValue, boolean caseSensitive) throws ApplicationException, ValidationException {
    return null;
  }
  
  protected void validateName(ContentTypeRef ctRef, String attrName, String attrValue, boolean uniqueAcrossSystem) throws ApplicationException, ValidationException, AuthorizationException {
  }
  
  protected void validateName(ContentTypeRef ctRef, String attrName, String attrValue, boolean uniqueAcrossSystem, boolean caseSensitive) throws ApplicationException, ValidationException, AuthorizationException {
  }
  
  protected void validateName(ContentTypeRef ctRef, String attrName, String attrValue) throws ApplicationException, ValidationException, AuthorizationException {
  }
  
  protected boolean exists(ContentTypeRef ctRef, String attrName, String attrValue, boolean caseSensitive, String logicalPath, ManagedObjectVCMRef exclusion) throws ApplicationException, ValidationException {
    return true;
  }
  
  protected void validateField(String fieldName, String value, int maxAllowedLength) throws ValidationException {
  }
  
  protected void validateFormatName(String formatName) throws ApplicationException, ValidationException {
  }
  
  protected boolean checkForLock() throws ApplicationException, AuthorizationException, ValidationException {
    return true;
  }
}
