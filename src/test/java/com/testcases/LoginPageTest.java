package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pageclasses.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

	}

	@Test
	public void loginpageTest() {
		LoginPage l=new LoginPage(driver);
		l.enterEmail("girigowda@gmail.com");
		l.enterpassword("skljsd");
		l.clickOnBtn();
		Assert.assertEquals(l.alertWarning(),"Warning: No match for E-Mail Address and/or Password.");

	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
