package com.Javalibrary;

import org.apache.commons.lang3.RandomStringUtils;

public class JavaUtility {
	public static String getRandomAlphabet() {
		return RandomStringUtils.randomAlphabetic(6);
		
	}
	
	public static String getRandomNumber() {
	return	RandomStringUtils.randomNumeric(10);
	}
	
	public static String getRandomAlphaNumeric() {
		String StringAlpha = RandomStringUtils.randomAlphabetic(4);
		String StringNum = RandomStringUtils.randomNumeric(3);
		return(StringAlpha+StringNum+"@");
	}

}
