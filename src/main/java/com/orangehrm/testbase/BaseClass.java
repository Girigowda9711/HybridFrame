package com.orangehrm.testbase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.utils.ConfigReader;
import com.orangehrm.utils.DriverFactory;

public class BaseClass {

	 private static final Logger logger = LogManager.getLogger(BaseClass.class);

	@BeforeMethod
	public void setUp() {
		logger.info("Starting test setup...");
		String browser = ConfigReader.getProperty("browser");
		String url = ConfigReader.getProperty("url");
		DriverFactory.initializeDriver(browser);
		DriverFactory.getDriver().get(url);
		logger.info("Navigated to URL: " + url);

	}

	@AfterMethod
	public void tearDown() {
		logger.info("Closing browser and ending test");
		DriverFactory.quitDriver();

	}
}
