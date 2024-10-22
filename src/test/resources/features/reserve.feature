Feature: Reserve in the booking.com

  Scenario: User reserve in the platform
    Given the user access in the platform
    When the user enter the information
      |city|dateinit|datefinal|
      |Medellín|21 octubre 2024|26 octubre 2024|
    Then user look the hotel reserve in the page


