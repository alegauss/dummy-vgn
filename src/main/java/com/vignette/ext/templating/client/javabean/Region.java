package com.vignette.ext.templating.client.javabean;

import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.ContentInstance;
import com.vignette.as.client.javabean.IPagingList;
import com.vignette.as.client.javabean.Site;
import com.vignette.as.server.event.AsPostPersistenceEvent;
import com.vignette.as.server.event.AsPrePersistenceEvent;
import com.vignette.logging.LoggingManager;
import com.vignette.logging.context.ContextLogger;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class Region extends VgnExtTemplatingObject {
  private static ContextLogger LOG = LoggingManager.getContextLogger(Region.class);
  
  public static final String CONTENT_TYPE_NAME = "";
  
  public static final String REGION_ID_ATTRIB = "";
  
  public static final String REGION_NAME_ATTRIB = "";
  
  public static final String REGION_DESCRIPTION_ATTRIB = "";
  
  public static final String REGION_ISLOCKED_ATTRIB = "";
  
  public static final String REGION_SELECTED_LAYOUT_ATTRIB = "";
  
  public static final String REGION_BLINDTEXT_ATTRIB = "";
  
  public static final String REGION_ALLOW_CUSTOM_LAYOUTS_ATTRIB = "";
  
  public static final String REGION_ALLOWED_LAYOUTS_RELATION = "";
  
  public static final String REGION_ALLOWED_REGION_LAYOUTID_ATTRIB = "";
  
  public static final String REGION_ALLOWED_REGION_REGIONID = "";
  
  public static final String REGION_ALLOWED_LAYOUTID_ATTRIB = "";
  
  public static final String REGION_ALLOWED_COMP_TYPES_RELATION = "";
  
  public static final String REGION_COMPONENT_ATTRIB = "";
  
  public static final String REGION_ALLOWED_COMP_TYPES_ATTRIB_REGIONID = "";
  
  public static final String REGION_ALLOWED_COMPONENTID_ATTRIB = "";
  
  private static String appObjID = "";
  
  public static final String REGION_COMPONENTS = "";
  
  public static final String REGION_COMPONENTS_REGIONID = "";
  
  public static final String REGION_COMPONENTS_REGIONCOMPONENTID = "";
  
  public static final String REGION_COMPONENTS_CONTENTCOMPONENTID = "";
  
  public static final String REGION_COMPONENTS_SEQUENCE = "";
  
  public static final String DEFAULT_REGIONS_PATH = "";
  
  public static final String TRUE = "";
  
  public Region() {

  }
  
  public String getId() throws ApplicationException {
    return null;
  }
  
  public String getName() throws ApplicationException {
    return null;
  }
  
  public String getDescription() throws ApplicationException {
    return null;
  }
  
  public RegionLayout getSelectedLayout() throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  public String getLocked() throws ApplicationException {
    return null;
  }
  
  public boolean isLocked() throws ApplicationException {
    return true;
  }
  
  public boolean isAllowCustomLayouts() throws ApplicationException {
    return true;
  }
  
  public static Region findById(String id) throws ApplicationException, AuthorizationException, ValidationException {
    return null;
  }
  
  public static ContentTypeRef getContentTypeRef() throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByIds(String[] ids) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByName(String name) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findBySlectedLayout(String regionLayoutId) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByAllowedLayout(String regionLayoutId) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static IPagingList findByContentComponentId(String contentComponentId) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static Region findByContentComponentContainer(ContentComponentContainer ccc, String regionName) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  public static Region findBySiteAndContentInstance(Site site, ContentInstance ci, Template template, String regionName) throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  public void handlePreDelete(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
    
  }
  
  public void handlePostCreate(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public void handlePostUpdate(AsPostPersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public List getConfiguredContentComponents() throws ApplicationException {
    return null;
  }
  
  public List<ManagedObjectVCMRef> getAllConfiguredContentComponentRefs(boolean includeTranslations) throws ApplicationException {
    return null;
  }
  
  public List<String> getContentComponents() throws ApplicationException {
    return null;
  }
  
  public List<String> getContentComponents(Locale locale) throws ApplicationException {
    return null;
  }
  
  public HashMap getAllowedRegionLayoutsAsMap() throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  public List getAllowedRegionLayouts() throws ApplicationException, ValidationException, AuthorizationException {
    return null;
  }
  
  public List getAllowedContentComponentTypes() throws ApplicationException {
    return null;
  }
  
  public boolean equals(Object obj) {
       return true;
  }
  
  protected boolean isInternal() {
    return false;
  }
  
  public void handlePreCreate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
   
  }
  
  public void handlePreUpdate(AsPrePersistenceEvent event) throws ApplicationException, AuthorizationException, ValidationException {
  
  }
  
    public static Comparator getSequenceComparator(final boolean asc) {
    return null;
  }
  
  public void setContentComponents(List<RegionComponent> configuredContentComponents) throws ValidationException, ApplicationException {
 
  }
  
  public void setLocked(boolean isLocked) throws ApplicationException {
   
  }
  
  public void setAllowCustomLayouts(boolean isAllowed) throws ApplicationException {
  
  }
  
  public void setSelectedLayout(String layoutVCMID) throws ApplicationException {
    
  }

  public void setBlindText(String blindText) throws ApplicationException {
    
  }
  
  public void setName(String regionName) throws ApplicationException {
   
  }
  
  public void setDescription(String regionDescription) throws ApplicationException {
   
  }
  
  public List getContainers() throws ValidationException, ApplicationException {
    return null;
  }
  
  public void setAllowedLayouts(List<RegionLayout> allowedLayouts) throws ValidationException, ApplicationException {
    
  }
  
  public void setAllowedComponentTypes(List allowedComponentTypes) throws ValidationException, ApplicationException {
    
  }
  
  public String getBlindText() throws ApplicationException {
    return null;
  }
}
