package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class LoginPageObjects extends PageObject {
    By llbLogin = By.id("login2");
    By txtUserName = By.id("loginusername");
    By txtPassword = By.id("loginpassword");
    By btnLogIn = By.xpath("//button[contains(.,'Log in')]");
    By msjValidar = By.xpath("//a[contains(.,'Welcome EliteUser')]");
    By lnkCelular = By.xpath("//h4/a[contains(.,'Samsung galaxy s6')]");

    public By getLlbLogin() {
        return llbLogin;
    }

    public By getTxtUserName() {
        return txtUserName;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnLogIn() {
        return btnLogIn;
    }

    public By getMsjValidar() {
        return msjValidar;
    }

    public By getLnkCelular() {
        return lnkCelular;
    }
}
