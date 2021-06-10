package com.bdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Karen Amy\\eclipse-workspace\\AprilMavenProject\\src\\test\\java\\com\\bdd\\featurefile",
					glue = "com.bdd.stepdefinition",
					plugin = {"pretty","html:test-Report"},
					tags= {"@Regression","@Smoke"}
					/*monochrome= true,
					dryRun = true*/
					
				)
public class TestRunner {

}
