package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	 WebDriver driver;
		public DashboardPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//h6[contains(.,Dashboard)]")
		WebElement  dashboardHeader;
		
		@FindBy(xpath="//span[@class='oxd-userdropdown-tab']/child::p")
		WebElement logoutDropdown;
		
		@FindBy(xpath="//a[text()='Logout']")
		WebElement logoutLink;
		
		@FindBy(xpath="//span[text()='PIM']")
		WebElement PimLink;
		
		public boolean isdashboardDisplayed() {
			return dashboardHeader.isDisplayed();
		}
		
		public void clicklogoutDropdown() {
			logoutDropdown.click();
		}
		
		public void clickLogout() {
			logoutLink.click();
		}
		
		
		
		

}
