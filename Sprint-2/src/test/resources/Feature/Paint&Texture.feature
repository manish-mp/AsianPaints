 @VerifyPaints&Textures
Feature: Paints&Textures 

Background:
Given user is at the  asian Paints home page
And user click on Paints & textures icon

@first
Scenario: verifying interior paints 
 When user click on interiors wall paints
Then user should able to see all the different types of paints in interior Category

@second
 Scenario: verifying exterior paints
When click on exteriors wall paints
Then user should able to see all the different types of paints in exterior Category

@Third
 Scenario: verifying Wood & Metals paints
When click on wood and metal wall paints
Then user should able to see all the different types of paints in wood and metal Category