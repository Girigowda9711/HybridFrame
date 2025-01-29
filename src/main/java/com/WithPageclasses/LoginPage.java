package com.WithPageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement email;

	@FindBy(id = "input-password")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement Login_Btn;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement errorMessage;

	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickOnBtn() {
		Login_Btn.click();
	}

	public String verifyErrorMessage() {
		return errorMessage.getText();
	}

}
