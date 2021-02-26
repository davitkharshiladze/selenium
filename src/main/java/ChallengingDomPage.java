import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class ChallengingDomPage extends Page{

    private static final By firstTr = By.cssSelector("table tbody tr");


    public ChallengingDomPage(WebDriver driver){
        super(driver);
    }

    public List<String> GetFirstRowValues () {

        var  tds = driver.findElement(firstTr).findElements(By.xpath("td[not(a)]"));

        var rowValues = new ArrayList<String>() ;

        for (var td : tds) {
            rowValues.add(td.getText());
        }

        return rowValues;
    }

}
