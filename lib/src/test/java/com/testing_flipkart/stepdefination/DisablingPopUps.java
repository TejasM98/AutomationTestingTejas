package com.testing_flipkart.stepdefination;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DisablingPopUps {
	@When("User clicks on the whatsmylocation website.")
	public void user_clicks_on_the_whatsmylocation_website() {
		 ChromeOptions options = new ChromeOptions();
		HashMap<String,Integer> contentSettings = new HashMap<String,Integer>();
		HashMap<String,Object> profile = new HashMap<String,Object>();
		HashMap<String,Object> preferences = new HashMap<String,Object>();
		
		contentSettings.put("geolocation",2);
		profile.put("managed_default_content_settings",contentSettings);
		preferences.put("profile", profile);
		options.setExperimentalOption("prefs", preferences);
		WebDriverManager.chromedriver().setup();
	
	   
	   // options.addArguments("--disable-notifications");
	    //options.addArguments("--disable-geolocation");
	    //options.addArguments("--disable-media-stream");
	    WebDriver driver =new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://whatmylocation.com/");
	   
	    
	}
	@Then("the popup coming is disabled.")
	public void the_popup_coming_is_disabled() {
	   System.out.println("Popup is disabled");
	   
	}
}

