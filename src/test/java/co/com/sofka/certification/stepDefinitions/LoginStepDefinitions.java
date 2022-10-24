package co.com.sofka.certification.stepDefinitions;


import co.com.sofka.certification.tasks.AceptAlertTask;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.Assert;


import static co.com.sofka.certification.tasks.AceptAlertTask.aceptAlertTask;
import static co.com.sofka.certification.tasks.LoginTask.Login;
import static co.com.sofka.certification.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginStepDefinitions {


    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }

    //Steps lo login successful

    @Given("{actor} makes click on the Ingresar Button")
    public void heMakesClickOnTheIngresarButton(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_INGRESAR, isVisible()),
                Click.on(BTN_INGRESAR)
        );
    }

    @When("{actor} access to the exito application with email {string} and Password {string}")
    public void iAccessToTheExitoApplicationWithUserAndPassword(Actor actor, String withUser, String andPassword) {
        actor.attemptsTo(
                Login(withUser, andPassword)
        );
    }

    @And("{actor} allows to access device location")
    public void heAllowsToAccessDeviceLocation(Actor actor) {
        actor.attemptsTo(
                aceptAlertTask()
        );
    }

    @Then("{actor} can login successfully on the exito application")
    public void theActorCanLoginSuccessfullyOnTheExitoApplication(Actor actor) {


        actor.attemptsTo(
                Ensure.that(HELLO_TEXT).isDisplayed()

        );

    }


}

