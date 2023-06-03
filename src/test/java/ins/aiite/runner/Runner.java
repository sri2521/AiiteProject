package ins.aiite.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\503829\\eclipse-workspace\\AacitinProjectWithPageFactory\\src\\test\\java\\com\\adactin\\feature", 
glue="com.adactin.stepDefinition", monochrome=true, publish=true, dryRun=false,tags="@login",plugin={"pretty","html:target/htmlreport.html"})
public class Runner {

}
