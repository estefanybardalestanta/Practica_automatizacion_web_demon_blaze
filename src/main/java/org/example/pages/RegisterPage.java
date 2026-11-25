package org.example.pages;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class RegisterPage {

    public static final Target INP_USERNAME = Target.the("Campo de texto para el nombre")
            .located(By.id("sign-username"));

    public static final Target INP_CONTRASENIA = Target.the("Campo de texto para el password")
            .located(By.id("sign-password"));

    public static final Target BTN_SIGN_UP = Target.the("Botón de registro")
            .located(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
}
