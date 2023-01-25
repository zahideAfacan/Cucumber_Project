@failed_tests
Feature: hook_test
  Scenario: TC_01_tets
    Given user on "https://www.bluerentalcars.com/login" page
    And user enters cutomer_email and customer_password
      | username       | password |
      | jack@gmail.com | 12345    |
    Then verify the next page url contains login keyword