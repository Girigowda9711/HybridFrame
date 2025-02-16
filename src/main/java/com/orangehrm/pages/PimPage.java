package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {
	
	WebDriver driver;
	public PimPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Add Employee']")
	WebElement addEmployee;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement addemployeeFirstname;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement addemployeeLastname;
	
	@FindBy(xpath="//label[contains(.,\"Employee Id\")]/parent::div/following-sibling::div//input")
	WebElement employeeID;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//h6[text()='Personal Details']")
	WebElement personalDetails;
	
	public void clickonAddemployee() {
		addEmployee.click();
	}
	
	public void enterEmployeefirstname(String efirstname) {
		addemployeeFirstname.sendKeys(efirstname);
	}
	
	public void enterEmployeelastname(String elastname) {
		addemployeeLastname.sendKeys(elastname);
	}
	
	public void enterEmployeeID(String eID) {
		employeeID.sendKeys(eID);
	}
	
	public void clickSavebutton() {
		saveBtn.click();
	}
	
	public boolean ispersonalDetailspageDisplayed() {
		return personalDetails.isDisplayed();
	}
	
	
	

}
