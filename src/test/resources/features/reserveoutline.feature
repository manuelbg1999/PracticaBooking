Feature: Reserve in the booking.com outline


  #los escenarios Los escenarios outline en Cucumber son útiles cuando necesitas ejecutar el mismo escenario con múltiples conjuntos de datos. En lugar de repetir
  # el escenario para cada conjunto de datos, puedes usar un escenario outline para definir los parámetros y proporcionar diferentes valores para cada ejecución.
  Scenario Outline: User reserve in the platform whit outline
    Given the user access in the platform outline
    ###Aqui se pasan las variables
    When the user enter the information"<city>""<dateinit>""<datefinal>"
    Then user look the hotel reserve in the page outline
    Examples:
    #se hace una tabla con los nombres de las variables y los datos
      | city | dateinit | datefinal |
      |Medellín|19 julio 2024|26 julio 2024|
      |Monteria|20 julio 2024|28 julio 2024|
