package co.com.sofka.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WhereReciveOrderPage {

    public static final Target COLLECT_AND_BUY = Target.the("Button access to Make a payment functionality").located(By.id("com.exito.appcompania:id/appCompatTextView_buy_and_collect_title"));
    public static final Target CITY_LABEL = Target.the("Label to select a city").located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_city"));
    public static final Target STORE_LABEL= Target.the("Label to select a store").located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_store"));
    public static final Target CONTINUE_BUTTON = Target.the("Button access to Make a payment functionality").located(By.id("com.exito.appcompania:id/appCompatButton_continue"));
public static final Target SPINNER_LIST = Target.the("Spinner").located(By.xpath("//android.widget.TextView"));
    public static final Target CHOOSE_NEW_STORE = Target.the("").located(By.id("com.exito.appcompania:id/appCompatTextView_new_store"));
}
