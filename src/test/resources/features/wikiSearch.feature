Feature: Wikipedia search functionality and verification

  Scenario: Wikipedia search functionality title verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" in the wiki title


  Scenario: Wikipedia search functionality header verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user should see "Steve Jobs" in the main header

  Scenario Outline: Wikipedia search functionality header verification
    Given user is on Wikipedia home page
    When user types "<searchValue>" in the wiki search box
    And user clicks wiki search button
    Then user should see "<expectedTitle>" in the main header
    Then user should see "<expectedMainHeader>" in the main header


  Examples: search values we are going to be using in this scenario is as below

    | searchValue       | expectedTitle     | expectedMainHeader |
    | Steve Jobs        | Steve Jobs        | Steve Jobs         |
    | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  |
    | Bob Marley        | Bob Marley        | Bob Marley         |
    | Chuck Norris      | Chuck Norris      | Chuck Norris       |
    | Antony Hopkins    | Antony Hopkins    | Antony Hopkins     |
