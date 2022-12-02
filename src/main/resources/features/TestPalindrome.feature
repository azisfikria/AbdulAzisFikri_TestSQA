Feature: Determine if String is Palindrome or not. A string is a palindrome if it reads
  the same backwards as forwards.

  Scenario: Valid Palindrome
    Given I entered string "Refer"
    When I test it for Palindrome
    Then the result should be "true"

  Scenario: Invalid Palindrome
    Given I entered string "Coin"
    When I test it for Palindrome
    Then the result should be "false"

  Scenario Outline: Cek apakah kata ini Palindrome atau bukan
    Given saya input <wordToTest>
    When I test it for Palindrome
    Then hasilnya <output>
    Examples:
      | wordToTest | output  |
      | "Refer"    | "true"  |
      | "Coin"     | "false" |
      | "Space"    | "false" |
      | "racecar"  | "true"  |

