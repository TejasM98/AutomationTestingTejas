package com.flipkart.pageobject;


import org.openqa.selenium.Alert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Alert_page extends PageObject {
	@FindBy(how=How.XPATH,using = "//button[normalize-space()='Click for JS Alert']")
	WebElementFacade JsAlert;
	
	@FindBy(how=How.XPATH,using = "//button[normalize-space()='Click for JS Confirm']")
	WebElementFacade JsConfirm;
	
	@FindBy(how=How.XPATH,using = "//button[normalize-space()='Click for JS Prompt']")
	WebElementFacade JsPrompt;
	
	public void Alert_handling() {
		JsAlert.click();
		Alert a = getDriver().switchTo().alert();
		waitABit(1000);
	    System.out.println("The jsAlert text is :" + a.getText());
	    a.accept();  // close the alert window by clicking on ok button..
		waitABit(3000);
		JsConfirm.click();
		System.out.println("The JsConfirm text is : "+ a.getText());
		a.dismiss(); // close the alert window by clicking on cancel button..
		waitABit(3000);
		JsPrompt.click();
		a.sendKeys("My name is Tejas Mali");
		waitABit(3000);
		System.out.println("The JsPrompt text is: "+a.getText());
		a.accept();
		waitABit(3000);
	}
}
