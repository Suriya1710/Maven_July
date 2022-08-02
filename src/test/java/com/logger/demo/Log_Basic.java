package com.logger.demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log_Basic {

	// Factory Design Pattern

	public static Logger log = Logger.getLogger(Log_Basic.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();
		
		log.debug("DEBUG");

		log.info("Information");

		log.warn("Warning");

		log.error("Error");

		log.fatal("fatal");

	}

}
