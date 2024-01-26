Feature: loggin in.
  user is trying to log in to the page BlazeDemo to acces my profile

  @LoginSerenity
  Scenario:Loggin successfully done

    Given thah user is in homepage
    When clicking in log in option
    And writting credentials
      | user      | password      |
      | EliteUser | Colombia.2020 |
    Then User will be able to see user profile succesfully

  @LoginIncorrecto
  Scenario Outline: inicio de sesion exitoso
    Given thah user is in homepage
    When clicking in log in option
    And el usuario escribe credenciales invalidas

      | usuario   | clave   |
      | <usuario> | <clave> |

    Then el usuario podra visualizar mensaje de error

    Examples:
    #diamantizar
      | usuario | clave  |
      | dhgjhj  | 1246   |
      | ffhjfj  | 556786 |
      | rtjym   | 896878 |