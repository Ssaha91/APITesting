package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Features Pointing To 'login.feature', Glue to make sure it runs from the steps package,
 * and format is to generate reports in both .JSON and .HTML format, from TestNG or JUnit
 * Execution. Not from Maven.
 */

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"steps"},
        format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        tags = {"@Web1"}
)
/**
 * Runs with TestNG by Extending to 'AbstractTestNGCucumberTests'
 * To run with JUnit, @RunWith is needed.
 */
public class TestRunner extends AbstractTestNGCucumberTests {
}
