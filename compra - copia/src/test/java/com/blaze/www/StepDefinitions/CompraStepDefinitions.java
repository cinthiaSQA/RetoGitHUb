package com.blaze.www.StepDefinitions;

import Step.AdiccionarCarritoSteps;
import Step.CarritoSteps;
import Step.LoginSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CompraStepDefinitions {


    @Steps
    LoginSteps loginSteps;
    @Steps
    AdiccionarCarritoSteps adiccionarCarritoSteps;
    @Steps
    CarritoSteps carritoSteps;
    @When("^cuando selecciono el producto y lo adicciono al carrito de compras$")
    public void cuandoSeleccionoElProductoYLoAdiccionoAlCarritoDeCompras() throws InterruptedException {
        loginSteps.seleccionarCelular();
        adiccionarCarritoSteps.clickAgregarCarrito();
        adiccionarCarritoSteps.clickAlerta();
        adiccionarCarritoSteps.clickCart();
        carritoSteps.clickPlaceOrder();

    }


    @When("^lleno la informacion de registro$")
    public void llenoLaInformacionDeRegistro() {
        carritoSteps.digitarName();
        carritoSteps.digitarCountry();
        carritoSteps.digitarCity();
        carritoSteps.digitarCerditCard();
        carritoSteps.digitarMonth();
        carritoSteps.digitarYear();
        carritoSteps.clickPurchase();

    }

    @Then("^visualizo mensaje de compra exitosa$")
    public void visualizoMensajeDeCompraExitosa() {
        carritoSteps.validacionMensaje();

    }

}
