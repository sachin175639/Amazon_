Feature: Open https://www.amazon.in/.

Scenario: Amazon website
	Given Open amazon site
	Then Click on hamburger menu
	Then Scroll and click on TV Appliances and Electronics
	Then Click on Televisions under Tv Audio & Cameras sub section
	Then Scroll down and filter the results by Brand Samsung
	And Sort the Samsung results with price High to Low
    Then Click on the second highest priced item
    Then Switch the Window
    And Section is present and log this section text to console or report.
