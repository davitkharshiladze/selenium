import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestCase {
    public static WebDriver driver;

    @BeforeTest
    public void initializeWebDriver() {
        driver = new ChromeDriver();
    }

    @Test
    public void checkUploadFunctionality() {
        var homePage = new HomePage(driver);
        var fileUploadPage = homePage.clickFileUploadLink();
        fileUploadPage.Upload("E:\\newhtml.html");
        Assert.assertTrue(fileUploadPage.isUploaded());
    }

    @Test
    public void verifyMenuStyleChange() {
        var homePage = new HomePage(driver);
        var shiftingPage = homePage.clickShiftingContentLink();
        var menuPage = shiftingPage.clickMenuLink();
        var cssValue = menuPage.getHomeBtnCssValue();
        var cssValueOnHover = menuPage.getHomeBtnCssValueOnHover();
        Assert.assertNotEquals(cssValue,cssValueOnHover);

    }

    @Test
    public void verifyImagePositionChange() {
        var homePage = new HomePage(driver);
        Assert.assertTrue(homePage.clickShiftingContentLink().
                                    clickImageLink().
                                    ChangeImagePosition());

    }

    @Test
    public void checkIfTableFirstRowValuesEndsWithZero() {
        var homePage = new HomePage(driver);
        var challangingDomPage = homePage.clickChallengingDomLink();
        var values = challangingDomPage.GetFirstRowValues();

        for(var val : values){
            Assert.assertEquals(val.substring(val.length() - 1), "0");
        }

    }
}