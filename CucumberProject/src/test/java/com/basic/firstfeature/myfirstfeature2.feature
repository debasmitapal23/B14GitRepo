Feature: Create account of Facebook
As a user u need to open facebook home page and do the validations

Scenario: Validate First name field
Given User need to be on facebook login page
When User enters user "David" first name
Then User checks user "David" first name present

#Scenario: Validate create user multiple fields
#Given user need to be on facebook login page
#When User enters user first name
#And user enters user last name
#Then user checks user first name is present
#But user Mobile field should be blank
 
