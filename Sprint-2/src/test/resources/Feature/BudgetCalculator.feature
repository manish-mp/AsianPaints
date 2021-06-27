@VerifyBudgetCalculator
Feature: BudgetCalculator
Background:
Given user is at the  asian Paints home page
And user click on Paints & textures icon

Scenario: Quick Interior budget calculator

And click on PaintBudgetCalculator 
When click on quick calculator and enters the required fields 
Then user should able to get calculated budget


