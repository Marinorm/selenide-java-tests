package internet.pages;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.commands.SetValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.files.DownloadActions.click;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;
import static sun.rmi.rmic.Main.getText;

public class LoginPage {
    public String getUrl() {
        return ("/login");

    }

    public void fillUsername(String username) {
        Selenide.$("input#username");.SetValue();

    return this;

    }

    public void fillPassword(String password) {
        Selenide.$("input#password");.SetValue();
    return this;

    }

    public LoginPage clickElement() {
        Selenide.$("button");.click();
return this;

    }
    public String getResultText() {
        return Selenide.$(".subheader")).getText();

    }



    }





