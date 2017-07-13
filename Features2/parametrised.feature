
Feature: Login Action
 
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
  And User enters "vibhutigupta" and "Qait@123"
	Then Message displayed Login Successfully
 