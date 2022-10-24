package co.com.sofka.certification.utils;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.webdriver.WebDriverFacade;

public class ShareAppiumDriver {

    public static AppiumDriver getDriver(){
        return (AppiumDriver) ((WebDriverFacade) Serenity.getDriver()).getProxiedDriver();
    }
}
