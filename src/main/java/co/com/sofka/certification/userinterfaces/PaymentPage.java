package co.com.sofka.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentPage {

    public static final Target BUTTON_GO_TO_PAYMENT = Target.the("").located(By.xpath("//*[@text='Ir para el pagoContinuar']"));

    public static final Target CUSTOMER_INFORMATION = Target.the("").located(By.xpath("//*[@text='Datos del comprador']"));

    public static final Target DELIVERY_DATA = Target.the("").located(By.xpath("//*[@text='Entrega']"));

    //public static final Target PAYMENT_METHOD_TITLE = Target.the("").located(By.xpath("//*[@text='Método de pago']"));

    public static final Target SELECT_PAYMENT_METHOD = Target.the("").located(By.xpath("//android.view.View[@content-desc=\"PSE\"]"));

    //public static final Target FINALLY = Target.the("").located(By.id("orderform-title"));

}
