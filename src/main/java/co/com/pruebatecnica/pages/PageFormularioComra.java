package co.com.pruebatecnica.pages;

import co.com.pruebatecnica.exceptions.WebActionsException;
import co.com.pruebatecnica.generalactions.WebAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFormularioComra {
    @FindBy(how = How.ID, using = "name")
    WebElement NAME_INPUT;

    @FindBy(how = How.ID, using = "country")
    WebElement COUNTRY_INPUT;

    @FindBy(how = How.XPATH, using = "//input[@id='city']")
    WebElement CITY_INPUT;

    @FindBy(how = How.XPATH, using = "//input[@id='card']")
    WebElement CREDIT_CARD_INPUT;

    @FindBy(how = How.XPATH, using = "//input[@id='month']")
    WebElement MONTH_INPUT;

    @FindBy(how = How.XPATH, using = "//input[@id='year']")
    WebElement YEAR_INPUT;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Purchase')]")
    WebElement PURCHASE_BTN;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Thank you for your purchase!')]")
    WebElement MENSAJE_COMPRA_LBL;

    @FindBy(how = How.XPATH, using = "//button[@class='confirm btn btn-lg btn-primary']")
    WebElement OK_BTN;

    public void ingresarNombre(WebDriver driver, String nombre) throws WebActionsException {
        WebAction action = new WebAction();
        action.setDriver(driver);
        action.sendText(NAME_INPUT, nombre, 60);
    }

    public void ingresarPais(WebDriver driver, String pais) throws WebActionsException {
        WebAction action = new WebAction();
        action.setDriver(driver);
        action.sendText(COUNTRY_INPUT, pais, 60);
    }

    public void ingresarCiudad(WebDriver driver, String ciudad) throws WebActionsException {
        WebAction action = new WebAction();
        action.setDriver(driver);
        action.sendText(CITY_INPUT, ciudad, 60);
    }

    public void ingresarTarjetaCredito(WebDriver driver, String tarjetaCredito) throws WebActionsException {
        WebAction action = new WebAction();
        action.setDriver(driver);
        action.sendText(CREDIT_CARD_INPUT, tarjetaCredito, 60);
    }

    public void ingresarMes(WebDriver driver, String mes) throws WebActionsException {
        WebAction action = new WebAction();
        action.setDriver(driver);
        action.sendText(MONTH_INPUT, mes, 60);
    }

    public void ingresarAnio(WebDriver driver, String anio) throws WebActionsException {
        WebAction action = new WebAction();
        action.setDriver(driver);
        action.sendText(YEAR_INPUT, anio, 60);
    }

    public void clicBtnPurchase(WebDriver driver) throws WebActionsException {
        WebAction action = new WebAction();
        action.setDriver(driver);
        action.click(PURCHASE_BTN, 60);
    }

    public Boolean mensajeCompra(WebDriver driver) {
        WebAction action = new WebAction();
        action.setDriver(driver);
        return action.isVisible(MENSAJE_COMPRA_LBL,60);
    }


}
