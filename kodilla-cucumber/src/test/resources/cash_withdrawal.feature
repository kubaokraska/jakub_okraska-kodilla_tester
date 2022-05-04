Feature: Cash Withdrawal

  Scenario: Successful withdraw from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

    Scenario: Unsuccessful withdraw from a wallet in credit
      Given I have deposited $200 in my wallet
      When I request $250
      Then $250 should not be dispensed