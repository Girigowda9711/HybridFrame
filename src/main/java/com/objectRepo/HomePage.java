package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='My Account']")
	WebElement MyAccount_Link;

	@FindBy(xpath = "//a[text()='Register']")
	WebElement Register_Link;

	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
	WebElement Login_Link;

	public void clickOnMyAccount() {
		MyAccount_Link.click();
	}

	public void ClickOnRegister() {
		Register_Link.click();
	}

	public void clickOnLogin() {
		Login_Link.click();
	}

}
