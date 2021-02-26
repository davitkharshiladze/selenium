import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImagePage extends Page{

    @FindBy(css="div#content img")
    public static WebElement image;

    @FindBy(css="div.example p+p+p a")
    public  static WebElement shiftAnchor;

    public ImagePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean ChangeImagePosition(){
        var beforeClickPosition = image.getLocation();
        shiftAnchor.click();
        var afterClickPosition = image.getLocation();

        return beforeClickPosition.x != afterClickPosition.x || beforeClickPosition.y != afterClickPosition.y;

    }

}
