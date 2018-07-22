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
Feature: BI Dashboard bottom table
 	@Scenario1
	Scenario Outline: Verify BI Dashbaord bottom table breadcrumb
	Given User logged in successfully 
	And User will see table in bottom
	Then User will see PO name and all <column headers>
	Examples:
	|column headers|
	
