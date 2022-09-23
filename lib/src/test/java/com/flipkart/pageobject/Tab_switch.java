package com.flipkart.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Tab_switch extends PageObject {
	@FindBy(how=How.XPATH,using ="//span[normalize-space()='Cart']")
	public WebElementFacade CART;
	
	@FindBy(how=How.XPATH,using = "//*[@class='_2FYYw1']")
	public WebElementFacade grocery;
	
	@FindBy(how=How.XPATH,using = "(//*[@class='_2YxCDZ'])[1]")
	public WebElementFacade minprice;
	
	@FindBy(how=How.XPATH,using = "(//*[@class='_2YxCDZ'])[2]")
	public WebElementFacade maxprice;
	
	@FindBy(how=How.XPATH,using = "//*[@title='RED CHIEF']")
	public WebElementFacade shoebrand;
	
	@FindBy(how=How.XPATH,using = "//div[contains(text(),'My Account')]")
	public WebElementFacade myaccount;
	
	@FindBy(how=How.XPATH,using = "//div[normalize-space()='Wishlist']")
	public WebElementFacade wishlist;
	
	@FindBy(how=How.XPATH,using = "/html/body/div/div/div[3]/div/div[2]/div/div/div[2]/a/div[1]/div/div[1]/div/img")
	public WebElementFacade mobile;
	
	public void kart() {
		clickOn(CART);
		waitABit(4000);
		clickOn(grocery);
	}
	
	public void shoe() {
		shoebrand.click();
	}
	
	public void checkbox() {
		List<WebElement> listOfElements = getDriver().findElements(By.xpath("//*[@class='_24_Dny']"));
		System.out.println("Number of elements : "+listOfElements.size());	
		}
		 
	}
	
