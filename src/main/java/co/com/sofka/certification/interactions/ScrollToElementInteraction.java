package co.com.sofka.certification.interactions;

import com.google.common.collect.ImmutableMap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.DriverTask;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class ScrollToElementInteraction implements Interaction {
    private Target toTarget;
    private Map<String, Integer> scrollArea;
    private Double percent;
    private String direction;
    private Double speed;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                scrollToElement(actor)
        );
    }

    public static ScrollToElementInteraction scrollToElement() {
        return new ScrollToElementInteraction();
    }

    private Performable scrollToElement(Actor actor) {
        return new DriverTask(
                webDriver -> {
                    boolean scrolling = true;
                    boolean targetNotVisible = !toTarget.isVisibleFor(actor);

                    while (targetNotVisible && scrolling) {
                        scrolling = scrollToLookForElement(webDriver);
                        targetNotVisible = !toTarget.isVisibleFor(actor);
                    }
                }
        );
    }

    private Boolean scrollToLookForElement(WebDriver driver) {
        return (Boolean) ((JavascriptExecutor) driver)
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

    public ScrollToElementInteraction lookingFor(Target target) {
        //scroll until the element is found
        this.toTarget = target;
        return this;
    }

    public ScrollToElementInteraction withScrollArea(Map<String, Integer> scrollArea) {
        this.scrollArea = scrollArea;
        return this;
    }

    public ScrollToElementInteraction andPercent(Double percent) {
        this.percent = percent;
        return this;
    }

    public ScrollToElementInteraction inDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public ScrollToElementInteraction andSpeed(Double speed) {
        this.speed = speed;
        return this;
    }

}
