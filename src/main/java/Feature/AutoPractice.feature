
Feature: Automationpractice Test
  Scenario: Mouseover first item in popular list
   Given user suould be on home page
   And click on Add to Cart button that appears on mouseover
   When transfer control to popup that appears 
   And verify product added message
   Then click on Continue Shopping button in popup
   When transfer control to main page
   Then close window

 