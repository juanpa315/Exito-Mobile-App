package co.com.sofka.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.HashMap;
import java.util.Map;

import static co.com.sofka.certification.interactions.SwipeUpInteraction.scrollFromArea;
import static co.com.sofka.certification.userinterfaces.PaymentPage.SELECT_PAYMENT_METHOD;

public class SelectPaymentMethodTask implements Task {




    public static SelectPaymentMethodTask validateShop(){
        return new SelectPaymentMethodTask();
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, Integer> scrollArea = new HashMap<>();
        scrollArea.put("left", 500);
        scrollArea.put("top", 200);
        scrollArea.put("width", 100);
        scrollArea.put("height", 1600);

        actor.attemptsTo(
                scrollFromArea()
                        .withScrollArea(scrollArea)
                        .inDirection("down")
                        .andSpeed(10000.0)
                        .andPercent(1.0),
                Click.on(SELECT_PAYMENT_METHOD));
    }
}
