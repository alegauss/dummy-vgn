package com.vignette.as.client.javabean;

import com.vignette.as.client.common.SiteContentTypeData;
import com.vignette.as.client.common.ref.ObjectTypeRef;
import com.vignette.as.client.common.ref.SiteRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import java.io.Serializable;
import java.util.Collection;

public class SiteContentType extends SiteContentTypeBase implements Serializable {
  
  public static SiteContentType findBySite(SiteRef siteRef) throws ApplicationException, ValidationException {
      return null;
  }
  
  public static Collection getContentTypes(SiteRef siteRef) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static Collection getContentTypes(SiteContentType siteContentType) throws ApplicationException, ValidationException {
    return null;
  }
  
  public static SiteContentType newInstance() throws ApplicationException {
    return null;
  }
  
  public SiteContentTypeData getData() {
    return null;
  }
  
  public static ObjectTypeRef getTypeObjectTypeRef() {
    return null;
  }
  
  protected Class getLogicInterface() {
    return null;
  }
  
  protected Class getDataObjectClass() {
    return null;
  }
  
 @Override
public void commit() throws ApplicationException, AuthorizationException, ValidationException {
    // TODO Auto-generated method stub
    
}
}
