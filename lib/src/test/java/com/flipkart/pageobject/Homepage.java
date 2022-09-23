package com.flipkart.pageobject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Homepage extends PageObject{
	
	
	@FindBy(how=How.XPATH,using = "//*[text()='Login']")
	WebElementFacade loginbtn;
	@FindBy(how=How.XPATH,using = "//*[@class='_2IX_2- VJZDxU']")
	WebElementFacade email;
	@FindBy(how=How.XPATH,using ="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElementFacade pass;
	@FindBy(how=How.XPATH,using ="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElementFacade sub;
	@FindBy(how=How.XPATH,using = "//input[@name='q']")
	WebElementFacade search;
	@FindBy(how=How.XPATH,using = "//button[@class='L0Z3Pu']")
	WebElementFacade searchbtn;
	@FindBy(how=How.XPATH,using = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[2]")
	WebElementFacade mo;
	@FindBy(how=How.XPATH,using = "//*[@class='_36FSn5']")
	WebElementFacade wlist;
	@FindBy(how=How.XPATH,using ="//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img")
	WebElementFacade mob;
	
	@FindBy(how=How.XPATH,using ="//*[@title='Bags & Backpacks']")
	WebElementFacade btitle;
	
	@FindBy(how=How.XPATH,using ="//*[@title='Books']")
	WebElementFacade bktitle;
	
	public void email(String mail1) {
		email.sendKeys(mail1);
	}
	public void pass(String pswd) {
		pass.sendKeys(pswd);
	}
	public void sub() {
		sub.click();
	}
	public void Search(String s) {
		search.sendKeys(s);
	}
	public void Searchbtn() {
		searchbtn.click();
	}
	public void mobile() {
		mob.click();
		
	}
	public void clickonmb() {
		mo.click();
		
	}
	public void AddtoWishlist() {
		wlist.click();
	}
	public String gettitle() {
		return btitle.getText();
	}

	
	
}

