Feature: fizzBuzz Game. Is the number divisible by 3 or 5?

  Scenario: Number is divisible by 3

    Given the number is 6
    When calculator check if the number is divisible by 3 or 5 or both or none
    Then I should be told "Fizz"

    Scenario: Number is divisible by 5

      Given the number is 10
      When calculator check if the number is divisible by 3 or 5 or both or none
      Then I should be told "Buzz"

  Scenario: Number is divisible by 5 and 3

    Given the number is 15
    When calculator check if the number is divisible by 3 or 5 or both or none
    Then I should be told "FizzBuzz"

  Scenario: Number isn't divisible by 5 or 3

    Given the number is 14
    When calculator check if the number is divisible by 3 or 5 or both or none
    Then I should be told "None"