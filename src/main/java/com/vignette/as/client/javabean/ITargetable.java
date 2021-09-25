package com.vignette.as.client.javabean;

import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import java.util.Set;

public interface ITargetable {
  boolean isTargetable() throws AuthorizationException, ValidationException, ApplicationException;
  
  Set<ManagedObjectVCMRef> getReferredSegments() throws AuthorizationException, ValidationException, ApplicationException;
}
