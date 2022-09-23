package com.testing_flipkart.stepdefination;

import com.flipkart.pageobject.Radiobutton_page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class Radiobutton extends PageObject {
	
	@Steps
	Radiobutton_page r;
	
	@Given("User is on Guru99 website")
	public void user_is_on_guru99_website() {
		 getDriver().navigate().to("https://demo.guru99.com/V4/");
	     System.out.println("User is on Guru99 Website");
	}
	@When("User clicks on Selenium Dropdown")
	public void user_clicks_on_selenium_dropdown() {
		r.SeleniumDropdown();
	}
	@When("selects the Radio button option")
	public void selects_the_radio_button_option() throws InterruptedException {
		r.RadioButton();
	}
	@When("User clicks on any radio button")
	public void user_clicks_on_any_radio_button() {
	  r.radio2();
	}
	@Then("The Radio_button is Selected")
	public void the_radio_button_is_selected() {
	  r.check();
	}



}
