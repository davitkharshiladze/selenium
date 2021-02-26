import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
     public static void main(String[] args) {

         var driver  = new ChromeDriver();

         var homePage = new HomePage(driver);
         var uploadPage =  homePage.clickFileUploadLink();
         uploadPage.Upload("E:\\newhtml.html");
         System.out.println(uploadPage.isUploaded());

         homePage.SetDefaultLocation();


         var menuPage = homePage.clickShiftingContentLink().clickMenuLink();
         var cssValue = menuPage.getHomeBtnCssValue();
         var cssValueOnHover = menuPage.getHomeBtnCssValueOnHover();
         System.out.println(cssValue);
         System.out.println(cssValueOnHover);


    }
}
