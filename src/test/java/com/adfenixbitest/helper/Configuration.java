package com.adfenixbitest.helper;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Configuration {
	static WebDriver driver=null;
	//final static Logger logger = Logger.getLogger(Configuration.class);


	public static WebDriver initializeDriver(Browsers.Browser b) throws MalformedURLException{
		switch (b){
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver","resource/geckodriver");
			FirefoxOptions optionfireFox=new FirefoxOptions();
			optionfireFox.addArguments("--disable-extensions");
			optionfireFox.addArguments("--start-maximized");
			driver=new FirefoxDriver(optionfireFox);
			break;
		case CHROME: System.setProperty("webdriver.chrome.driver","resource/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			options.addArguments("disable-infobars");
			driver=new ChromeDriver(options);
		break;
		
		case EDGE: System.setProperty("webdriver.ie.driver",".\\selenium-ie-driver-2.0a5.jar");
			driver=new InternetExplorerDriver();
		break;
		case RemoteFirefox:
			driver=createDriver(Browsers.Browser.RemoteFirefox.toString());
			break;
		case RemoteChrome:
			driver=createDriver(Browsers.Browser.RemoteChrome.toString());
			break;
			
		default: throw new RuntimeException("Browser type unsupported");
			
		}
		return driver;
		
	}
	public static void lodPage(String url) throws Exception {
		driver.get(url);
		Thread.sleep(10000);
	}
	
	public static WebDriver createDriver(String browsername) throws MalformedURLException {
		URL server = new URL("http://127.0.0.1:4446/wd/hub");
		if(browsername.equals("RemoteFirefox")) {
			DesiredCapabilities cap=  DesiredCapabilities.firefox();
			cap.setVersion("");
			cap.setPlatform(Platform.LINUX);
			driver=new RemoteWebDriver(server,cap);
		}
		else if(browsername.equals("RemoteChrome")) {
			DesiredCapabilities cap=  DesiredCapabilities.chrome();
			cap.setVersion("");
			cap.setPlatform(Platform.LINUX);
			driver=new RemoteWebDriver(server,cap);
		}
	
		
		return driver;
		
	}
}
