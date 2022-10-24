package co.com.sofka.certification.stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.certification.interactions.SelectSpinnerInteraction.SelectOption;
import static co.com.sofka.certification.tasks.SelectCityTask.selectCity;
import static co.com.sofka.certification.tasks.SelectStore.selectStore;
import static co.com.sofka.certification.userinterfaces.HomePage.*;
import static co.com.sofka.certification.userinterfaces.WhereReciveOrderPage.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WhereReceiveOrderStepDefinitions {

    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }


    @Given("{actor} makes click on the how do you want to receive your order option")
    public void heMakesClickOnTheHowDoYouWantToReceiveYourOrderOption(Actor actor) {
       actor.attemptsTo(
               Click.on(WHRE_RECIVE_ORDER)
       );
    }
    @And("{actor} select buy and collect option")
    public void heSelectBuyAndCollectOption(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(COLLECT_AND_BUY, isVisible()),
                Click.on(COLLECT_AND_BUY)
        );
    }
    @When("{actor} select a city {string}")
    public void actorSelectACity(Actor actor, String city) {

        if(CHOOSE_NEW_STORE.isVisibleFor(actor)){
            actor.attemptsTo(
                    Click.on(CHOOSE_NEW_STORE),
                    Click.on(CITY_LABEL).then(SelectOption(city,SPINNER_LIST))
            );
        }else {
            actor.attemptsTo(
                    Click.on(CITY_LABEL).then(SelectOption(city,SPINNER_LIST))

            );
        }

    }
    @And("{actor} select a store {string}")
    public void heSelectAStore(Actor actor, String store) {
        actor.attemptsTo(
                Click.on(STORE_LABEL).then(SelectOption(store,SPINNER_LIST))
        );
    }
    @Then("The system allows {actor} makes click on the Continuar button")
    public void theSystemAllowsJuanMakesClickOnTheContinuarButton(Actor actor) {
        actor.attemptsTo(
                Click.on(CONTINUE_BUTTON)
        );
    }
}
