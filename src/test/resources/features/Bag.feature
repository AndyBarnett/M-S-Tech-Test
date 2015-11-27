@bag_tests
Feature: Visit a site
  As a clothes shopper
  Given I want to purchase clothes from M&S
  When I go to the site
  Then I can use the bag to purchase clothes

Scenario: Add shirt to bag and view bag
	Given I have added a shirt to my bag
	When I view the contents of my bag
	Then I can see the contents of the bag include a shirt