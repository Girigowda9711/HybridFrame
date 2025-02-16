package com.orangehrm.utils;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class DriverFactory {
	private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
	private static final Logger logger = LogManager.getLogger(DriverFactory.class);

	public static WebDriver getDriver() {
        return driverThreadLocal.get();
    }
	
	public static void initializeDriver(String browser) {
		
		WebDriver driver=null;
		logger.info("Initializing WebDriver for browser: " + browser);
		
		switch (browser) {
		case "chrome":
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--incognito");
			driver=new ChromeDriver(options);
			break;
			
		case "firefox":
			FirefoxOptions foptions=new FirefoxOptions();
			foptions.addArguments("-private");
			driver=new FirefoxDriver(foptions);
			break;
			
		case "ie":
			InternetExplorerOptions eoptions=new InternetExplorerOptions();
			eoptions.addCommandSwitches("-private");
			driver=new InternetExplorerDriver();
		default:
			throw new IllegalArgumentException("Invalid browser: " + browser);
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driverThreadLocal.set(driver);
        logger.info(browser + " WebDriver initialized successfully.");
		
		
		
		
		
		
		
		
		
	}
	public static void quitDriver() {
        if (getDriver() != null) {
            getDriver().quit();
            driverThreadLocal.remove();
        }
    }

}
