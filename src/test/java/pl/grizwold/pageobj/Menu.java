package pl.grizwold.pageobj;

import org.openqa.selenium.WebDriver;

public class Menu extends PageObject {

    public Menu(WebDriver $) {
        super($);
    }

    public void buildings() {
        open("buildings");
    }

    public Fleet1 fleet() {
        open("fleet");
        return new Fleet1(this.$);
    }

    public Messages messages() {
        open("n_messages");
        return new Messages($);
    }
}
