Feature: Login features
  
  Scenario: login with valid credential and verify
    Given open webpage
    And go to login page
    When give valid credential
    And validate login success
