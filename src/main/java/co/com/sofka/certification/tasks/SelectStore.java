package co.com.sofka.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

import static co.com.sofka.certification.userinterfaces.WhereReciveOrderPage.CITY_LABEL;
import static co.com.sofka.certification.userinterfaces.WhereReciveOrderPage.STORE_LABEL;

public class SelectStore implements Task {

    public String store;

    public SelectStore(){}

    public SelectStore(String store){
        this.store = store;
    }

    public static SelectStore selectStore(String store){
        return new SelectStore(store);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(STORE_LABEL),
                Enter.theValue(store).into(STORE_LABEL),
                Click.on(STORE_LABEL)

        );
    }
}
