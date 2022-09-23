package com.testing_flipkart.stepdefination;

import java.awt.AWTException;
import com.flipkart.pageobject.Robot_page;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class Robot_Class extends PageObject {
	@Steps
    Robot_page r;
	
	@When("User clicks on Signin btn.")
	public void user_clicks_on_signin_btn() throws InterruptedException  {
		
		getDriver().manage().window().maximize();
		getDriver().navigate().to("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043916!p!!g!!flipkart%20login&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=EAIaIQobChMI0vDujOyL-QIVUTErCh1ubAsFEAAYASAAEgKGF_D_BwE");
		waitABit(1000);
	}
	@When("User gives his login credentials.")
	public void user_gives_his_login_credentials() throws AWTException, InterruptedException {
	   	r.keyrobo();
	}
	@Then("Clicks on login btn.")
	public void clicks_on_login_btn() {
	   System.out.println("User is logged in");
	}

	@Then("Goes to my profile and edit the details.")
	public void goes_to_my_profile_and_edit_the_details() throws AWTException, InterruptedException {
	 r.mouserobo();
	 System.out.println("User is able to click on myprofile");
	}

}
