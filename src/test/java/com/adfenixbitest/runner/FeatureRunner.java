package com.adfenixbitest.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/fetaure",
		glue="com.adfenixbitest.stepdefinitions",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {}
		)
public class FeatureRunner{

}

