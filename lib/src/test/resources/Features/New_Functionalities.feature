@Test2
Feature: Testing Robot class functionality.
  @Robotclass
  Scenario: MyAccount Page
  When User clicks on Signin btn.
  And User gives his login credentials.
  And Clicks on login btn.
  Then Goes to my profile and edit the details.
  
  @Alert
  Scenario: Handling Alerts
  When User clicks on Alert.
  Then Handles Alerts using various methods.
  
  @Window
  Scenario: Handling multiple windows
  Given User is on login page.
  When User clicks on Terms and Conditions.
  And Get the title of both the windows and IDs.
  Then Goes back to parent window.
  
  @Filehandling
  Scenario: Uploading file using sendKeys & Robot class
  Given User is on Homepage of Monster.com
  When User clicks on upload resume popup opens.
  Then User uploads his/her resume.
  
  @DragandDrop
  Scenario: Using DragandDrop Functionality
  Given User is on Guru99 Homepage.
  When User clicks on Selenium dropdown and selects the drag and drop tab.
  And  User Drags and Drops the various tiles.
  Then User's Drag and drop functionality is completed.
  
  @Cookie
  Scenario: Using Cookie handling functionality.
  Given User is on homepage of filpkart.
  When User captures all the cookies.
  And User add and then delete the cookies.
  Then User prints the remaining cookies.
  
  #@DisablingPopups
  #Scenario: Disabling popups
  #When User clicks on the whatsmylocation website.
  #Then the popup coming is disabled.
  
  @Radiobutton
  Scenario: Radiobutton Functionality
  Given User is on Guru99 website
  When User clicks on Selenium Dropdown
  And selects the Radio button option
  And User clicks on any radio button
  Then The Radio_button is Selected
  