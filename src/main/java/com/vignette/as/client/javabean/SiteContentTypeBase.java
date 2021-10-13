package com.vignette.as.client.javabean;

import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.server.logic.common.IDALogic;
import java.io.Serializable;

public abstract class SiteContentTypeBase extends ExtensibleApplicationObject implements Serializable {
  public SiteContentTypeBase() {
   super(null);
  }
  
  public static SiteContentType newInstance() throws ApplicationException {
    return null;
  }
  
  IDALogic getDALogic() {
    return null;
  }
  
  public ManagedObjectRef getManagedObjectRef() throws ApplicationException {
    return null;
  }
}
