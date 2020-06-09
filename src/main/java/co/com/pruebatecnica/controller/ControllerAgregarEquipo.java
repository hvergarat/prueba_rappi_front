package co.com.pruebatecnica.controller;

import co.com.pruebatecnica.exceptions.WebActionsException;
import co.com.pruebatecnica.generalactions.WebAction;
import co.com.pruebatecnica.pages.PageInicio;
import org.openqa.selenium.support.PageFactory;

public class ControllerAgregarEquipo {

    public void agregarEquipoAlCarrito(WebAction action) {
        PageInicio pageInicio = PageFactory.initElements(action.getDriver(), PageInicio.class);
        try {
            pageInicio.clicLaptops(action.getDriver());
            pageInicio.clicLaptopDell(action.getDriver());
            pageInicio.clicBtnAddToCart(action.getDriver());
            pageInicio.clicPopup(action.getDriver());
            pageInicio.clicCarrito(action.getDriver());
            pageInicio.clicBtnPlaceOrder(action.getDriver());
        } catch (WebActionsException e) {
            System.out.println("Problemas con la interaccion de la pagina" + e);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
