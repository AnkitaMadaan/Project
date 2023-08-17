package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/loginfeature.feature",
		glue="StepDefinition",
		plugin = {"pretty"}
		)
public class Run {
	/* this class will be empty*/

}
