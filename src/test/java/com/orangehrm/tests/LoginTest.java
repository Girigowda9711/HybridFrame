package com.orangehrm.tests;

import org.testng.annotations.Test;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.testbase.BaseClass;
import com.orangehrm.utils.ConfigReader;

public class LoginTest extends BaseClass{
	
	@Test
	public void verifyUserwithValidCredentials() throws InterruptedException  {
		LoginPage loginpage=new LoginPage();
		 loginpage.enterusername(ConfigReader.getProperty("username"));
		 Thread.sleep(10000);
		 loginpage.enterpassword(ConfigReader.getProperty("password"));
		 loginpage.clickonLoginBtn();
		}
	
	
	
	
	
	

}
