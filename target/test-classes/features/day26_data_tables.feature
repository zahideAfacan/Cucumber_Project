@data_tables_1
Feature: data_tables
  Scenario: customer_login
    Given user on "https://www.bluerentalcars.com/login" page
    And user enters cutomer_email and customer_password
    | username      |   password    |
    |jack@gmail.com |   12345       |
    Then verify the application login is successful
    And close the application
