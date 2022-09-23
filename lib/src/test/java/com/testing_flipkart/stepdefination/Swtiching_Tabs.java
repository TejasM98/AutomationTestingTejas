package com.testing_flipkart.stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.flipkart.pageobject.Tab_switch;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Swtiching_Tabs extends PageObject {
	@Managed()
	WebDriver driver;
	@Steps
	Tab_switch ts;
	@When("User clicks on cart.")
	public void user_clicks_on_cart() {
		ts.kart();
	  
	}
	@When("User switches between flipkart and grocery tab.")
	public void user_switches_between_flipkart_and_grocery_tab() {
		
	  //driver.findElement(By.xpath("//*[@class='_2FYYw1']")).click();
	  getDriver().navigate().back();
	  waitABit(4000);
	  getDriver().navigate().forward();
	  waitABit(4000);
	  getDriver().navigate().back();
	  waitABit(4000);
	  getDriver().navigate().back();
	}
	@Then("Comes back to homepage.")
	public void comes_back_to_homepage() {
		//waitABit(4000);
		//driver.navigate().back();
		waitABit(4000);
		String atitle=driver.getTitle();
		String extitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		 Assert.assertEquals(atitle,extitle);
		    System.out.println("The title of HomePage is : "+atitle);
	}


}
