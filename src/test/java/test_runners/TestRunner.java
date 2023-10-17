package test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="classpath:features/SwagLabs.feature",
        glue = "stepDefinitions",
//        dryRun = false,
//        publish = false,
//        plugin = {
//                "pretty",
//                "html:reports/cucumber-report.html",
//                "rerun:failed_scenarios.txt"
//        },
//        snippets = CucumberOptions.SnippetType.UNDERSCORE,
        tags = "not @positive"

)
public class TestRunner {

}
