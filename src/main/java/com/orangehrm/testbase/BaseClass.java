package com.orangehrm.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.CommonUtils;
import com.orangehrm.utils.ConfigReader;

public class BaseClass {
	
	protected WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(ConfigReader.getProperty("url"));
		
	}
	
	@AfterMethod
	public void tearDown(){
		if(driver!=null) {
			driver.quit();
		}
		
	}

}
