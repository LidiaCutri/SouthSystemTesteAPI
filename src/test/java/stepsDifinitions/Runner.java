package stepsDifinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/validar_cep.feature",
        glue = {""}, monochrome = true, dryRun = false
        //plugin = {"pretty","html:target/cucumber-html-report"}
)
public class Runner {
}

