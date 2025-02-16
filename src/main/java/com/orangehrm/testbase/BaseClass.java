package com.orangehrm.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.utils.ConfigReader;
import com.orangehrm.utils.DriverFactory;

public class BaseClass {

	

	@BeforeMethod
	public void setUp() {
		String browser = ConfigReader.getProperty("browser");
		String url = ConfigReader.getProperty("url");
		DriverFactory.initializeDriver(browser);
		DriverFactory.getDriver().get(url);

	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.quitDriver();

	}
}
