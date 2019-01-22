package pl.grizwold.steps;

import org.hamcrest.core.Is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertThat;

public abstract class Abstract {
    private static final String LOGIN_URL = "http://inter-war.com.pl/index.php";
    private static final String LOGIN_INPUT = "#username";
    private static final String PASS_INPUT = "#password";
    private static final String LOGIN_SUBMIT = "#login > input[type=\"image\"]";

    protected WebDriver $;

    public Abstract() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36");
        this.$ = new ChromeDriver(options);
        this.$.manage().window().maximize();
    }

    public Abstract openOgame() {
        $.get(LOGIN_URL);
        return this;
    }

    public Abstract login(String login, String password) {
        assertThat($.getCurrentUrl(), Is.is(LOGIN_URL));
        $.findElement(By.cssSelector(LOGIN_INPUT)).sendKeys(login);
        $.findElement(By.cssSelector(PASS_INPUT)).sendKeys(password);
        $.findElement(By.cssSelector(LOGIN_SUBMIT)).click();
        return this;
    }
}
