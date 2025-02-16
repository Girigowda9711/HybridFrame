package com.orangehrm.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.PimPage;
import com.orangehrm.testbase.BaseClass;
import com.orangehrm.utils.CommonUtils;
import com.orangehrm.utils.ConfigReader;

public class AddEmployeeTest extends BaseClass{
	private static final Logger logger = LogManager.getLogger(AddEmployeeTest.class);
	
	@Test
	public void verifyEmployeeAdded() {
		logger.info("test started ...");
		LoginPage loginpage = new LoginPage();
		loginpage.enterusername(ConfigReader.getProperty("username"));
		loginpage.enterpassword(ConfigReader.getProperty("password"));
		loginpage.clickonLoginBtn();
		DashboardPage dashboardpage = new DashboardPage();
		dashboardpage.clickPIM();
		logger.info("pim page is opened...");
		PimPage pimpage=new PimPage();
		pimpage.clickonAddemployee();
		CommonUtils u=new CommonUtils();
		pimpage.enterEmployeefirstname(u.getRandomString());
		pimpage.enterEmployeelastname(u.getRandomString());
		pimpage.enterEmployeeID(u.getRandomNum());
		pimpage.clickSavebutton();
		logger.info("clicked on save button");
		boolean personalDetails = pimpage.ispersonalDetailspageDisplayed();
		Assert.assertTrue(personalDetails);
		
		
	}

}
