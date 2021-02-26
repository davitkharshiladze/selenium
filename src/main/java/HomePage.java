import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Page {

    @FindBy(css="ul li a[href='/upload']")
    public static  WebElement  fileUploadAnchor;

    @FindBy(css="ul li a[href='/shifting_content']")
    public  static WebElement  shiftingContentAnchor;

    @FindBy(css="ul li a[href='/challenging_dom']")
    private static  WebElement  challengingAnchor;


    public HomePage(WebDriver driver){
        super(driver);
        driver.get("http://the-internet.herokuapp.com");
        PageFactory.initElements(driver, this);
    }


    public UploadPage clickFileUploadLink(){
        fileUploadAnchor.click();
        return new UploadPage(driver);
    }


    public ShiftingContentPage clickShiftingContentLink(){
        shiftingContentAnchor.click();
        return new ShiftingContentPage(driver);
    }


    public  ChallengingDomPage clickChallengingDomLink(){
        challengingAnchor.click();
        return new ChallengingDomPage(driver);
    }






}
