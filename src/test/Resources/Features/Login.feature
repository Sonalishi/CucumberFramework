Feature: Login Functionality for nopCommerce site
  
  As a user I want to Login to nopCommerce site
  

  Background:
   Given I am on Login page
   
  Scenario: Login with correct credentials
  When User enters Email "stevejobs@gmail.com"
  And  User enters Password "steveJ123"
  When User click on Login butten
  Then User should successfully login to store
    
   