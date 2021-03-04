package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features   = "src/test/resources/features/navega_pelo_site_auditeste.feature",
        glue       = "steps",
        tags	   = "",
        plugin	   = {"pretty"},
        monochrome = true
)
public class Runner {
}
