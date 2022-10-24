package co.com.sofka.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.certification.userinterfaces.SearchResultsPage.CARD_BUTTON;

public class AddProductShoppingCartTask implements Task {



    public static AddProductShoppingCartTask AddProductShoppingCart(){
        return new AddProductShoppingCartTask();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CARD_BUTTON)
        );
    }
}
