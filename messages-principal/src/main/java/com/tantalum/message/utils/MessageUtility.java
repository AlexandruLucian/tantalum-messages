package com.tantalum.message.utils;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class MessageUtility {
	
	private static final Logger log = LoggerFactory.getLogger(MessageUtility.class);
	
	public static void printProperties(List<String> listProperties) {
		
        log.info("================");
        listProperties.forEach(property -> log.info("property=" + property));
        log.info("================");
    }
}
