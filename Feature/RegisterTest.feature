#Author: deborah.souza@rsinet.com.br
#Keywords Summary :
@tag
Feature: Register
  Register a new user on the site

  @tag1
  Scenario: Successful registration
    Given User is on Home Page
    And User navigate  to Register Page
    When Fill in the fields correctly
    Then Registration is made
    And Back to home page

  @tag2
  Scenario: Registration failed
    Given User is on Home Page
    And User navigate  to Register Page
    When Fill in the fields incorrectly
    And The fields are not validated
    Then Registration it's not done
    And continues on the registration page
