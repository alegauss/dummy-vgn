package com.vignette.cms.client.common;

import java.rmi.RemoteException;

public interface ICMSObjectTypeListProvider {
  CMSObjectType[] getObjectTypes(boolean paramBoolean) throws CMSException, RemoteException;
}
