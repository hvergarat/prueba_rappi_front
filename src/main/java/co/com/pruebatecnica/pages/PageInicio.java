package co.com.pruebatecnica.pages;

import co.com.pruebatecnica.exceptions.WebActionsException;
import co.com.pruebatecnica.generalactions.WebAction;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageInicio {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Laptops')]")
    WebElement LAPTOPS_LBL;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Dell i7 8gb')]")
    WebElement DELL_I7_LBL;

    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-success btn-lg']")
    WebElement ADD_TO_CART_BTN;

    @FindBy(how = How.ID, using = "cartur")
    WebElement CART_LBL;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-success']")
    WebElement PLACE_ORDER_BTN;

    public void clicLaptops(WebDriver driver) throws WebActionsException {
        WebAction action = new WebAction();
        action.setDriver(driver);
        action.click(LAPTOPS_LBL, 60);
    }

    public void clicLaptopDell(WebDriver driver) throws WebActionsException {
        WebAction action = new WebAction();
        action.setDriver(driver);
        action.click(DELL_I7_LBL, 60);
    }

    public void clicBtnAddToCart(WebDriver driver) throws WebActionsException {
        WebAction action = new WebAction();
        action.setDriver(driver);
        action.click(ADD_TO_CART_BTN, 60);
    }

    public void clicPopup(WebDriver driver) throws WebActionsException, InterruptedException {
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void clicCarrito(WebDriver driver) throws WebActionsException {
        WebAction action = new WebAction();
        action.setDriver(driver);
        action.click(CART_LBL, 60);
    }

    public void clicBtnPlaceOrder(WebDriver driver) throws WebActionsException, InterruptedException {
        Thread.sleep(3000);
        WebAction action = new WebAction();
        action.setDriver(driver);
        action.click(PLACE_ORDER_BTN, 60);
    }

}
