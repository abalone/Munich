import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by dihuibao on 4/6/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber/features",
        glue = "com.dihuibao.cucumber.step",
        strict = true,
        dryRun = false)
public class RunCukesTest {
}
