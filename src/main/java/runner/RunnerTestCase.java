package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "C:\\java_learning_code\\BDD\\src\\main\\java\\BDDFrameWork\\Feature\\Test1.feature",
        glue = "BDDFrameWork.StepDefination",
        monochrome=true,
        dryRun=false,
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "json:target/cucumber-reports/CucumberTestReport.xml"
        })
public class RunnerTestCase extends AbstractTestNGCucumberTests{
}
