package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement firstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement lastName;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement phoneNumber;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement passwordConfirm;
	@FindBy(xpath = "//input[@name='agree']")
	WebElement policyCheckbox;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continueBtn;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement successMessage;

	public void enterFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}

	public void enterLastName(String lastname) {
		lastName.sendKeys(lastname);

	}

	public void enterEmail(String Email) {
		email.sendKeys(Email);
	}

	public void enterPhoneNumber(String phonenumber) {
		phoneNumber.sendKeys(phonenumber);
	}

	public void enterpassword(String passWord) {
		password.sendKeys(passWord);
	}

	public void enterconfirmPassword(String passWord) {
		passwordConfirm.sendKeys(passWord);
	}

	public void clickOnCheckBox() {
		policyCheckbox.click();
	}

	public void clickOnContinueBtn() {
		continueBtn.click();
	}

	public String verifySuccessMessage() {
		 try {
			return successMessage.getText();
			
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
