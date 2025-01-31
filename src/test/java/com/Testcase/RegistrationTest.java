package com.Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Javalibrary.JavaUtility;
import com.TestBase.BaseClass;
import com.objectRepo.HomePage;
import com.objectRepo.RegistrationPage;

public class RegistrationTest extends BaseClass {
	

	@Test
	public void verifyRegistration() {
		logs.info("Creating homepage object");
	HomePage	h=new HomePage(driver);
	h.clickOnMyAccount();
	h.ClickOnRegister();
	RegistrationPage rg=new RegistrationPage(driver);
	rg.enterFirstName(JavaUtility.getRandomAlphabet().toUpperCase());
	rg.enterLastName(JavaUtility.getRandomAlphabet().toUpperCase());
	rg.enterEmail(JavaUtility.getRandomAlphabet()+"@gmail.com");
	rg.enterPhoneNumber(JavaUtility.getRandomNumber());
	String genricpassword = JavaUtility.getRandomAlphaNumeric();
	rg.enterpassword(genricpassword);
	rg.enterconfirmPassword(genricpassword);
	logs.info("click on check box");
	rg.clickOnCheckBox();
	rg.clickOnContinueBtn();
	
	String successMessage = rg.verifySuccessMessage();
	if(successMessage.equalsIgnoreCase("Your Account Has Been Created")) {
		Assert.assertTrue(true);
	}else {
		System.out.println("Account not registered");
		Assert.fail();
	}
	

	}

	
	
	
}
