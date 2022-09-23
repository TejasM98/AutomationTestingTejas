package com.testing_flipkart.stepdefination;

import com.flipkart.pageobject.Window_page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class Window_Handling extends PageObject{
	@Steps
	Window_page wp;
	@Given("User is on login page.")
	public void user_is_on_login_page() {
	   getDriver().manage().window().maximize();
	   getDriver().get("https://www.flipkart.com/account/login?ret=/account/login%3Fret%3D%2Faccount%2Flogin%253Fret%253D%252Faccount%252Flogin%25253Fret%25253D%25252Faccount%25252Flogin%2525253Fret%2525253D%2525252Faccount%2525252Flogin%252525253Fret%252525253D%252525252Faccount%252525252Flogin%25252525253Fret%25252525253D%25252525252F");
	}
	@When("User clicks on Terms and Conditions.")
	public void user_clicks_on_terms_and_conditions() {	
	   wp.Termncond();
	   waitABit(4000);
	}
	@When("Get the title of both the windows and IDs.")
	public void get_the_title_of_both_the_windows_and_i_ds() {
	   wp.window();
	   
	}
	@Then("Goes back to parent window.")
	public void goes_back_to_parent_window() {
		 waitABit(2000);
	   wp.swtich_window();
	   waitABit(3000);
	   
	}

}
