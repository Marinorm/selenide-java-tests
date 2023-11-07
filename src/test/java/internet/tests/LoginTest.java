package internet.tests;


import internet.BaseTest;
import internet.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void canLoginTest() {
    var loginPage = new LoginPage();
    var username = "tomsmith";
    var password = "SuperSecretPassword!";

visit (loginPage.getUrl());

loginPage
        .fillUsername (username);
        .fillPassword(password);

loginPage.clickElement();


var actualResultText = loginPage.getResultText();
var expectedResultText = "Welcome to the Secure Area. When you are done click logout below.";


Assert.assertEquals(actualResultText, expectedResultText);

    }


}


}
}
