/**
 *
 */
package runner;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = {"src/test/java/features/JobSearch.feature"},

        glue = {"stepDefinitions"},
        dryRun = false,
        monochrome = true,
        tags = {"@srikanya"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
)
public class RunCukeTestng extends AbstractTestNGCucumberTests {


}
