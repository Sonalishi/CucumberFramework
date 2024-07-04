Feature: Welcome to Store Functionality
  
  As a user I want to select products or services from store

  Background: on welcome
    Given I am on Welcome to Store page

  Scenario: Positive test for search functionality
    Given I entered product in search bar and click on search button
    Then Product should display on page

    
  Scenario Outline: Navigating to different options pages
    Given I see visible options under <Main option> option
    When I click on <List option> option
    Then I should go on <List option> page

    Examples: 
      | List option     | Main option |
      | Desktops        | Computers   |
      | Notebooks       | Computers   |
      | Software        | Computers   |
      | Camera & Photos | Electronics |
      | Cell Phones     | Electronics |
      | Others          | Electronics |
    