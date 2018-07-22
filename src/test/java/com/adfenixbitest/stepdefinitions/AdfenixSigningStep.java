package com.adfenixbitest.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;

import com.adfenixbitest.helper.BaseClass;
import com.adfenixbitest.pageObjects.AdfenixSigningPage;
import com.adfenixbitest.testclasses.TestNverification;

import cucumber.api.java.en.And;

public class AdfenixSigningStep {
	static WebDriver driver;
	AdfenixSigningPage adfenixSignin;
	TestNverification signinverification;
	String url;
	//final static Logger logger=null;
	List<List<String>>  credentialList=new ArrayList();
  @Given("^User is on Home Page$")
  public void openAdfenix(){
	  try {
		  BaseClass.open();
		  //driver=BaseClass.getDriver();
		  adfenixSignin = BaseClass.getPageinstace(AdfenixSigningPage.class);
		  signinverification=new TestNverification();
	  }
	  catch(Exception e ) {
		  System.out.println(e);
	  }
  }


  @And("^User enter username (.*) and password (.*)$")
  public void enterUsercred(String username,String userpassword){
	  try {
		  adfenixSignin.userName(username, "");
		  adfenixSignin.password(userpassword);
	  }
	  catch(Throwable t) {
		  System.out.println(t);
	  }
 
  }
  @And("^User Click Login button$")
  public void pressLogin(){
	  try {
		  adfenixSignin.clickSignIn();
		  Thread.sleep(15000);
	  }
	  catch(Throwable t) {
		  System.out.println(t);
	  }
 
  }
  @Then("^User will see BI Dashboard with Bottom Table and Statsics Data$")
	 public void afterSingIN() {
	  try {
		signinverification.checkElementDisplayed(adfenixSignin);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
  @Given("^User is in BI Dashboard$")
  public void BIdashboard() {
	  try {
			signinverification.checkElementDisplayed(adfenixSignin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("User should log in first");
		}
  }
  @And("^User will see table in bottom$")
  public void BIdashboardTable() {
	  
	  System.out.println("This is BI Dashboard table");
  }
  
  @Then("^User wil see PO Name in bottom table$")
  public void BIdashboardPoname() {
	  
	  System.out.println("BI Dahboard table PO name");
  }

}

