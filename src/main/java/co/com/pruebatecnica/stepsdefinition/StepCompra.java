package co.com.pruebatecnica.stepsdefinition;

import co.com.pruebatecnica.controller.ControllerAgregarEquipo;
import co.com.pruebatecnica.controller.ControllerFormularioCompra;
import co.com.pruebatecnica.controller.ControllerPrepararBrowser;
import co.com.pruebatecnica.generalactions.WebAction;
import co.com.pruebatecnica.logs.Log;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;


import java.nio.file.Paths;

public class StepCompra {
    public static WebAction action;
    private ControllerFormularioCompra controllerFormularioCompra;

    @Before
    public void inicio() {
        action = new WebAction();
    }

    @After
    public void finPrueba() {
        action.closeBrowser();
    }

    @Given("^que (.*?) ingresa a la platorma de compras$")
    public void queIngresaALaPlatormaDeCompras(String actor) {
        Log.initLogs(Paths.get(System.getProperty("user.dir"), "EVIDENCIAS"), "COMPRAR");
        Log.LOGGER.info("**********************************************************************");
        Log.LOGGER.info("************************ Inicio prueba********************************");
        ControllerPrepararBrowser controllerPrepararBrowser = new ControllerPrepararBrowser();
        controllerPrepararBrowser.iniciarNavegador(action);
        Log.LOGGER.info("Se ha cargado el navegador correctamente");
    }

    @When("^busque un articulo para comprar$")
    public void busqueUnArticuloParaComprar() {
        ControllerAgregarEquipo controllerAgregarEquipo = new ControllerAgregarEquipo();
        controllerAgregarEquipo.agregarEquipoAlCarrito(action);
        Log.LOGGER.info("Se agrego correctamente el articulo al carrito");
    }

    @And("llene el formulario y termine la compra")
    public void lleneElFormularioYTermineLaCompra() {
        controllerFormularioCompra = new ControllerFormularioCompra();
        controllerFormularioCompra.llenarFormularioCompra(action);
        Log.LOGGER.info("Se finalizado el proceso de compra");
    }

    @Then("la compra sera exitosa")
    public void laCompraSeraExitosa() {
        Assert.assertTrue("No llego mensaje de compra", controllerFormularioCompra.mensajeCompraVisible(action));
        Log.LOGGER.info("************************ Prueba Finalizada ********************************");
    }
}
