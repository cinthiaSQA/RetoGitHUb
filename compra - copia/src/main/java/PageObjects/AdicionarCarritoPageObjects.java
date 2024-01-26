package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AdicionarCarritoPageObjects extends PageObject {
    By btnAddCart = By.xpath("//a[@class='btn btn-success btn-lg']");
    By lnkCart = By.id("cartur");



    public By getBtnAddCart() {
        return btnAddCart;
    }

    public By getLnkCart() {
        return lnkCart;
    }
}
