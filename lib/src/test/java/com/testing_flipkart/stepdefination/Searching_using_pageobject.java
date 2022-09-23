package com.testing_flipkart.stepdefination;

import com.flipkart.pageobject.Searching_Pageobject;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class Searching_using_pageobject extends PageObject {
	@Steps
	Searching_Pageobject sp;
	@When("user searches the {string}.")
	public void user_searches_the(String string) {
	  sp.searching(string);
	}
	@Then("the search result is displayed.")
	public void the_search_result_is_displayed() {
	   System.out.println("The search result is displayed");
	}

}
