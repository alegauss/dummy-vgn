package com.vignette.logging.context;

import java.io.IOException;

import org.apache.log4j.Logger;

public class ContextLogger extends Logger {

	protected ContextLogger(String name) {
		super(name);
	}
}
