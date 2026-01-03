package Runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features"
    ,glue={"StepDefinations", "Utility"},
    tags = "@nikitha",
    plugin = {
        "pretty",
        "html:target/CucumberReport.html",
        "json:target/CucumberReport.json",
        "junit:target/CucumberReport.xml"
    }
)

public class RunnerClass {


}
