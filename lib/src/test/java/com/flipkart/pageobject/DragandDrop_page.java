package com.flipkart.pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DragandDrop_page extends PageObject{
	
	@FindBy(how=How.XPATH,using = "(//a[normalize-space()='Selenium'])[1]")
	WebElementFacade dropdown;
	
	@FindBy(how=How.XPATH,using = "//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li")
	public List<WebElement> dropdownmenu;
	
	@FindBy(how=How.XPATH,using = "(//a[@class='button button-orange'][normalize-space()='5000'])[2]")
	WebElementFacade selement1;
	
	@FindBy(how=How.XPATH,using = "(//li[@class='placeholder'])[1]")
	WebElementFacade telement1;
	
	@FindBy(how=How.XPATH,using = "(//a[@class='button button-orange'][normalize-space()='5000'])[2]")
	WebElementFacade selement2;
	
	@FindBy(how=How.XPATH,using = "(//li[@class='placeholder'])[4]")
	WebElementFacade telement2;
	
	@FindBy(how=How.XPATH,using = "(//a[normalize-space()='BANK'])[1]")
	WebElementFacade selement3;
	
	@FindBy(how=How.XPATH,using = "(//li[@class='placeholder'])[1]")
	WebElementFacade telement3;
	
	@FindBy(how=How.XPATH,using = "//a[normalize-space()='SALES']")
	WebElementFacade selement4;
	
	@FindBy(how=How.XPATH,using = "(//li[@class='placeholder'])[3]")
	WebElementFacade telement4;
	public void dropdown() {
		dropdown.click();
		for(WebElement obj:dropdownmenu) {
			if(obj.getText().equals("Drag and Drop Action")) {
				obj.click();
				break;
			}
		}
	}
	
	public void DragandDrop() throws InterruptedException {
		Actions ac =new Actions(getDriver());
		//ac.dragAndDrop(selement4, telement4).perform();
		ac.dragAndDrop(selement2, telement2).perform();
		ac.dragAndDrop(selement3, telement3).perform();
		ac.dragAndDrop(selement1, telement1).perform();
	}
	
}
