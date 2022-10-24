package co.com.sofka.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SendKeys;

import static co.com.sofka.certification.userinterfaces.WhereReciveOrderPage.CITY_LABEL;

public class SelectCityTask implements Task {

    public String city;


    public SelectCityTask(){}

    public SelectCityTask(String city){
        this.city = city;
        System.out.println("ths city is: "+city);
    }

    public static SelectCityTask selectCity(String city){
        return new SelectCityTask(city);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String option = "//android.widget.Spinner[@text='"+city+"']";
        System.out.println("The option xpath is: "+option);
        actor.attemptsTo(

                Click.on(CITY_LABEL),
                Enter.theValue(city).into(CITY_LABEL),
                Click.on(CITY_LABEL)

        );

    }
}
