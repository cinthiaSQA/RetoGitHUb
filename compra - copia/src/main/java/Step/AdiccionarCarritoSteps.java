package Step;

import PageObjects.AdicionarCarritoPageObjects;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Alert;

public class AdiccionarCarritoSteps {
    AdicionarCarritoPageObjects adicionarCarritoPageObjects =new AdicionarCarritoPageObjects();

    @Step
    public void clickAgregarCarrito(){
        adicionarCarritoPageObjects.getDriver().findElement(adicionarCarritoPageObjects.getBtnAddCart()).click();

    }
    @Step
    public void clickAlerta() throws InterruptedException {

        Thread.sleep(3000);
        Alert alert = adicionarCarritoPageObjects.getDriver().switchTo().alert();
        alert.accept();
    }

    @Step
    public void clickCart(){

        adicionarCarritoPageObjects.getDriver().findElement(adicionarCarritoPageObjects.getLnkCart()).click();
    }



}
