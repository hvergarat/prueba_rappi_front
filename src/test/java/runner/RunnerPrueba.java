package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/CompraEquipo.feature"
        , glue = {"co/com/pruebatecnica/stepsdefinition/"}
        , plugin = {"pretty", "html:target/cucumber-reports"}
)

public class RunnerPrueba {

}
