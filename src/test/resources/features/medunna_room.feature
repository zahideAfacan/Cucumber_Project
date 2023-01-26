@MedunnaRoom
Feature: Medunna Room Creation

  Background: Signin Medunna
    Given user on "https://medunna.com" page
    When click on user icon
    And click on Sign In option
    And enter "john_doe" in username input
    And enter "John.123" in password input
    And click on Remember Me checkbox
    And click on Sign In submit button

  Scenario Outline: Create Room
    When click on Items&Titles
    And click on Room option
    And click on Create a new room button
    And enter "<room number>" in Room Number input
    And select Suit option from Room Type dropdown
    And click on status checkbox
    And enter "<price>" in Price input
    And enter "<description>" in Description input
    And click on Save button
    And click on Created Date
    Then assert that room is created via "<room number>"
    Then close the application
    Examples:
      | room number | price | description        |
      | 119072975    | 345   | Room 1             |
      | 869077822    | 567   | My Resting Room    |
      | 996254360    | 543   | Good viewed        |
      | 876765920    | 222   | Need extra service |