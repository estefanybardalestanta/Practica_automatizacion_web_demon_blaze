@HU02-IniciarSesion
Feature: Iniciar sesión en la página web Demo Blaze

    @ESC01 @HappyPath @IniciarSesion @Compras
    Scenario Outline: Iniciar sesión con credenciales válidas.
        Given el actor ingresa a la pagina web Demon Blaze
        And selecciona el item Log in para el registro de usuario
        When se logea ingresando nombre de usuario "<usuario>" y contrasenia "<contrasenia>"
        Then se inicia sesion de manera exitosa
        And selecciona id de producto
        And selecciona add to card
        And se muestra el mensaje product added
        And selecciona cart
        And selecciona place order
        And se registra la compra con "Renzo", "Trujillo", "Trujillo", "1234567834561456", "05", "2025"
        And validar mensaje OK
        And selecciona cart

        Examples:
            |  usuario  |  contrasenia  |
            |  rsoles23  |  rsoles2025   |

    @ESC02 @IniciarSesion
    Scenario Outline: Iniciar sesión con credenciales no existentes.
        Given el actor ingresa a la pagina web Demon Blaze
        And selecciona el item Log in para el registro de usuario
        When se logea ingresando nombre de usuario "<usuario>" y contrasenia "<contrasenia>"
        Then se muestra el mensaje de que el usuario no existe

        Examples:
            |  usuario  |  contrasenia  |
            |  rsoles23asdsad  |  rsoles2025  |
            |  ocontreras23asdsad  |  ocontreras2025  |