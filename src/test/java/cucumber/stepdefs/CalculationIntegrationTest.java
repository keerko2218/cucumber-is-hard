package cucumber.stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", plugin = {"pretty", "html:target/cucumber"}, glue = {"com.techjava.springbootcucumberdemo.cucumber.stepdefs"})
public class CalculationIntegrationTest {
}
