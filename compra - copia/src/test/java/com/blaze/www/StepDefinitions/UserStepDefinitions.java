package com.blaze.www.StepDefinitions;
import Models.DatosInvalidos;
import Step.LoginSteps;
import Models.Datos;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class UserStepDefinitions {

    @Steps
    LoginSteps loginSteps;
    @Given("^thah user is in homepage$")
    public void thahUserIsInHomepage() {
        loginSteps.abrirNavegador();

    }

    @When("^clicking in log in option$")
    public void clickingInLogInOption() {
        loginSteps.clickSingin();

    }

    @When("^writting credentials$")
    public void writtingCredentials(List<Datos> cinthia) {
        loginSteps.ingresarUserName(cinthia.get(0).getUser());
        loginSteps.ingresarPassword(cinthia.get(0).getPassword());
        loginSteps.clickBoton();


    }

    @Then("^User will be able to see user profile succesfully$")
    public void userWillBeAbleToSeeUserProfileSuccesfully() {

        loginSteps.validarUsuario();
    }



    @When("^el usuario escribe credenciales invalidas$")
    public void elUsuarioEscribeCredencialesInvalidas(List<DatosInvalidos>datosInvalidos) {
        loginSteps.ingresarUserName(datosInvalidos.get(0).getUsuario());
        loginSteps.ingresarPassword(datosInvalidos.get(0).getClave());
        loginSteps.clickBoton();


    }


    @Then("^el usuario podra visualizar mensaje de error$")
    public void elUsuarioPodraVisualizarMensajeDeError() throws InterruptedException {
        loginSteps.validarAlerta();

    }

}

