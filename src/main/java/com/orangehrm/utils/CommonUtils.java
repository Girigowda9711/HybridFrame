package com.orangehrm.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class CommonUtils {
	
	public String getRandomString() {
		return RandomStringUtils.randomAlphabetic(6);
	}
	
	public String getRandomNum() {
		return RandomStringUtils.randomNumeric(4);
	}

}
