package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginButton;
	
	public void enterusername(String uname) {
		username.sendKeys(uname);
	}
	
	public void enterpassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickonLoginBtn() {
		loginButton.click();
	}

		
	
	

}
