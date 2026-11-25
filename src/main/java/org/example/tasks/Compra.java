package org.example.tasks;


import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.pages.CatalogoPage;

@AllArgsConstructor
public class Compra implements Task {

    private final String name;
    private final String country;
    private final String city;
    private final String card;
    private final String month;
    private final String year;

    public static Performable withData(String name, String country, String city, String card, String month, String year) {
        return new Compra(name, country, city, card, month, year);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(CatalogoPage.INP_NAME),
                Enter.theValue(country).into(CatalogoPage.INP_COUNTRY),
                Enter.theValue(city).into(CatalogoPage.INP_CITY),
                Enter.theValue(card).into(CatalogoPage.INP_CARD),
                Enter.theValue(month).into(CatalogoPage.INP_MONTH),
                Enter.theValue(year).into(CatalogoPage.INP_YEAR),
                Click.on(CatalogoPage.BTN_PURCHASE)
        );
    }

}
