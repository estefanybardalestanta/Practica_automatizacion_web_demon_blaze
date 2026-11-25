package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import org.example.tasks.NavegarA;

public class IngresarAPaginaStepDefinition {

    @Given("el {actor} ingresa a la pagina web Demon Blaze")
    public void elActorIngresaALaPaginaWebDemonBlaze(Actor actor) {
        //Abrimos la página web
        actor.attemptsTo(NavegarA.theHomePage());
    }
}
