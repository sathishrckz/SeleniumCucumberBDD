#Author: sathishkumar Palanisamy
#Keywords Summary : feature file to verify the deals in the crm page



Feature: Deals validation.
Scenario: verify the deals in the crm page

Given deals page is opened
When navigate to submenu
And  click on todaysdeal
Then Todays deal should be displayed
