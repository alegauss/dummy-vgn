package com.vignette.as.client.javabean;

import com.vignette.as.client.common.ref.ChannelRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;

public interface IChannelAssociate extends IPersistable {
  void addChannelAssociation(ChannelRef paramChannelRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  void addChannelAssociations(ChannelRef[] paramArrayOfChannelRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  void removeChannelAssociation(ChannelRef paramChannelRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  void removeChannelAssociations(ChannelRef[] paramArrayOfChannelRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  void clearChannelAssociations() throws ApplicationException, AuthorizationException, ValidationException;
  
  ChannelRef[] getChannelAssociations() throws ApplicationException, AuthorizationException, ValidationException;
  
  void setChannelAssociations(ChannelRef[] paramArrayOfChannelRef) throws ApplicationException, AuthorizationException, ValidationException;
  
  boolean hasChannelAssociation(ChannelRef paramChannelRef) throws ApplicationException, AuthorizationException, ValidationException;
}
