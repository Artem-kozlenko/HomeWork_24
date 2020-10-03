package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a")
    private WebElement SignUp;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input")
    private WebElement Login;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input")
    private WebElement Email;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input")
    private WebElement Password;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")
    private WebElement generatedEmail;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]")
    private WebElement generatedPassword;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[2]/span")
    private WebElement name;


    public void clickLoginBtn() {
        Login.click();
    }

    public void clickSignUpLink() {
        SignUp.click();
    }

    public void sendKeysEmailField(String a) {
        Email.sendKeys(a);
    }

    public void sendKeysPasswordField(String a) {
        Password.sendKeys(a);
    }
    public String getPasswordText(){
        return generatedPassword.getText();
    }

    public String getEmailText(){
        return generatedEmail.getText();
    }

    public void EnterEmail(String a) {
        Email.sendKeys(a);
    }

    public void EnterPassword(String a) {
        Password.sendKeys(a);
    }
}


