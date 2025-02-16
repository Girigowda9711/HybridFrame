package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testbase.BaseClass;
import com.orangehrm.utils.ConfigReader;

public class LogoutTest extends BaseClass {

	@Test
	public void verfiyuserlogout() {
		LoginPage loginpage = new LoginPage();
		loginpage.enterusername(ConfigReader.getProperty("username"));
		loginpage.enterpassword(ConfigReader.getProperty("password"));
		loginpage.clickonLoginBtn();
		DashboardPage dashboardpage = new DashboardPage();
		Assert.assertTrue(dashboardpage.isdashboardDisplayed(), "dashboard page is displayed");
		dashboardpage.clicklogoutDropdown();
		dashboardpage.clickLogout();

	}

}
