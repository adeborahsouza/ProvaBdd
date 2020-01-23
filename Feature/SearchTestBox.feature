Feature: Search Box

  Scenario: Search
    Given User is on Home Page
    When look for a product in the box search
    Then Search is done

  Scenario: Search failed
    Given User is on Home Page
    When look for a product nonexistent in the box search
    Then Search is not done
