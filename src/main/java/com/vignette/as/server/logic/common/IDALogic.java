package com.vignette.as.server.logic.common;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.sdo.InheritanceLevelType;
import com.vignette.authz.client.AccessControlList;

public interface IDALogic {
  AccessControlList getDefaultAcl() throws ApplicationException, AuthorizationException, ValidationException;
  
  void inheritParentAuthorizedGroups() throws ApplicationException, AuthorizationException, ValidationException;
  
  void propagateAuthorizedGroups(InheritanceLevelType paramInheritanceLevelType) throws ApplicationException, AuthorizationException, ValidationException;
}
