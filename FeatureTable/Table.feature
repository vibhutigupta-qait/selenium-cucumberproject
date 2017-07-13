Feature: Login Action
 
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
  And User enters Credentials to LogIn
    | vibhutigupta | Qait@123 |
	Then Message displayed Login Successfully
 