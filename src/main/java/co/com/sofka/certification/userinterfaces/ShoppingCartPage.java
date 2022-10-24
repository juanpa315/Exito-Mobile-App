package co.com.sofka.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartPage {
    public static final Target PRODUCT_TO_SHOP = Target.the("").located(By.xpath("//android.widget.GridView/android.view.View/android.view.View[2]"));
    public static final Target PAYMENT_BUTTON = Target.the("").located(By.xpath("//android.view.View[@content-desc=\"Ir a pagarFinalizar compra\"]"));


}
