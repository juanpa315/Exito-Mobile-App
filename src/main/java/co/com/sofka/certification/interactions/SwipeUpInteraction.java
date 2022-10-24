package co.com.sofka.certification.interactions;


import com.google.common.collect.ImmutableMap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.DriverTask;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Map;

public class SwipeUpInteraction implements Interaction {

    private Map<String, Integer> scrollArea;
    private Double percent;
    private String direction;
    private Double speed;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                scrollToArea()
        );
    }

    public static SwipeUpInteraction scrollFromArea() {
        return new SwipeUpInteraction();
    }


    private Performable scrollToArea() {
        return new DriverTask(
                driver -> {
                    ((JavascriptExecutor) driver)
                            .executeScript("mobile: scrollGesture",
                                    ImmutableMap.of(
                                            "left", scrollArea.get("left"),
                                            "top", scrollArea.get("top"),
                                            "width", scrollArea.get("width"),
                                            "height", scrollArea.get("height"),
                                            "direction", direction,
                                            "percent", percent,
                                            "speed", speed
                                    )
                            );
                }
        );
    }


    public SwipeUpInteraction withScrollArea(Map<String, Integer> scrollArea) {
        this.scrollArea = scrollArea;
        return this;
    }

    public SwipeUpInteraction andPercent(Double percent) {
        this.percent = percent;
        return this;
    }

    public SwipeUpInteraction inDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public SwipeUpInteraction andSpeed(Double speed) {
        this.speed = speed;
        return this;
    }
}
