package pl.grizwold.pageobj;

import org.openqa.selenium.WebDriver;

public abstract class PageObject {
    protected static final String BASE = "http://inter-war.com.pl/game.php?page=";
    protected final WebDriver $;

    public PageObject(WebDriver $) {
        this.$ = $;
    }

    public PageObject open(String page) {
        $.get(BASE + page);
        return this;
    }
}
