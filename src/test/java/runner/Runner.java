package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:test-output/htmlReport/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:Failed/failedScenarios.txt"
        },
        features = "src/test/resources/features",
        glue = {"stepdefinitions", "hooks" },
        monochrome = true,
        tags = "@wip"
       // dryRun = false
)
public class Runner {

}