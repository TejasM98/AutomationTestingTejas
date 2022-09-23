package com.flipkart.pageobject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Searching_Pageobject extends PageObject {
	@FindBy(how=How.XPATH,using = "//input[@name='q']")
	WebElementFacade srch;
	
	@FindBy(how=How.XPATH,using = "//button[@class='L0Z3Pu']")
	WebElementFacade srchbtn;
	
	public void searching(String str3) {
		typeInto(srch, str3);
		clickOn(srchbtn);
		waitABit(3000);
		
	}

}
