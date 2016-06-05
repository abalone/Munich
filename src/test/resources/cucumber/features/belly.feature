Feature: Belly
  Background:
    Given I have 42 cukes in my belly

  Scenario: a few cukes
    When I wait 1 hour
    Then my belly should growl

  @Important
  Scenario: a few cukes 2
    When I wait 0 hour
    Then my belly should silent

  Scenario Outline: a few cukes N
    Given I have <count> cukes in my belly
    When I wait <hour> hour
    Then my belly should <result>

    Examples:
    | count | hour | result |
    | 40 | 2 | silent |
    | 42 | 1 | growl |
    | 40 | 0 | silent |

  Scenario: data table
    Given the following users exist:
     | name   | email              | twitter         |
     | Aslak  | aslak@cucumber.io  | @aslak_hellesoy |
     | Julien | julien@cucumber.io | @jbpros         |
     | Matt   | matt@cucumber.io   | @mattwynne      |
    Then number of users should be 3

  Scenario: doc string
    Given I see a doc string
    """
    This is a doc String.
    """
    Then I can speak out this doc string
    """
    I can speak: This is a doc String.
    """