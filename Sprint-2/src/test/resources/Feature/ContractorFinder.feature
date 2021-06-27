@VerifyContractorFinder
Feature: ContractorFinder

Background:
Given user is at the  asian Paints home page


Scenario: successful in finding the contractor in our locality

And user click on Contractor Finder icon
And enter valid city name 
Then user should able to see the list of contractor 

