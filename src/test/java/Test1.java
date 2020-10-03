import Steps.SignUp;
import org.junit.Assert;
import org.junit.Test;
import Pageobjects.BaseTest;

public class Test1 extends BaseTest {

    SignUp su = new SignUp();

    @Test
    public void signUp() throws Exception {
        su.navigateToSignUpForm();
        su.enterZipCode();
        su.enterMainData();
        Assert.assertEquals("Account is created!", su.checkConfMessage());
        su.navigateToMainpage();
        su.LogIn();
    }


}
