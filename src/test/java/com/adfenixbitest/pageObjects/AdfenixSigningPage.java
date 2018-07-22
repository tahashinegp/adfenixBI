package com.adfenixbitest.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.adfenixbitest.helper.BaseClass;

public class AdfenixSigningPage implements Element{
	WebElement element;
	//WebDriver driver;
	@FindBy(how=How.XPATH,xpath="//input[@id='input_0']")
	WebElement userName;
	@FindBy(how=How.XPATH, xpath="//input[@id='input_1']")
	WebElement password;
	@FindBy(how=How.XPATH,xpath="//button[@id='signin']")
	WebElement signInbutton;
	@FindBy(how=How.XPATH,xpath="//a[@href='#/signin']")
	WebElement signOutbutton;

	public AdfenixSigningPage() {}

	public void userName(String username, String usertype) {
		userName.sendKeys(username);
	}
	
	public void password(String userpass) {
		password.sendKeys(userpass);
	}

	public void clickSignIn() {
		signInbutton.click();
		
	}
	
	@Override
	public WebElement getElement() {
		return signOutbutton;
		}
	
	
}
