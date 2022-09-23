package com.testing_flipkart.stepdefination;

import com.flipkart.pageobject.Alert_page;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class Alert_handling extends PageObject {
	@Steps
	Alert_page ap;
	@When("User clicks on Alert.")
	public void user_clicks_on_alert() {
		getDriver().manage().window().maximize();
	   getDriver().navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
	}
	@Then("Handles Alerts using various methods.")
	public void handles_alerts_using_various_methods() {
	    ap.Alert_handling();
	    getDriver().close();
	}


}
