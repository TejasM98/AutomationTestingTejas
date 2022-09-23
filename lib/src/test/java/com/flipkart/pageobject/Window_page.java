package com.flipkart.pageobject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Window_page extends PageObject{
	@FindBy(how=How.XPATH,using = "//a[normalize-space()='Terms of Use']")
	WebElementFacade Termncond;
	
	@FindBy(how=How.XPATH,using = "//a[normalize-space()='Privacy Policy']")
	WebElementFacade Privacy;
	
	public void Termncond() {
		Termncond.click();
	}
	public void Privacy() {
		Privacy.click();
	}
	
	public void window() {
		Set<String> windowIDs = getDriver().getWindowHandles();
		List<String> windowIdsList = new ArrayList(windowIDs);
		for(String winids:windowIdsList) {
		   String title = getDriver().switchTo().window(winids).getTitle();
		   System.out.println("The title is :" +title);
		   System.out.println(winids);
		}
	}
	public void swtich_window() {
		Set<String> windowIDs = getDriver().getWindowHandles();
		List<String> windowIdsList = new ArrayList(windowIDs);
		for(String winids:windowIdsList) {
			 String title = getDriver().switchTo().window(winids).getTitle();
			 if(title.equals("Terms Store Online - Buy Terms Online at Best Price in India | Flipkart.com")) {
				 getDriver().close();
			 }
		}
	}
}
