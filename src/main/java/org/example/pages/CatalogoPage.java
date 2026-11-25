package org.example.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CatalogoPage {

    public static final Target BTN_ID = Target.the("Boton ID Product")
            .located(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img"));

    public static final Target BTN_ADD = Target.the("Boton Add Product")
            .located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));

    public static final Target BTN_CART = Target.the("Boton Add Product")
            .located(By.xpath("//*[@id=\"cartur\"]"));

    public static final Target BTN_PLACE_ORDER = Target.the("Boton Place Order")
            .located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));

    //Registro para compra
    public static final Target INP_NAME = Target.the("Campo de texto para el nombre")
            .located(By.id("name"));

    public static final Target INP_COUNTRY = Target.the("Campo de texto para el pais")
            .located(By.id("country"));

    public static final Target INP_CITY = Target.the("Campo de texto para el ciudad")
            .located(By.id("city"));

    public static final Target INP_CARD = Target.the("Campo de texto para la tarjeta de credito")
            .located(By.id("card"));

    public static final Target INP_MONTH = Target.the("Campo de texto para el mes")
            .located(By.id("month"));

    public static final Target INP_YEAR = Target.the("Campo de texto para el anio")
            .located(By.id("year"));

    public static final Target BTN_PURCHASE = Target.the("Botón de registro")
            .located(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));

    public static final Target ID_BUTTON = Target.the("Texto de boton")
            .located(By.xpath("//button[@tabindex='1' and text()='OK']"));
}
