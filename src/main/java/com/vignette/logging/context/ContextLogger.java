package com.vignette.logging.context;

import java.io.IOException;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.config.client.common.ConfigException;
import com.vignette.util.MsgObject;

public class ContextLogger {

	public void info(String string) {
		// TODO Auto-generated method stub
		
	}

	public void error(IOException e) {
		// TODO Auto-generated method stub
		
	}

	public boolean isDebugEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public void debug(String string, ConfigException exception) {
		// TODO Auto-generated method stub
		
	}

	public void error(String string, Exception e) {
		// TODO Auto-generated method stub
		
	}

	public void error(Exception e) {
		// TODO Auto-generated method stub
		
	}

	public static ContextLogger getLogger(Object class1) {
		// TODO Auto-generated method stub
		return null;
	}

	public void debug(String string) {
		// TODO Auto-generated method stub
		
	}

	public void error(Object string) {
		// TODO Auto-generated method stub
		
	}

	public void error(String format, ApplicationException e) {
		// TODO Auto-generated method stub
		
	}

	public boolean isErrorEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public void error(MsgObject msg, ConfigException e) {
		// TODO Auto-generated method stub
		
	}

	public void error(Exception e, Exception e2) {
		// TODO Auto-generated method stub
		
	}

}
