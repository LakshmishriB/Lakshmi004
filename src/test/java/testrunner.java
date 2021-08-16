import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"D:\\eclipse 2019 code\\ProjectQuikr\\features"},
        glue = {"stepdefinition"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome=true,
        tags=""
       
       
)
public class testrunner extends AbstractTestNGCucumberTests
{
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
