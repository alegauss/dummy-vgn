package com.vignette.as.client.ejb;

import com.vignette.as.client.common.ref.SiteRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.ManagedObject;
import com.vignette.as.client.javabean.SiteContentType;
import java.util.Collection;

public interface ISiteContentTypeOps extends IExtensibleApplicationObjectOps {
  public static final String MAPPED_NAME = "SiteContentTypeOps";
  
  public static final String AS_OPS_LOGIC_LOCAL = "com.vignette.as.server.logic.site.SiteContentTypeOpsLogic";
  
  ManagedObject commit(ManagedObject paramManagedObject) throws ApplicationException, AuthorizationException, ValidationException;
  
  void delete(ManagedObject paramManagedObject) throws ApplicationException, AuthorizationException, ValidationException;
  
  SiteContentType findBySite(SiteRef paramSiteRef) throws ApplicationException, ValidationException;
  
  Collection getContentTypes(SiteRef paramSiteRef) throws ApplicationException, ValidationException;
  
  Collection getContentTypes(SiteContentType paramSiteContentType) throws ApplicationException, ValidationException;
}
