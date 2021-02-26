import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class Page {

    protected WebDriver driver;
    protected Actions actions;

    public Page(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }

    public void SetDefaultLocation() {
        driver.get("http://the-internet.herokuapp.com");
    }

}