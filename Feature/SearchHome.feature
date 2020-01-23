Feature: Search Home

  Scenario: Search
    Given User is on Home Page
    When Click in product in home
    Then Search is done

  Scenario: Search failed
    Given User is on Home Page
    When Click in invalid product in home
    Then Search is not done
