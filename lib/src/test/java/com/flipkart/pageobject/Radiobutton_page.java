package com.flipkart.pageobject;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Radiobutton_page extends PageObject{

	    @FindBy(xpath=("(//*[@class='dropdown-toggle'])[1]"))
	    public WebElementFacade dropdown;

	    @FindBy(xpath="//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li")
	    public List<WebElement> dropdownMenu;
	    
	    @FindBy(xpath ="(//input[@id='vfb-6-0'])[1]")
	    public WebElementFacade checkbox1;
	    
	    @FindBy(xpath ="(//input[@id='vfb-6-1'])[1]")
	    public WebElementFacade checkbox2;
	    
	    @FindBy(xpath ="//input[@id='vfb-6-2']")
	    public WebElementFacade checkbox3;
 


	    public void RadioButton() throws InterruptedException
	    {
	        WebElement radio1 =getDriver().findElement(By.id("vfb-7-1"));
	        WebElement radio3 =getDriver().findElement(By.id("vfb-7-3"));
	        radio1.click();
	        waitABit(3000);
	        radio3.click();
	        Actions ac = new Actions(getDriver());
	        ac.click(checkbox1).perform();
	        ac.click(checkbox2).perform();
	        ac.click(checkbox3).perform();
	    }
         
	    public void radio2() {
	    	WebElement radio2 =getDriver().findElement(By.id("vfb-7-2"));
	    	radio2.click();
	    }
	    
	    public void check() {
	    	Boolean check1= getDriver().findElement(By.id("vfb-7-2")).isDisplayed();	
	    	Boolean check2= checkbox1.isSelected();
	    	Boolean check3= checkbox2.isSelected();
	    	Boolean check4= checkbox3.isSelected();
	    	assertTrue(check1);
	    	assertTrue(check2);
	    	assertTrue(check3);
	    	assertTrue(check4);
	    	
	    }
	    public void SeleniumDropdown()
	    {
	        dropdown.click();
	        for(WebElement obj:dropdownMenu)
	        {
	            if(obj.getText().equals("Radio & Checkbox Demo"))
	            {
	                obj.click();
	                break;
	            }
	        }            
	    }

	    
}
