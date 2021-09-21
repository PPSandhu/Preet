
Feature: Data driven testing of Reg screen


  Scenario Outline: reg screen
   Given Open browser and navigate to reg screen
    Then enter Firstname as "<Firstname>"
    And enter Lastname as "<Lastname>"
    And enter EmailAddress as "<EmailAddress>"
  

    Examples: 
      | Firstname  | Lastname | EmailAddress  |
      | Firstname01 | Lastname01 | EmailAddress01 |
      | Firstname02 |Lastname02 | EmailAddress02 |
      | Firstname03 | Lastname03 | EmailAddress03 |
      | Firstname04 |Lastname04 | EmailAddress04 |
      | Firstname05 | Lastname05 | EmailAddress05 |
      | Firstname06 |Lastname06 | EmailAddress06 |
