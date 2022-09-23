package com.flipkart.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/Features",
        glue= {"com.testing_flipkart.stepdefination"},
		plugin={"junit:target/JUnit/reports.xml","html:target/HTMLREPORTS"},
		//dryRun=false,
		tags="@Test2",
				
		monochrome = true
		)


public class Runner {

}

