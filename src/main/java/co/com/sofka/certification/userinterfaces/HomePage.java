package co.com.sofka.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target WHRE_RECIVE_ORDER = Target.the("Button access to Make a payment functionality").located(By.id("com.exito.appcompania:id/appCompaTextView_address"));
    public static final Target SEARCH_BAR = Target.the("").located(By.id("com.exito.appcompania:id/appCompatEditText_search_bar"));

    public static final Target SHOPPING_CART = Target.the("").located(By.id("com.exito.appcompania:id/appCompatImageView_shopping_cart"));
    public static final Target SHOPPING_CART2 = Target.the("").located(By.id("com.exito.appcompania:id/imageButton_cart"));


}
