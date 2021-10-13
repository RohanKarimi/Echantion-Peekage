Feature: Sort by price
  As a User, I want to select the Sort by price filter
   so that will allow me to see the products sorted on the result page.

	@smoke
  Scenario: Verify the filtering leads to correct results and the search results that are relevant.
    Given The browser launched and opened
    And The user see the list of products 
    When The user click on the sort by price button
    And System display the products sorted
    Then I Check the outcomes





					

#all scenarios:

#Check if the clicking on the filter button opens the filter option.
#Check if the application allows using filter option before searching.
#Check if the filter options are visible or not for 0 search results.
#Check if the filter options are visible if the database errors are thrown in search results.
#Check if all the filter options are available.
#Check the if the filtering of result work per option.
#Check if the filtering leads to wrong results.
#Check if the filtering is allowed to edit.
#Check if the filtering is allowed to start over.
#Verify if the filter options can be saved.
#Verify if the filter options can be deleted.
#Verify if the filter options allow sorting through relevance.
#Verify if the filter options allow the sorting through keywords.
#Check if the filter option can be used with empty search query.
#Check if the search filter is available on all the pages of search result.
#Check if the search options are resulting in the search results that are relevant.
#Check if the filter options are responsive on the mobile devices.
#Verify that sorting works correctly on the search result page.
#Verify that the correct count of total products is listed on the category pages.