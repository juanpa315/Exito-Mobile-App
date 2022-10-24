package co.com.sofka.certification.interactions;

import co.com.sofka.certification.utils.ShareAppiumDriver;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Optional;


public class SelectSpinnerInteraction implements Interaction {
    private final String name;
    private final Target target;

    public SelectSpinnerInteraction(String name, Target target){
        this.name=name;
        this.target=target;
    }

    public static SelectSpinnerInteraction SelectOption(String name, Target target){
        return new SelectSpinnerInteraction(name, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ShareAppiumDriver.getDriver().setSetting("enableMultiWindows",true);

        Optional<WebElementFacade> listOptions = target.resolveAllFor(actor).stream().filter(e -> e.getText().equals(name)).findFirst();

        if(listOptions.isPresent()) {
            listOptions.get().click();
            ShareAppiumDriver.getDriver().setSetting("enableMultiWindows",false);
        }else {
            System.out.println("The option is not present on the optionList");
        }
    }
}
