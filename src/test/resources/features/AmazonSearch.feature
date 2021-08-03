Feature: As a user, I want to search some QA books

 
  Scenario: Successful seach on Amazon home page
    Given Amazon Home Page
    When Seach for "QA testing for beginners" and click on search button
    Then User able to see search result

  