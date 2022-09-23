package com.flipkart.pageobject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Scrollpage extends PageObject{
	@FindBy(how=How.XPATH,using = "//input[@name='q']")
	public WebElementFacade search;
	@FindBy(how=How.XPATH,using = "//button[@class='L0Z3Pu']")
	public WebElementFacade searchbtn;
	@FindBy(how=How.XPATH,using = "//*[text()='Hindi']")
	public WebElementFacade scroll;
	
	@FindBy(how=How.XPATH,using = "//*[@class='_3sckoD']")
	public WebElementFacade hind;
	
	public void search1() {
		search.sendKeys("rich dad poor dad");
		searchbtn.click();
	}
	
	public void item() {
		scroll.click();
	}
	
	public String check() {
		return hind.getText();
	}
}
