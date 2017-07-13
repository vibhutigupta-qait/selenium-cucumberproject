
Feature: Login Action
 
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
  And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
  
Examples:
    | username| password | 
    | vibhutigupta |  Qait@123   | 