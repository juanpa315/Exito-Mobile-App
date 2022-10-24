package co.com.sofka.certification.stepDefinitions;

import co.com.sofka.certification.tasks.AddProductShoppingCartTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.certification.tasks.AddProductShoppingCartTask.AddProductShoppingCart;
import static co.com.sofka.certification.tasks.SearchProductTask.searchProduct;
import static co.com.sofka.certification.userinterfaces.HomePage.SHOPPING_CART;
import static co.com.sofka.certification.userinterfaces.SearchResultsPage.PRODUCT;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class MakePurchaseStepDefinitions {

    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }

    @When("{actor} searches for a product {string} in the search bar of the app")
    public void juanSearchesForAProductInTheSearchBarOfTheApp(Actor actor, String product) {
        actor.attemptsTo(
             searchProduct(product)
        );
    }
    @And("{actor} aggregate the product to the shopping cart")
    public void heAggregateTheProductToTheShoppingCar(Actor actor) {
        actor.attemptsTo(
                AddProductShoppingCart()
        );

    }
    @Then("{actor} can validate the product cost")
    public void heCanValidateTheProductCost(Actor actor) {
        actor.attemptsTo(
                Click.on(SHOPPING_CART),
                Ensure.that(PRODUCT).isDisplayed()
        );

    }
}
