package com.vignette.as.client.common.ref;

import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.ManagedObject;
import java.rmi.RemoteException;

public interface IManagedObjectRef {
  ManagedObject retrieveManagedObject() throws ApplicationException, RemoteException;
  
  ManagedObject retrieveManagedObject(RequestParameters paramRequestParameters) throws ApplicationException, ValidationException, RemoteException;
}
