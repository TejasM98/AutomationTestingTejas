package com.testing_flipkart.stepdefination;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64;


import com.flipkart.dataProvider.PropertiesReaderfile;
import com.flipkart.pageobject.Homepage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class Account_Details extends PageObject {
	// static WebDriver driver = null;
	PropertiesReaderfile r;
	Connection conn=null;
	Statement s =null;
	 @Steps
	 Homepage h;
	@Before
	public void setup() {
		//h = new Homepage();
		r=new PropertiesReaderfile();
		//System.out.println(r.getEmailID());
		//System.out.println(r.getPassword());
		try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Tej22n98");

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+ ": "+e.getMessage());
            System.exit(0);
        }
		
	}

	@Given("User should be on login page")
	public void user_should_be_on_login_page() throws InterruptedException{
		getDriver().manage().window().maximize();
	    getDriver().navigate().to("https://www.flipkart.com/");
	}

	@When("User enter Email ID and Password")
	public void user_enter_email_id_and_password()throws SQLException {
	   //h.loginbtn();
	  /*
	   *  h.email("mali.tejas345@gmail.com");
	   h.pass("Tej22n98");*/
		 //r = new PropertiesReaderfile();
		/*String decryptDataEmailId = r.getEmailID();
		byte[] decodeBytes = Base64.getDecoder().decode(decryptDataEmailId.getBytes());
		h.email(new String(decodeBytes));*/
		
		s = conn.createStatement();
		ResultSet rs = s.executeQuery("SELECT * from LOGIN");
		      while(rs.next()) {
		      String username = rs.getString("email");
		      h.email(username);
		}
		
		
		String decryptDataPassword = r.getPassword();
		byte[] decodeBytes2 = Base64.getDecoder().decode(decryptDataPassword.getBytes());
		h.pass(new String(decodeBytes2));
		
		
	}

	@When("Click on Login button.")
	public void click_on_login_button()throws InterruptedException {
		 h.sub();
		 waitABit(2000);
	}

	@Then("User should be on Homepage.")
	public void user_should_be_on_homepage() {
	    System.out.println("User is successfully logged in");
	}

	@Given("User is on Homepage.")
	public void user_is_on_homepage() {
		System.out.println("User is on homepage");
		
	}
	@When("User search on the search bar as {string}")
	public void user_search_on_the_search_bar_as(String string) throws InterruptedException {
		Thread.sleep(3000);
		h.Search(string);
	    
	}
	@When("Clicks on search btn.")
	public void clicks_on_search_btn() throws InterruptedException {
	    h.Searchbtn();
	    
	}
	@When("Selects the mobile")
	public void selects_the_mobile() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  Thread.sleep(3000);
	  h.clickonmb();
	  Thread.sleep(4000);
	  h.mobile();
	}

	@Then("Clicks on Add to WishList.")
	public void clicks_on_add_to_wish_list() throws InterruptedException {
	    h.AddtoWishlist();
	    System.out.println("Item is added to wishlist");
	}
	
	


}