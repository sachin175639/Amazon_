package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature",
        glue = {"StepDef"},
        plugin = {"pretty", "html:target/site/cucumber-pretty","json:target/cucumber.jason"},
        monochrome = true)

public class Testrunner {

}
