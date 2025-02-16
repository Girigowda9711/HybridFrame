package com.orangehrm.tests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.testbase.BaseClass;
import com.orangehrm.utils.ConfigReader;

public class LoginTest extends BaseClass{
	 private static final Logger logger = LogManager.getLogger(LoginTest.class);
	
	@Test
	public void verifyUserwithValidCredentials() throws InterruptedException  {
		 logger.info("Starting Login Test...");

		LoginPage loginpage=new LoginPage();
		 loginpage.enterusername(ConfigReader.getProperty("username"));
		 Thread.sleep(10000);
		 loginpage.enterpassword(ConfigReader.getProperty("password"));
		 loginpage.clickonLoginBtn();
		 logger.info("Login Test Passed.");
		}
	
	
	
	
	
	

}
