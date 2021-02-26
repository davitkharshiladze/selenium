import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MenuPage extends Page {

    @FindBy(linkText="Home")
    public static  WebElement  homeButton;

    public MenuPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getHomeBtnCssValue(){
        return homeButton.getCssValue("color");
    }

    public String getHomeBtnCssValueOnHover(){
        actions.moveToElement(homeButton).perform();
        return homeButton.getCssValue("color");

    }


}
