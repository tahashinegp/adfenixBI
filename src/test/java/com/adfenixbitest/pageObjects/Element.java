package com.adfenixbitest.pageObjects;

import org.openqa.selenium.WebElement;

public interface Element {
	default WebElement getElement() {
		return null;
		}

}
