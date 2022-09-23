package com.flipkart.pageobject;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class File_page extends PageObject{
	@FindBy(how=How.XPATH,using = "//a[@class='btn block resume-btn btn-orange mt20']")
	WebElementFacade upres;
	
	@FindBy(how=How.XPATH,using ="//input[@id='file-upload']")
	WebElementFacade upfile;
	@FindBy(how=How.XPATH,using="(//div[@class='close-button mqfi-cross'])[2]")
	WebElementFacade closebox;
	
	public void upres() {
		upres.click();
	}
	
	public void closebox() {
		closebox.click();
	}
	public void upfileS() {
		//upfile.click();
		getDriver().findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Tejas Mali.docx");
	}
	
	public void robotfile() throws AWTException {
		WebElement button = getDriver().findElement(By.xpath("//input[@id='file-upload']"));
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].click();",button);  //Click action on button
		Robot rb = new Robot();
		rb.delay(1000);
		StringSelection ss = new StringSelection("C:\\Tejas Mali.docx");  //putting file into clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);  
		//ctrl+v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(1000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.delay(1000);
		//ENTER
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
