package test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@failed_scenarios.txt",
        glue = "stepDefinitions",
        plugin = {
                "pretty",
                "html:reports/cucumber-report.html"
        }
)
public class Rerunner {

}
