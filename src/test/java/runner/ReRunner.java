package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:test-output/target/default-cucumber-reports.html",
                "json:test-output/target/json-reports/cucumber.json",
                "junit:test-output/htmlReport/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:test-output/Failed/failedScenarios.txt"
        },
        monochrome = true,
        features = "@Failed/failedScenarios.txt",
        glue = {"stepdefinitions", "hooksApi" },
        dryRun = false
)
public class ReRunner {
}

