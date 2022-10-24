package co.com.sofka.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target BTN_INGRESAR = Target.the("button SIGN-IN").located(By.id("com.exito.appcompania:id/AppCompatButton_ingresar"));
    public static final Target EMAIL = Target.the("username of client").located(By.id("com.exito.appcompania:id/TextInputEditText_email"));
    public static final Target PASSWORD  = Target.the("password of client").located(By.xpath("//android.widget.EditText[@bounds='[66,965][1014,1097]']"));

    public static final Target ENTER_BUTTON  = Target.the("button for acces to the system").located(By.id("com.exito.appcompania:id/AppCompatButton_ingresar"));

    public static final Target HELLO_TEXT  = Target.the("Welcome text").located(By.id("com.exito.appcompania:id/textView_hello"));

    public static final Target LOCATIONALERT = Target.the("Alert about location permisions").located(By.id("com.android.permissioncontroller:id/content_container"));

    public static final Target ALLOWLOCATION = Target.the("option for allow location in the app").located(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));

    public static final Target LOGIN_FAILED_ALERT = Target.the("option for allow location in the app").located(By.id("com.exito.appcompania:id/AppCompatTextView_title"));
}


