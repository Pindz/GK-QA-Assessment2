//import cucumber.annotation.Before;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.driver.factory.loadDriver;
@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/resources/features/"},
        tags = "@AddtoCart",
        glue = {"com.automation.stepdef"})
public class WebRunner {

//    @Before
//
//    public void createDriver() {
//
//       WebDriver driver = (WebDriver) new loadDriver();
//
//    }

}