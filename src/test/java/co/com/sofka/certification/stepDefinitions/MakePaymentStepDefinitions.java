package co.com.sofka.certification.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.certification.tasks.SelectPaymentMethodTask.validateShop;
import static co.com.sofka.certification.tasks.ValidateProductsCartTask.validateProductsShoppingCart;
import static co.com.sofka.certification.userinterfaces.PaymentPage.*;
import static co.com.sofka.certification.userinterfaces.ShoppingCartPage.PAYMENT_BUTTON;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MakePaymentStepDefinitions {
    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }
    @Given("{actor} has pending products to pay")
    public void heHasPendingProductsToPay(Actor actor) {
        actor.attemptsTo(
                validateProductsShoppingCart()
        );
    }
    @When("{actor} makes click on the pay button")
    public void heMakesClickOnThePayButton(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(PAYMENT_BUTTON, isVisible()),
                Click.on(PAYMENT_BUTTON)
        );
    }
    @And("{actor} checks the payment information")
    public void heChecksThePaymentInformation(Actor actor) {
        actor.attemptsTo(
                Ensure.that(CUSTOMER_INFORMATION).isDisplayed(),
                Ensure.that(DELIVERY_DATA).isDisplayed()
        );
    }
    @And("{actor} makes click on the continue button")
    public void heMakesClickOnTheContinueButton(Actor actor) {
        actor.attemptsTo(
                Click.on(BUTTON_GO_TO_PAYMENT)
        );
    }
    @Then("The system allows {actor} to select the payment method")
    public void theSystemAllowsHeToSelectThePaymentMethod(Actor actor) {
        actor.attemptsTo(
                validateShop()
        );
    }
}
