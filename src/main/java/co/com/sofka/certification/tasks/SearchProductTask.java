package co.com.sofka.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.sofka.certification.userinterfaces.HomePage.SEARCH_BAR;
import static co.com.sofka.certification.userinterfaces.SearchResultsPage.SEARCH_BAR_RESUME;
import static co.com.sofka.certification.userinterfaces.SearchResultsPage.SEARCH_ICON;

public class SearchProductTask implements Task {

    private String product;

    public SearchProductTask(){}

    public SearchProductTask(String product) {
    this.product=product;
        System.out.println("The product is: "+product);
    }

    public static SearchProductTask searchProduct(String product){
        return new SearchProductTask(product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SEARCH_BAR),
                Enter.theValue(product).into(SEARCH_BAR_RESUME),
                Click.on(SEARCH_ICON)
        );
    }
}
