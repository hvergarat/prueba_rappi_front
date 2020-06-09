package co.com.pruebatecnica.controller;

import co.com.pruebatecnica.exceptions.WebActionsException;
import co.com.pruebatecnica.generalactions.WebAction;
import co.com.pruebatecnica.pages.PageFormularioComra;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.PageFactory;


public class ControllerFormularioCompra {

    private PageFormularioComra pageFormularioComra;


    public void llenarFormularioCompra(WebAction action) {
        Faker faker = new Faker();
        pageFormularioComra = PageFactory.initElements(action.getDriver(), PageFormularioComra.class);
        try {
            pageFormularioComra.ingresarNombre(action.getDriver(), faker.name().fullName());
            pageFormularioComra.ingresarPais(action.getDriver(), faker.country().name());
            pageFormularioComra.ingresarCiudad(action.getDriver(), faker.country().capital());
            pageFormularioComra.ingresarTarjetaCredito(action.getDriver(), faker.business().creditCardNumber());
            pageFormularioComra.ingresarMes(action.getDriver(), "Septiembre");
            pageFormularioComra.ingresarAnio(action.getDriver(), "2022");
            pageFormularioComra.clicBtnPurchase(action.getDriver());
        } catch (WebActionsException e) {
            System.out.println(e);
        }
    }

    public Boolean mensajeCompraVisible(WebAction action) {
        return pageFormularioComra.mensajeCompra(action.getDriver());
    }

}
