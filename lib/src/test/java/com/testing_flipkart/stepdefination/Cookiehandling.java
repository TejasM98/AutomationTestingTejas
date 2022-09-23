package com.testing_flipkart.stepdefination;

import com.flipkart.pageobject.Cookie_page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class Cookiehandling  extends PageObject{
	@Steps
	Cookie_page cp;
	
	@Given("User is on homepage of filpkart.")
	public void user_is_on_homepage_of_filpkart() {
	   getDriver().navigate().to("https://www.flipkart.com/");
	   getDriver().manage().window().maximize();
	   cp.email1();
	   cp.pass1();
	   waitABit(3000);
	   cp.loginbtn1();
	   waitABit(3000);
	}
	@When("User captures all the cookies.")
	public void user_captures_all_the_cookies() {
	  cp.captureC();
	}
	@When("User add and then delete the cookies.")
	public void user_add_and_then_delete_the_cookies() {
	    cp.AddC_DeleteC();
	}
	@Then("User prints the remaining cookies.")
	public void user_prints_the_remaining_cookies() {
	    cp.DeleteAllC();
	}
}
