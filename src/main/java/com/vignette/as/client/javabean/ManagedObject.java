package com.vignette.as.client.javabean;

import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.common.ref.ManagedObjectRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.common.ref.AsLocaleRef;
public class ManagedObject  {

	public static ContentInstance findByContentManagementId(ManagedObjectVCMRef managedObjectVCMRef) {
		// TODO Auto-generated method stub
		return null;
	}

	public static ManagedObjectVCMRef[] getReferringManagedObjects(Object contentManagementId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getName() throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	public static ContentInstance findById(ManagedObjectRef ref) throws ApplicationException, ValidationException {
		// TODO Auto-generated method stub
		return null;
	}

	public ManagedObjectVCMRef getContentManagementId() {
		// TODO Auto-generated method stub
		return null;
	}

	public static IPagingList findByContentManagementIds(ManagedObjectVCMRef[] managedObjectVCMRefs,
			RequestParameters params) {
		// TODO Auto-generated method stub
		return null;
	}

	public ObjectType getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	public AsLocaleRef getLocale() {
		return null;
	}

}
