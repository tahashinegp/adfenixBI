package com.adfenixbitest.testclasses;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.adfenixbitest.pageObjects.Element;

public class TestNverification{
	WebElement element;
	//final static Logger logger=null;
	//private Class<T> clazz;
	boolean getElement;

	     
	public void checkElementDisplayed(Object clazz){
		getElement = false;
		try {
		Element e1=(Element) clazz;
		element=e1.getElement();
		if(element.isDisplayed()) {
			getElement=true;
			System.out.println("Element is displayed");
			}
		}
		catch(Exception e) {
			System.out.println("Element is not displayed");
		}
	}


}
