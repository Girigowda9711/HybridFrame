package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.PimPage;
import com.orangehrm.testbase.BaseClass;
import com.orangehrm.utils.CommonUtils;
import com.orangehrm.utils.ConfigReader;

public class AddEmployeeTest extends BaseClass{
	@Test
	public void verifyEmployeeAdded() {
		LoginPage loginpage = new LoginPage();
		loginpage.enterusername(ConfigReader.getProperty("username"));
		loginpage.enterpassword(ConfigReader.getProperty("password"));
		loginpage.clickonLoginBtn();
		DashboardPage dashboardpage = new DashboardPage();
		dashboardpage.clickPIM();
		PimPage pimpage=new PimPage();
		pimpage.clickonAddemployee();
		CommonUtils u=new CommonUtils();
		pimpage.enterEmployeefirstname(u.getRandomString());
		pimpage.enterEmployeelastname(u.getRandomString());
		pimpage.enterEmployeeID(u.getRandomNum());
		pimpage.clickSavebutton();
		boolean personalDetails = pimpage.ispersonalDetailspageDisplayed();
		Assert.assertTrue(personalDetails);
		
		
	}

}
