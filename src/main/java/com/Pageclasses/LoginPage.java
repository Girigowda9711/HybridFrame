package com.Pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	By email = By.xpath("//input[@id='input-email']");
	By password = By.id("input-password");
	By Login_Btn = By.xpath("//input[@value='Login']");
	By Alert_warning = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

	public void enterEmail(String mail) {
		driver.findElement(email).sendKeys(mail);
	}

	public void enterpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void clickOnBtn() {
		driver.findElement(Login_Btn).click();

	}

	public String alertWarning() {
		return driver.findElement(Alert_warning).getText();
	}
}
