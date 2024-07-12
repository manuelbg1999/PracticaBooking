Feature: Reserve in the booking.com

  Scenario: User reserve in the platform
    Given the user access in the platform
    When the user enter the information
      |city|
      |Medellín|
    Then user look the hotel reserve in the page