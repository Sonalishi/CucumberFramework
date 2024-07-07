# CucumberFramework

CucumberFramework is test automation framework based on cucumber, TestNG and different other concepts, covering Parallel execution,Cross Browser testing, functional testing & unit testing. 
For this project we have used "https://demo.nopcommerce.com/" application. nopCommerce is online store to perchase various goods like Computers, Electonics and Apparel.

Created with lessons learned from a large number of development projects to provide all commonly required components and concepts.

## Concepts Included

* Cucumber structure :- better test management
* Parallel test runs :- testng.xml contais data-provider-thread-count="5" which runs 5 threds in parallel
* Cross Browser tests:- test can run on 3 different browsers (chrome, firefox & safari)
* Page Object pattern
* Screenshots of failed tests.
* Maven
* Commonly used utility class
* Differnt Reports

## Tools

* Maven
* Cucumber-JVM
* TestNG
* Selenium Webdriver

## Requirements

In order to utilise this project you need to have the following setup:

* Eclipse or IntelIJ IDE
* Chrome , firefox browser
* Java 1.8

Clone the project in youre IDE and same the POM.xml file.

## Usage

Clone the project in youre IDE and same the POM.xml file.

run the testng.xml file -> right click -> Run As -> TestNG suite
OR
Run TestRunner class -> right click -> Run As -> TestNG suite

## Reporting

Below reports get generated after each execution

1. Cucumber-Report.html  -> /target folder
2. Cucumber.json -> /target folder
3. surefire-reports -> /target/surefire-reports
4. testng reports -> /test-output folder


