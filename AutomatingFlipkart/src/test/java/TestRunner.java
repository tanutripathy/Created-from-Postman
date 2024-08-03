import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/feature",
        glue = {"browserControl","stepDefinition"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
