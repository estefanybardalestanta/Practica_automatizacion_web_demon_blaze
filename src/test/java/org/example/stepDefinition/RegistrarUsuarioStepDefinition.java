package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import org.example.pages.HomePage;
import org.example.questions.AlertaQuestion;
import org.example.tasks.RegistrarUsuario;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class RegistrarUsuarioStepDefinition {
    @And("selecciona el item Sign up para el registro de usuario")
    public void seleccionaElItemSignUpParaElRegistroDeUsuario() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.ITM_SIGN_UP));
    }

    @When("se registra ingresando nombre de usuario {string} y contrasenia {string}")
    public void seRegistraIngresandoNombreDeUsuarioYContrasenia(String usuario, String contrasenia) {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.withData(usuario, contrasenia));
    }

    @Then("se realiza el registro del usuario de manera exitosa")
    public void seRealizaElRegistroDelUsuarioDeManeraExitosa() {
        theActorInTheSpotlight().should(
                seeThat(AlertaQuestion.texto(), equalTo("Sign up successful."))
        );
    }

    @Then("se muestra el mensaje de error que el usuario ya existe")
    public void seMuestraElMensajeDeErrorQueElUsuarioYaExiste() {
        theActorInTheSpotlight().should(
                seeThat(AlertaQuestion.texto(), equalTo("This user already exist."))
        );
    }
}
