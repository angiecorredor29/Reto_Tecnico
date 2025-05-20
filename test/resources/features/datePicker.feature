Feature: Validaciones del campo datepicker

  Background: Ingreso a la pagina principal Datepicker
    Given el usuario abre la pagina principal de JQuery Datepicker

  Scenario: Reservar una cita seleccionando una fecha en el calendario
    Given el usuario se encuentra en la pagina de JQuery Datepicker
    When el usuario hace clic en el campo date
    When el usuario selecciona el dia 15 del mes actual
    Then el usuario debera visualizar la fecha en el campo date

  Scenario: Seleccionar una fecha especifica en un mes diferente
    Given el usuario se encuentra en la pagina de JQuery Datepicker
    When el usuario hace clic en el campo date
    When el usuario navega hasta el proximo mes en el calendario
    When el usuario selecciona el dia 10 del proximo mes
    Then el usuario debera visualizar la fecha en el campo date

  Scenario: Validar campo bloqueado
    Given el usuario se encuentra en la pagina de JQuery Datepicker
    When el usuario intenta ingresar una fecha manualmente en el campo date
    Then el usuario debera visualizar que no es posible digitar la fecha manualmente