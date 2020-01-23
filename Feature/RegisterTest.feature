#Author: deborah.souza@rsinet.com.br
#Keywords Summary :
Feature: Register a new user on the site

  Scenario: Successful registration
    Given User is on Home Page
    When User navigate  to Register Page
    And Fill in the fields correctly
    Then Registration is done

  Scenario: Registration failed
    Given User is on Home Page
    And User navigate  to Register Page
    When Fill in the fields incorrectly
    Then Registration it's not done
