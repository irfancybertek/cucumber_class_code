Feature: This is just a test feature for cucumber

Scenario: User searches a item on Google and check if the title matches the keyword
	Given I navigate to google homepage
	When I enter a keyword to search
	When I click on the search button
	And I should be able to see the title contains the keyword
	
	
	
	