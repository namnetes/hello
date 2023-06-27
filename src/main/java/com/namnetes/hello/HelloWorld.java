package com.namnetes.hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;	


public class HelloWorld {

	private static final Logger logger = LogManager.getLogger(HelloWorld.class);
	
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		logger.trace("We've just greeted the user!");
		logger.debug("We've just greeted the user!");
		logger.info("We've just greeted the user!");
		logger.warn("We've just greeted the user!");
		logger.error("We've just greeted the user!");
		logger.fatal("We've just greeted the user!");
	}

}
