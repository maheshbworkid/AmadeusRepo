#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Amazon Login feature

Background:
Given user is on welcome page

Scenario: Login page title
When user gets the title of the page
Then the page title should be "Amazon.in"

Scenario: Login with valid login credentials
Then user click on Sign in dropdown button
Then user is on login page with page title "Amazon Sign in"
Then User enters valid username and password
|maheshb2094@gmail.com|Mahesh@123|
Then user verifies the signed in user name
