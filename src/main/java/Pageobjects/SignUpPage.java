package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement ZipCode;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement ContinueBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")
    private WebElement FirstName;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement LastName;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement Email;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")
    private WebElement Password;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")
    private WebElement ConfPassword;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input")
    private WebElement RegisterBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[4]/td/span")
    private WebElement ConfMessage;

    public SignUpPage(WebDriver driver) {
        super(driver);

    }

    public void sendKeysZipCodeField(String a) {
        ZipCode.sendKeys(a);
    }

    public void clickContinueBtn() {
        ContinueBtn.click();
    }

    public void sendKeysFirstNameField(String a) {
        FirstName.sendKeys(a);
    }

    public void sendKeysLastNameField(String a) {
        LastName.sendKeys(a);
    }

    public void sendKeysEmailField(String a) {
        Email.sendKeys(a);
    }

    public void sendKeysPassword1Field(String a) {
        Password.sendKeys(a);
    }

    public void sendKeysPasswordField2(String a) {
        ConfPassword.sendKeys(a);
    }

    public void clickRegisterBtn() {
        RegisterBtn.click();
    }

    public String getTextConfirmationMessage() {
        return ConfMessage.getText();
    }

}

