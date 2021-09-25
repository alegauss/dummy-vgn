package com.vignette.as.client.common;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.javabean.ManagedObject;
import java.util.Date;

public interface IPublishEligibilities {
  boolean isStatusApproved(ManagedObject paramManagedObject, String paramString) throws ApplicationException;
  
  boolean hasStatusChanged(ManagedObject paramManagedObject, String paramString) throws ApplicationException;
  
  Date getPublishDate(ManagedObject paramManagedObject, String paramString) throws ApplicationException;
  
  boolean hasPublishDateChanged(ManagedObject paramManagedObject, String paramString) throws ApplicationException;
  
  Date getUnpublishDate(ManagedObject paramManagedObject, String paramString) throws ApplicationException;
  
  boolean hasUnpublishDateChanged(ManagedObject paramManagedObject, String paramString) throws ApplicationException;
}
