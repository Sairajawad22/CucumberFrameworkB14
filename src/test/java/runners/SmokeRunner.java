package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // features we use to provide the path of all the feature files
        features = "src/test/resources/features/",
        glue = "steps",
        // when you set dry run to tru, it stops actual execution
        // it will quickly scan all the gherkin whether steps they are implemented or not
        // when we set dry run to false, it starts execution again
        dryRun = false,
        tags = "@tc1101",
        // to remove irrelevant from console, you need to set monochrome true
        monochrome = true,
        // pretty keywords the steps in the console to increase
        //to generate the reports we need plugin of runner class

        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json","rerun:target/failed.txt"}
        // this failed .txt file holds all the scenario
)

public class SmokeRunner {
}
