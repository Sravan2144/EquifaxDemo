Feature: Perform assertions for Get & Delete - Status code to be Successful.


  Scenario: Get the employee details based on employee ID
    Given A list of employees avilable
    When Seach for employee by employee ID "23"
    Then User able to see resective employee details

  