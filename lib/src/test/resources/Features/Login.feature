@Test1
Feature: Flipkart 
  I want to test Automation for Flipkart

Background: Login
    Given User should be on login page
    When User enter Email ID and Password
    And Click on Login button.
    Then User should be on Homepage.
    
Scenario: Testing Searching Product
    Given User is on Homepage.
    When User search on the search bar as "mobile"
    And Clicks on search btn.
    And Selects the mobile 
    Then Clicks on Add to WishList.
   
Scenario: Scrolling to the particular item.
    Given User is on Homepage.
    When User searches an item.
    And Scroll to the particular item.
    Then Clicks on the item.
    
Scenario: Switching from one page to another in cart.
   Given User is on Homepage.
   When User clicks on cart.
   And User switches between flipkart and grocery tab.
   Then Comes back to homepage.
   
Scenario: Selecting value from dropdown.
    Given User is on Homepage.
    When User is searching an item.
    And selecting the appropriate filter value from the dropdown.
    Then Filtered item list is displayed.

Scenario: Hovering on the element.
    Given User is on Homepage.
    When User clicks on MyAccount.
    And Clicks on the wishlist.
    Then Items on the wishlist are displayed.   
    
@Scenario1
Scenario Outline: Searching the item through searchbar.
  Given User is on Homepage.
  When user searches the <item>.
  Then the search result is displayed.

    Examples: 
    |item             |      
    |'washing machine'|
    |'tv'             |