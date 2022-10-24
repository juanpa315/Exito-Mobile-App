package co.com.sofka.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.sofka.certification.userinterfaces.HomePage.SHOPPING_CART2;
import static co.com.sofka.certification.userinterfaces.ShoppingCartPage.PRODUCT_TO_SHOP;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateProductsCartTask implements Task {


    public static ValidateProductsCartTask validateProductsShoppingCart() {

        return new ValidateProductsCartTask();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SHOPPING_CART2),
                WaitUntil.the(PRODUCT_TO_SHOP,isVisible()).forNoMoreThan(30).seconds(),
                Ensure.that(PRODUCT_TO_SHOP).isDisplayed()
        );

    }
}
