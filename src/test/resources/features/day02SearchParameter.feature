@madamcoco
Feature: SearchParameters

  Scenario: TC01
    Given go to madame coco website
    And write searchbox vazo
    Then the results confirm vazo

  Scenario: TC02
    Given go to madame coco website
    And clikct the english button
    And write searchbox"<urun>"
    Then the results confirm "<urun>"
