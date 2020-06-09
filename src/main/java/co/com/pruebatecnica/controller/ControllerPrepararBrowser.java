package co.com.pruebatecnica.controller;

import co.com.pruebatecnica.generalactions.WebAction;
import co.com.pruebatecnica.helpers.Browser;
import co.com.pruebatecnica.logs.Log;

public class ControllerPrepararBrowser {
    public void iniciarNavegador(WebAction action) {
        Browser browserConfig = new Browser();
        browserConfig.setIncognito(true);
        browserConfig.setDriverVersion("72.0.3626.69"); // Version del navegador que se va a usar
        browserConfig.setBrowser(Browser.Browsers.CHROME); // CHROME o FIREFOX son los parametros que se cambian
        browserConfig.setMaximized(true);
        try {
            action.startWebApp(browserConfig, "https://www.demoblaze.com/");
        } catch (Throwable e) {
            Log.LOGGER.error("POcuarrio un error realizando una de las acciones de la prueba\" + e");
        }
    }
}
