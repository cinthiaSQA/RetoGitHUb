package Step;

import PageObjects.CarritoPageObjects;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;

import static org.junit.Assert.assertThat;

public class CarritoSteps {
    CarritoPageObjects carritoPageObjects =new CarritoPageObjects();

    @Step
    public void clickPlaceOrder(){
        carritoPageObjects.getDriver().findElement(carritoPageObjects.getBtnPlaceOrder()).click();

    }
    @Step
    public void digitarName(){
        carritoPageObjects.getDriver().findElement(carritoPageObjects.getTxtName()).sendKeys("Cinthia");

    }
 @Step
    public void digitarCountry(){
        carritoPageObjects.getDriver().findElement(carritoPageObjects.getTxtCountry()).sendKeys("Colombia");

 }
 @Step
    public void digitarCity(){
        carritoPageObjects.getDriver().findElement(carritoPageObjects.getTxtCity()).sendKeys("Medellin");

 }
 @Step
    public  void digitarCerditCard(){
        carritoPageObjects.getDriver().findElement(carritoPageObjects.getTxtCreditCar()).sendKeys("1234536");
 }

 @Step
    public void digitarMonth(){
        carritoPageObjects.getDriver().findElement(carritoPageObjects.getTxtMonth()).sendKeys("Enero");
 }

 @Step
    public void digitarYear(){
        carritoPageObjects.getDriver().findElement(carritoPageObjects.getTxtYear()).sendKeys("2021");
 }
 @Step
    public void clickPurchase(){
        carritoPageObjects.getDriver().findElement(carritoPageObjects.getBtnPurchase()).click();
 }

 @Step
    public void validacionMensaje(){
     assertThat(carritoPageObjects.getDriver().findElement(carritoPageObjects.getMsjValidarMensaje()).isDisplayed(), Matchers.is(true));
    }
}
