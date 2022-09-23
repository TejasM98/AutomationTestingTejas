package com.testing_flipkart.stepdefination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.flipkart.pageobject.Scrollpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class Scrolling_to_item extends PageObject{
	@Managed()
	WebDriver driver;
	@Steps
	Scrollpage s;
	@When("User searches an item.")
	public void user_searches_an_item() {
	   s.search1();
	   waitABit(5000);
	}
	@When("Scroll to the particular item.")
	public void scroll_to_the_particular_item() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)","");
		getImplicitWaitTimeout().getSeconds();
	}
	@Then("Clicks on the item.")
	public void clicks_on_the_item() {
	    s.item();
	    waitABit(2000);
	    String actualTitle=s.check();
	    String expectedTitle="Hindi";
	    Assert.assertEquals(actualTitle,expectedTitle);
	    System.out.println("The filtered title is : "+actualTitle);
	    
	}


}

