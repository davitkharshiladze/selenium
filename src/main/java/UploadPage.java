import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage extends Page {

    @FindBy(id="file-upload")
    public static WebElement chooseFileBtn;

    @FindBy(id="file-submit")
    public  static WebElement  uploadBtn;

    @FindBy(css=".example h3")
    private static  WebElement StatusHeading;

    public UploadPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void Upload(String path) {

        chooseFileBtn.sendKeys(path);
        uploadBtn.click();


    }

    public boolean isUploaded() {
        return StatusHeading.getText().equals("File Uploaded!");
    }

    //public String getmess() {return StatusHeading.getText();}
}


