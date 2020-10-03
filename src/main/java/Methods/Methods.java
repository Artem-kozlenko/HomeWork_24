package Methods;

import org.openqa.selenium.WebDriver;
import Pageobjects.BasePage;

public class Methods extends BasePage {

    public Methods(WebDriver driver){

        super(driver);
    }
    public void Site(){
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
    }
}