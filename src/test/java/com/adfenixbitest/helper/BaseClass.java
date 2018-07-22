package com.adfenixbitest.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;

public class BaseClass {
	public static WebDriver driver;
	WebElement element;
	Configuration config;
	public static String url;
	//final static Logger logger=null;
	public  static void open() throws MalformedURLException {
		driver=Configuration.initializeDriver(Browsers.Browser.RemoteFirefox);
		//driver.manage().deleteAllCookies();
    	//driver.manage().window().maximize();
		try {
		FileInputStream reader;
			reader = new FileInputStream("resource/testdata.properties");
			Properties prop = new Properties();
			prop.load(reader);
			url=prop.getProperty("localurl");
			Configuration.lodPage(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 //Logger.getLogger(e.toString());
			System.out.println(e);
		}
		
	}
	
	public static WebDriver getDriver() {
		
		return driver;
	}
	
	public static String getUrl() {
		return url;
	}
	
	public void waitforelements() {
		
	}
	public static <TPage> TPage getPageinstace(Class<TPage> pageObj) {
		return PageFactory.initElements(driver, pageObj);
	}

}
