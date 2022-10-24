package co.com.sofka.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchResultsPage {


    public static final Target CARD_BUTTON = Target.the("").located(By.xpath("//android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]"));
    public static final Target SEARCH_BAR_RESUME = Target.the("").located(By.id("com.exito.appcompania:id/appCompatEditText_search_data_edit"));
    public static final Target SEARCH_ICON= Target.the("").located(By.id("com.exito.appcompania:id/text_input_start_icon"));
    public static final Target PRODUCT = Target.the("").located(By.xpath("//android.view.View[3]/android.widget.TextView"));

}
