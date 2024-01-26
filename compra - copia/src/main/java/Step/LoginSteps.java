package Step;

import PageObjects.LoginPageObjects;


import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.openqa.selenium.Alert;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class LoginSteps {
    LoginPageObjects loginPageObjects = new LoginPageObjects();


    @Step
    public void abrirNavegador() {
        loginPageObjects.open();

    }

    @Step
    public void clickSingin() {
        loginPageObjects.getDriver().findElement(loginPageObjects.getLlbLogin()).click();

    }

    @Step
    public void ingresarUserName(String nombre) {
        loginPageObjects.getDriver().findElement(loginPageObjects.getTxtUserName()).sendKeys(nombre);

    }

    @Step
    public void ingresarPassword(String clave) {
        loginPageObjects.getDriver().findElement(loginPageObjects.getTxtPassword()).sendKeys(clave);

    }

    @Step
    public void clickBoton() {
        loginPageObjects.getDriver().findElement(loginPageObjects.getBtnLogIn()).click();

    }

    @Step
    public void validarUsuario() {
        assertThat(loginPageObjects.getDriver().findElement(loginPageObjects.getMsjValidar()).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void validarAlerta() throws InterruptedException {
        Thread.sleep(2000);
        Alert alerta =  loginPageObjects.getDriver().switchTo().alert();
        String mensaje =alerta.getText();
        System.out.println(mensaje);
        alerta.accept();
        assertEquals("User does not exist.", mensaje);

    }
    @Step
    public void seleccionarCelular(){
        loginPageObjects.getDriver().findElement(loginPageObjects.getLnkCelular()).click();

    }

  @Step
    public void ingresarDatosExcel() throws IOException {


  }

}


