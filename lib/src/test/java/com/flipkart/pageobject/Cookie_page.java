package com.flipkart.pageobject;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Cookie_page extends PageObject {
	@FindBy(how=How.XPATH,using = "(//button[@type='submit'])[2]")
	WebElementFacade loginbtn;
	@FindBy(how=How.XPATH,using = "//*[@class='_2IX_2- VJZDxU']")
	WebElementFacade email;
	@FindBy(how=How.XPATH,using ="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElementFacade pass;
	
	public void email1() {
		email.sendKeys("mali.tejas345@gmail.com");
	}
	public void pass1() {
		pass.sendKeys("Tej22n98");
	}
	public void loginbtn1() {
		loginbtn.click();
	}
	
	public void captureC() {
	Set<Cookie> cookies	=getDriver().manage().getCookies();
	System.out.println("The cookies size is : "+cookies.size());
		for(Cookie cookie : cookies) {
			System.out.println(cookie.getName()+" : "+cookie.getValue());
		}
	}
	public void AddC_DeleteC() {
		Cookie cookieobj = new Cookie("MyCookieTejas","923891832");
		getDriver().manage().addCookie(cookieobj);
		Set<Cookie> cookie1= getDriver().manage().getCookies();
		System.out.println("The updated size of cookie after adding :"+ cookie1.size());
		getDriver().manage().deleteCookie(cookieobj);
		Set<Cookie> cookie2= getDriver().manage().getCookies();
		System.out.println("The size after deleting the cookie is : "+cookie2.size());
	}
	public void DeleteAllC() {
		getDriver().manage().deleteAllCookies();
		Set<Cookie> cookie3= getDriver().manage().getCookies();
		System.out.println("The final size of cookie is : "+ cookie3.size());
	}
	
}
