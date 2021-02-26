import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShiftingContentPage {

    private WebDriver driver;

    @FindBy(css="a[href='/shifting_content/menu']")
    public static WebElement menuAnchor;

    @FindBy(css="a[href='/shifting_content/image']")
    public static WebElement  imageAnchor;



    public ShiftingContentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MenuPage clickMenuLink () {
         menuAnchor.click();
         return new MenuPage(driver);
    }


    public ImagePage clickImageLink() {
        imageAnchor.click();
        return new ImagePage(driver);
    }


}
