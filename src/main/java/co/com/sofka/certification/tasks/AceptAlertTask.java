package co.com.sofka.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.lang.reflect.AccessibleObject;

import static co.com.sofka.certification.userinterfaces.LoginPage.ALLOWLOCATION;
import static co.com.sofka.certification.userinterfaces.LoginPage.LOCATIONALERT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AceptAlertTask implements Task {

    public AceptAlertTask(){}

    public static AceptAlertTask aceptAlertTask () {

        return new AceptAlertTask();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.the(LOCATIONALERT, isVisible()).forNoMoreThan(20);

        if (LOCATIONALERT.isVisibleFor(actor)){
            actor.attemptsTo(
                    Click.on(ALLOWLOCATION)

            );
        }else{
            System.out.println("Location alert no displayed");
        }
    }
}
