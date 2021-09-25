package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.Channel;
import com.vignette.as.client.javabean.Site;

import com.vignette.as.server.event.AsPostPersistenceEvent;
import com.vignette.as.server.event.AsPrePersistenceEvent;


import java.rmi.RemoteException;
import java.util.HashSet;

public abstract class VgnExtTemplatingBusinessObject extends VgnExtTemplatingObject {
  static final long serialVersionUID = 1L;
  
  public void handlePreDelete(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
      }
  
  public void handlePostCreate(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
  }
  
  public static void handleSitePreDelete(String SiteId) {
    
  }
  
  public void handlePostUpdate(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  protected Channel getAssociationsChannel(boolean createIfNecessary, boolean isPage) throws ApplicationException, AuthorizationException, ValidationException {
   return null;
  }
  
  protected abstract Site getParentSite() throws ApplicationException, AuthorizationException, ValidationException;
  
  protected abstract SiteAssociations getRequiredAssociations() throws ApplicationException, AuthorizationException, ValidationException;
  
  protected void addSiteAssociations() throws ApplicationException, AuthorizationException, ValidationException {
  
  }
  
  protected void addContentTypeAssociations(HashSet potentialAssocs) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  protected void addContentAssociations(HashSet potentialAssocs, boolean isPage) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  protected synchronized Channel getAssociationsChannel(Site site, boolean createIfNecessary, boolean isPage) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public Channel getNewAssociationChannel(Channel extTemplatingChannel, Site site, boolean createIfNecessary) throws ApplicationException, ValidationException, RemoteException, AuthorizationException {
   return null;
  }
  
  private Channel getExtTemplatingChannel(Site site, boolean createIfNecessary) throws ApplicationException, ValidationException, RemoteException, AuthorizationException {
    return null;
  }
  
  private Channel getValidAssociationChannel(Channel parentChannel, boolean createIfNecessary) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  protected Channel getChannelFromDB(Channel parentChannel, int counter, boolean createIfNecessary) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
}
