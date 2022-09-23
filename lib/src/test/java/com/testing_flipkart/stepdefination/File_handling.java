package com.testing_flipkart.stepdefination;

import java.awt.AWTException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.pageobject.File_page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class File_handling extends PageObject {
	@Steps
	File_page fp;
	@Given("User is on Homepage of Monster.com")
	public void user_is_on_homepage_of_monster_com() {
	   getDriver().get("https://www.monsterindia.com/");
	   getDriver().manage().window().maximize();
	}
	@When("User clicks on upload resume popup opens.")
	public void user_clicks_on_upload_resume_popup_opens() throws AWTException {
		fp.upres();
		fp.upfileS();
		waitABit(3000);
		fp.closebox();
		waitABit(3000);
		fp.upres();
		fp.robotfile();
		waitABit(3000);
		
	   
	}
	@Then("User uploads his\\/her resume.")
	public void user_uploads_his_her_resume() {
	    System.out.println("File is uploaded");
	}
}
