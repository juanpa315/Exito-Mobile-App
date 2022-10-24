package co.com.sofka.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;


import static co.com.sofka.certification.userinterfaces.LoginPage.*;


public class LoginTask implements Task {

    private String username;
    private String password;

    public LoginTask() {}

    public LoginTask(String username, String password){
        this.username = username;
        this.password = password;
    }

    public static LoginTask Login(String username, String password) {

        return new LoginTask(username, password);
    }

    @Override
    @Step("{0} makes to login successful")
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            SendKeys.of(username).into(EMAIL),
            SendKeys.of(password).into(PASSWORD),
            Click.on(ENTER_BUTTON)
    );


    }
}
