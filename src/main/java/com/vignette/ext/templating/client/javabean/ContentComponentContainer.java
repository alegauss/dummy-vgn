package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.common.AsObjectRequestParameters;
import com.vignette.as.client.common.AttributeData;
import com.vignette.as.client.common.ManagedObjectStatus;
import com.vignette.as.client.common.Query;
import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.StaticFileDBQuery;
import com.vignette.as.client.common.StaticFileWhereClause;
import com.vignette.as.client.common.WhereClause;
import com.vignette.as.client.common.ref.ChannelRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.Channel;
import com.vignette.as.client.javabean.IPagingList;
import com.vignette.as.client.javabean.ManagedObject;
import com.vignette.as.client.javabean.ObjectType;
import com.vignette.as.client.javabean.QueryManager;
import com.vignette.as.client.javabean.Site;
import com.vignette.as.client.javabean.StaticFile;
import com.vignette.as.server.event.AsPostPersistenceEvent;
import com.vignette.as.server.event.AsPrePersistenceEvent;
import com.vignette.ext.templating.client.javabean.displayview.DisplayView;
import com.vignette.logging.LoggingManager;
import com.vignette.logging.context.ContextLogger;
import com.vignette.util.MsgObject;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class ContentComponentContainer extends VgnExtTemplatingBusinessObject {
  private static final ContextLogger logger = LoggingManager.getContextLogger(ContentComponentContainer.class);
  
  public static final String IMAGE_COMPONENT = "";
  
  private static final String ATTRIBUTE_NAME = "";
  
  protected abstract String getContentComponentsRelationName();
  
  public abstract HashMap getContentComponents() throws ApplicationException;
  
  public abstract Map getAllRegionComponents() throws ApplicationException, AuthorizationException, ValidationException;
  
  public abstract Map<String, List<ManagedObjectVCMRef>> getAllRegionContentComponents(boolean paramBoolean) throws ApplicationException;
  
  public abstract HashMap<String, List> getAllRegionContentComponents() throws ApplicationException;
  
  public abstract List getRegions() throws ApplicationException;
  
  public abstract List getRegionIds() throws ApplicationException;
  
  public Map<String, Region> getRegionsAsMap() throws ApplicationException {
    return null;
  }
  
  public void handlePreDelete(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  private void removeContainerAssets() throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public void handlePostCreate(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public void handlePostUpdate(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  private void approveThemes() throws ApplicationException, ValidationException, AuthorizationException {
   
  }
  
  public List getThemes() throws ApplicationException {
    return null;
  }
  
  public List getPageLayouts() throws ApplicationException {
    return null;
  }
  
  private void removeContentComponents(HashMap componentMap) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public static SiteAssociations getRequiredAssociations(ContentComponentContainer[] contentComponentContainers) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static SiteAssociations getRequiredAssociations(List contentComponentContainers) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  private static AttributeData getAttributeDataForImage(ManagedObject mObj) throws ApplicationException {
    return null;
  }
  
  private void approveContentComponents(boolean parentStatus) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  private void approveRegions() throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  protected static SiteAssociations getRequiredContentComponentAssociations(ContentComponentContainer container, boolean isPage, String pageSiteName) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  private void removeRegions(List regionsList) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  protected static SiteAssociations getRequiredRegionAssociations(ContentComponentContainer container, boolean isPage, String pageSiteName) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  public void addRegionAssociations(Region region) throws ApplicationException, AuthorizationException, ValidationException {}
  
  public void addRegionAssociations(Region region, boolean IsPage, String siteName) {
   
  }
  
  protected static SiteAssociations getAssociatedRegionAssets(Region region, boolean isPage, String pageSiteName) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  private static SiteAssociations getAssociationsForImage(AttributeData attribDataForImage, boolean isPage, SiteAssociations siteAssocs, String callerName, String pageSiteName) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  public void setRegion(Region region) throws ValidationException, ApplicationException {}
  
  protected static SiteAssociations getRequiredThemeAssociations(ContentComponentContainer container, boolean isPage) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  protected static SiteAssociations getRequiredPageLayoutAssociations(ContentComponentContainer container, boolean isPage) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  public Theme getTheme(String formatName) throws ApplicationException {
    return null;
  }
  
  public PageLayout getPageLayout(String formatName) throws ApplicationException {
    return null;
  }
  
  protected void removeSiteAssociationsForThemes(Theme theme, Site parentSite) throws ApplicationException, ValidationException, AuthorizationException {

  }
  
  public void validateFormat() throws ApplicationException, AuthorizationException, ValidationException {

  }
  
  public Format[] getFormats() throws ApplicationException {
    return null;
  }
  
  public List getFormatsAsList() throws ApplicationException {
    return null;
  }
  
  public Template getTemplateForFormat(String formatName) throws ApplicationException {
    return null;
  }
  
  public abstract HashMap<String, FeatureBean> getPageFeaturesForFormat(String paramString) throws ApplicationException;
  
  public abstract HashMap<String, FeatureBean> getEnabledFeatures(String paramString) throws ApplicationException;
  
  public abstract HashMap<String, FeatureBean> getEnabledActiveFeatures(String paramString) throws ApplicationException;
}
