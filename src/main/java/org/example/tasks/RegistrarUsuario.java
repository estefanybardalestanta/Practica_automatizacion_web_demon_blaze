package org.example.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.pages.RegisterPage;

@AllArgsConstructor
public class RegistrarUsuario implements Task {

    private final String username;
    private final String contrasenia;

    public static Performable withData(String username, String contrasenia) {
        return new RegistrarUsuario(username, contrasenia);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(RegisterPage.INP_USERNAME),
                Enter.theValue(contrasenia).into(RegisterPage.INP_CONTRASENIA),
                Click.on(RegisterPage.BTN_SIGN_UP)
        );
    }

}
