package com.testing_flipkart.stepdefination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.flipkart.pageobject.Homepage;
import com.flipkart.pageobject.Tab_switch;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class Dropdown_Itemlist extends PageObject{
	@Steps
	Homepage h;
	Tab_switch ts;
	
	@When("User is searching an item.")
	public void user_is_searching_an_item() {
	    h.Search("Boots for men");
	    h.Searchbtn();
	    waitABit(4000);
	    
	}
	@When("selecting the appropriate filter value from the dropdown.")
	public void selecting_the_appropriate_filter_value_from_the_dropdown() {
	   Select minpricelist = new Select(ts.minprice);
	   Select maxpricelist = new Select(ts.maxprice);
	   minpricelist.selectByValue("2000");
	   waitABit(4000);
	   maxpricelist.selectByValue("4000");
	   waitABit(4000);
	}
	@Then("Filtered item list is displayed.")
	public void filtered_item_list_is_displayed() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,400)","");
		waitABit(4000);
		ts.shoe();
		waitABit(4000);
		ts.checkbox();
	}



}
