package Steps;

import Pageobjects.BaseTest;
import Pageobjects.MainPage;
import Pageobjects.SignUpPage;

public class SignUp extends BaseTest {

    MainPage mainPage = new MainPage(getDriver());
    SignUpPage signUpPage = new SignUpPage(getDriver());

    public void navigateToSignUpForm() {
        mainPage.clickSignUpLink();
    }

    public void enterZipCode() {
        signUpPage.sendKeysZipCodeField("12345");
        signUpPage.clickContinueBtn();
    }

    public void enterMainData() {
        signUpPage.sendKeysFirstNameField("artem");
        signUpPage.sendKeysLastNameField("artem");
        signUpPage.sendKeysEmailField("artem@gmail.com");
        signUpPage.sendKeysPassword1Field("12345p");
        signUpPage.sendKeysPasswordField2("12345p");
        signUpPage.clickRegisterBtn();
    }

    public String checkConfMessage() {
        return signUpPage.getTextConfirmationMessage();
    }

    public String getEmail() {
        return mainPage.getEmailText();

    }

    public String getPassword() {
        return mainPage.getPasswordText();
    }
    public void navigateToMainpage() {
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
    }
    public void LogIn() {
        mainPage.EnterEmail(getEmail());
        mainPage.EnterPassword(getPassword());

    }

}
