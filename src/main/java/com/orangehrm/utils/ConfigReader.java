package com.orangehrm.utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	 private static Properties prop;
	 private static final Logger logger = LogManager.getLogger(ConfigReader.class);

	    static {
	        try {
	        	logger.info("Loading config.properties file...");
	            FileInputStream file = new FileInputStream("./src/test/resources/config.properties");
	            prop = new Properties();
	            prop.load(file);
	            logger.info("Configuration file loaded successfully.");
	        } catch (IOException e) {
	        	 logger.error("Error loading configuration file: " + e.getMessage());
	        }
	    }

	    public static String getProperty(String key) {
	        return prop.getProperty(key);
	    }

}
