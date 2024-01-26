package PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoPageObjects extends PageObject {

     By btnPlaceOrder = By.xpath("//button[@class='btn btn-success']");
     By txtName = By.id("name");
     By txtCountry = By.id("country");
     By txtCity = By.id("city");
     By txtCreditCar = By.id("card");
     By txtMonth =By.id("month");
     By txtYear = By.id("year");
     By btnPurchase = By.xpath("//button[@onclick='purchaseOrder()']");
     By msjValidarMensaje = By.xpath("//h2[contains(.,'Thank you for your purchase')]");

    public By getBtnPlaceOrder() {
        return btnPlaceOrder;
    }

    public By getTxtName() {
        return txtName;
    }

    public By getTxtCountry() {
        return txtCountry;
    }

    public By getTxtCity() {
        return txtCity;
    }

    public By getTxtCreditCar() {
        return txtCreditCar;
    }

    public By getTxtMonth() {
        return txtMonth;
    }

    public By getTxtYear() {
        return txtYear;
    }

    public By getBtnPurchase() {
        return btnPurchase;
    }

    public By getMsjValidarMensaje() {
        return msjValidarMensaje;
    }
}
