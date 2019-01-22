package pl.grizwold.pageobj;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Buildings extends PageObject {
    private static final String PAGE = "buildings";

    public Buildings(WebDriver $) {
        super($);
    }

    public Buildings open() {
        return (Buildings) super.open(PAGE);
    }

    public boolean canBuild(String buildingName) {
        return false;
    }

    public int getLevel(String buildingName) {
        return 0;
    }

    public boolean isQueueActive() {
        return false;
    }

    private void validateState() {
        assertTrue($.getCurrentUrl().contains(PAGE));
        assertFalse($.getCurrentUrl().contains("mode=research"));
        assertFalse($.getCurrentUrl().contains("mode=defense"));
        assertFalse($.getCurrentUrl().contains("mode=fleet"));
        assertFalse($.getCurrentUrl().contains("mode=kapitol"));
    }
}
