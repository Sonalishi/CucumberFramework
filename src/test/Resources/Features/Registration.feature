Feature: Registration Functionality for nopCommerce site
  
  As a user I want to register to nopCommerce site
  Also want to create my login Id and password 
  So that I can shop the goods.

  Background: Successful login to registration page
   Given I on registration page
   
  Scenario Outline: Successful registration with valid credentials
    Given I have entered valid <Gender> , <FirstName> , <LastNme> , <Email> , <Password> , <ConfirmPassword>
    When I click on Register button
    Then I should be logged in Successfully
    Examples: 
      | Gender | FirstName | LastNme | Email               | Password | ConfirmPassword|
      |Male    | Steve     | Jobs    | stevejobs@gmail.com | steveJ123| steveJ123      |
