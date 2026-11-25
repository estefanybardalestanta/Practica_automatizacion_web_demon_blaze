package org.example.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target INP_USUARIO = Target.the("Campo texto para el usuario")
            .located(By.id("loginusername"));

    public static final Target INP_CONTRASENIA = Target.the("campo texto para password")
            .located(By.id("loginpassword"));

    public static final Target BTN_LOGIN = Target.the("Botón de registro")
            .located(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
}
