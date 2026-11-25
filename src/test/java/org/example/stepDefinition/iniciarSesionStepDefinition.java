package org.example.stepDefinition;

import org.example.pages.CatalogoPage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.questions.AlertaQuestion;
import org.example.questions.LoginQuestion;
import org.example.tasks.Compra;
import org.example.tasks.IniciarSesion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class iniciarSesionStepDefinition {

    @And("selecciona el item Log in para el registro de usuario")
    public void seleccionaElItemLogInParaElRegistroDeUsuario() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.ITM_LOG_IN));
    }

    @When("se logea ingresando nombre de usuario {string} y contrasenia {string}")
    public void seLogeaIngresandoNombreDeUsuarioYContrasenia(String username, String contrasenia) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.withData(username, contrasenia));
    }

    @Then("se inicia sesion de manera exitosa")
    public void seIniciaSesionDeManeraExitosa() {
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(HomePage.ITM_LOG_OUT, isVisible()).forNoMoreThan(30).seconds());
        theActorInTheSpotlight().should(seeThat(LoginQuestion.visibleEn(HomePage.ITM_LOG_OUT), equalTo("Log out")));
    }

    @Then("se muestra el mensaje de que el usuario no existe")
    public void seMuestraElMensajeDeQueElUsuarioNoExiste() {
        theActorInTheSpotlight().should(
                seeThat(AlertaQuestion.texto(), equalTo("User does not exist."))
        );
    }

    @And("selecciona id de producto")
    public void seleccionaIdDeProducto() {
        theActorInTheSpotlight().attemptsTo(Click.on(CatalogoPage.BTN_ID));
    }

    @And("selecciona add to card")
    public void seleccionaAddToCard() {
        theActorInTheSpotlight().attemptsTo(Click.on(CatalogoPage.BTN_ADD));
    }

    @And("se muestra el mensaje product added")
    public void seMuestraElMensajeProductAdded() {
        theActorInTheSpotlight().should(
                seeThat(AlertaQuestion.texto(), equalTo("Product added."))
        );
    }

    @And("selecciona cart")
    public void seleccionaCart() {
        theActorInTheSpotlight().attemptsTo(Click.on(CatalogoPage.BTN_CART));
    }

    @And("selecciona place order")
    public void seleccionaPlaceOrder() {
        theActorInTheSpotlight().attemptsTo(Click.on(CatalogoPage.BTN_PLACE_ORDER));
    }

    @And("se registra la compra con {string}, {string}, {string}, {string}, {string}, {string}")
    public void seRegistraLaCompraCon(String name, String country, String city, String card, String month, String year) {
        theActorInTheSpotlight().attemptsTo(Compra.withData(name, country, city, card, month, year));
    }

    @And("validar mensaje OK")
    public void validarMensajeOK() throws InterruptedException {
        String texto = Text.of(CatalogoPage.ID_BUTTON).answeredBy(theActorInTheSpotlight());
        if (texto.equals("OK")) {
            theActorInTheSpotlight().attemptsTo(Click.on(CatalogoPage.ID_BUTTON));
            Thread.sleep(20000);
        }
    }
}