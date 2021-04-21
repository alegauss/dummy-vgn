package com.vignette.as.client.javabean;

import java.rmi.RemoteException;
import java.util.List;

import com.vignette.as.client.common.ref.SiteRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.ValidationException;

public class Channel extends ManagedObject {

	public Channel()  throws ApplicationException, ValidationException, RemoteException {
		super();
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getBreadcrumbNamePath(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

	public Channel[] getBreadcrumbPath(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<SiteRef> getSiteRefs() throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFurlName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
