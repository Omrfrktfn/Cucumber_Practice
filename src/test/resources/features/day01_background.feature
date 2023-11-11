@ets
Feature: ets tour website login process

  Background: ets site enter
    Given go to ets tour website
    And go to login button and wait

  Scenario: TC-01 ets tour login
    When clikc the enter button
    And write email
    And write password
    When clikt the login button
    Then confirm page cannot be navigated to

  Scenario: TC-02ets tour write login
    And click the uye ol button
    And write name
    And write surname
    And write a login email
    And write a phone number
    And write a login password
    And write again login password
    And click the user conditions checkbox
    And click the kampanya checkbox
    When login page click the uye ol button
    Then confirm page cannot be navigated to