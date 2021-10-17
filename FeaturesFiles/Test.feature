Feature: Test
  Scenario Outline: Verification of Login
    Given Open CloudVote
    Then CloudVote has Launched Successfully
    When Entered <Username> and <Password>
    And  Click on Login Button
    Then Verify Login Successful

    Examples:
      | Username            | Password  |
      | shumas3@yopmail.com | Qwe123@@@ |