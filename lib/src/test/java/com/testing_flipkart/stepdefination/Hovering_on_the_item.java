package com.testing_flipkart.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.flipkart.pageobject.Tab_switch;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
public class Hovering_on_the_item extends PageObject {
	@Managed
	WebDriver driver;
	@Steps
	Tab_switch ts;
	@When("User clicks on MyAccount.")
	public void user_clicks_on_my_account() {
		waitABit(4000);
	    Actions action =new Actions(driver);
	    WebElement account= ts.myaccount; 
	    action.moveToElement(account).perform();
	    WebElement wishlist=ts.wishlist; 
	    action.moveToElement(wishlist).click().perform();
	    waitABit(4000);
	    WebElement mobile =ts.mobile;
	    action.doubleClick(mobile).perform();
	}
	@When("Clicks on the wishlist.")
	public void clicks_on_the_wishlist() {
	   System.out.println("Wishlist is clicked");
	}
	@Then("Items on the wishlist are displayed.")
	public void items_on_the_wishlist_are_displayed() {
	    System.out.println("Wishlist items are displayed");
	    driver.quit();
	}
}
//a[@class='_6WOcW9 _2-k99T']