package CucumberTool;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/sairajawad/IdeaProjects/CucumberBatch14/src/test/java/CucumberTool/Login.feature",
        glue="CucumberTool"
)


public class RunnerClass {
}
