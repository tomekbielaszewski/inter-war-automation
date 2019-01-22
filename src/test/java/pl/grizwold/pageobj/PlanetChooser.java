package pl.grizwold.pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.String.format;

public class PlanetChooser extends PageObject {
    private static final String PLANET_CHOOSER = "#planetSelector";
    private static final String PLANET_CHOOSER_OPTION = "#planetSelector > option:nth-child(%d)";

    public PlanetChooser(WebDriver $) {
        super($);
    }

    public void openPlanet(int planetNumber) {
        $.findElement(By.cssSelector(PLANET_CHOOSER)).click();
        $.findElement(By.cssSelector(format(PLANET_CHOOSER_OPTION, planetNumber))).click();
    }
}
