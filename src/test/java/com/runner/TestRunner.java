package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Regression\\AdactinHomePage.feature",
glue = "com.stepdef", monochrome = true, dryRun = false, tags = {
		"~@TC02" },plugin={"pretty","junit:target/Reports/data.xml","json:target/Reports/data.json"},
				strict=true,snippets=SnippetType.CAMELCASE)
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		JvmReport.genrateJVMReport(System.getProperty("user.dir")+"\\target\\Reports\\data.json");
	}
}
