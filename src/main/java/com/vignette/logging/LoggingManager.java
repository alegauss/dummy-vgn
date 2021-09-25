package com.vignette.logging;

import com.vignette.logging.context.ContextLogger;
import org.apache.log4j.Logger;

public class LoggingManager extends Logger  {

	protected LoggingManager(String name) {
		super(name);
	}
	public static ContextLogger getLogger(Class clazz) {
		return null;
	}
	public static ContextLogger getContextLogger(Class<?> class1) {
		return null;
	}

}
