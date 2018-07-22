#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login for BI Dashboard only by PO user
 	@Scenario1
	Scenario Outline: Successful Login with Valid PO Credentials
	Given User is on Home Page
	And User enter username <User_Id> and password <pass>
	And User Click Login button
	Then User will see BI Dashboard with Bottom Table and Statsics Data
	Examples:
    |        User_Id 						 |  pass 		 |
    | krogsveenTest@adfenix.com  |  test99   |

 # @Scenario2
	#Scenario Outline: Successful Login with Valid PO, Seller and Agent Credentials
	#Given User is on Home Page
	#And User enter username and password
	#Then User will see BI Dashboard with Bottom Table and Statsics Data
	#Examples:
   # |             User Id        |   left    |
    #| krogsveenTest@adfenix.com  |  test99   |
    #| krogsveenTest@adfenix.com  |  test99   |
    #| krogsveenTest@adfenix.com  |  test99   |
    @Scenario3
   	Scenario: Verify BI Dashbaord bottom table breadcrumb
	Given User is in BI Dashboard
	And User will see table in bottom
	Then User wil see PO Name in bottom table

	
	
	
	