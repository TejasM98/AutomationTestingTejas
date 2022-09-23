package com.flipkart.pageobject;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Robot_page extends PageObject {
	@FindBy(how=How.XPATH,using = "//*[text()='Login']")
	public WebElementFacade loginbtn;
	@FindBy(how=How.XPATH,using = "//*[@class='_2IX_2- VJZDxU']")
	public WebElementFacade email;
	@FindBy(how=How.XPATH,using ="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	public WebElementFacade pass;
	@FindBy(how=How.XPATH,using ="//div[contains(text(),'My Account')]")
	public WebElementFacade myacc;
	@FindBy(how=How.XPATH,using ="//div[normalize-space()='My Profile']")
	public WebElementFacade myprofile;
	public void emailid() {
		email.sendKeys("mali.tejas345@gmail.com");
	}
	
	public void pass1() {
		pass.sendKeys("Tej22n98");
	}
	
	public int myaccx() {
	int x =myacc.getLocation().getX();
	 return x;
	}
	public int myaccy() {
		int y =myacc.getLocation().getY();
		return y;
	}
	public int myprofx() {
		int x=myprofile.getLocation().getX();
		return x;
	}
	public int myprofy() {
		int y=myprofile.getLocation().getY();
		return y;
	}
	public void keyrobo() throws AWTException {
		emailid();
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(2000);
		pass1();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		waitABit(4000);
	}
	public void mouserobo() throws AWTException {
		 Robot robo =new Robot();
		 robo.mouseMove(690,150);
		 robo.delay(4000);
		 robo.mouseMove(690,190);
		 robo.delay(4000);
		 robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		 robo.delay(2000);
		 robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		 waitABit(3000);
		 robo.mouseMove(720,150);
		 waitABit(1000);
	}
	public void mousemove() {
		 Actions action = new Actions(getDriver()); 
		 int getX = myprofile.getLocation().getX();
		 System.out.println("the x location is : "+ getX);
		 int getY = myprofile.getLocation().getY();
		 System.out.println("the y location is : "+ getY);
	}
}
