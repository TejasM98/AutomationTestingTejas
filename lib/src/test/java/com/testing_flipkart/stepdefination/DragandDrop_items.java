package com.testing_flipkart.stepdefination;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.pageobject.DragandDrop_page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class DragandDrop_items extends PageObject {
	@Steps
	DragandDrop_page ddp;
	
	@Given("User is on Guru99 Homepage.")
	public void user_is_on_guru99_homepage() {
	    getDriver().navigate().to("https://demo.guru99.com/V4/");
	    getDriver().manage().window().maximize();
	}
	@When("User clicks on Selenium dropdown and selects the drag and drop tab.")
	public void user_clicks_on_selenium_dropdown_and_selects_the_drag_and_drop_tab() {
	   ddp.dropdown();
	   waitABit(3000);
	}
	@When("User Drags and Drops the various tiles.")
	public void user_drags_and_drops_the_various_tiles() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)","");
		WebDriverWait obj = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
		obj.until(ExpectedConditions.urlToBe("https://demo.guru99.com/test/drag_drop.html"));
	    ddp.DragandDrop();
	    waitABit(3000);
	}
	@Then("User's Drag and drop functionality is completed.")
	public void user_s_drag_and_drop_functionality_is_completed() {
	    System.out.println("Drag and drop completed");
	}


}
