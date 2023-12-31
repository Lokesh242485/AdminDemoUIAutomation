package Framework;

import Framework.Setup.Setup;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Features",
		glue= {"StepDefinitions","Framework/Setup"},
		//extraGlue = {"Framework/Setup"},
		monochrome = true,
		plugin = {"pretty","html:target/HtmlReports/testResult.html",
		"json:target/JSONReports/testResult.json",
		"junit:target/XMLReports/testResult.xml"},
		//tags = "@Navigation or @login"
		tags = "@parallelTest", // Optional: Use tags to filter scenarios
		publish = true
		//threads = 3 // Specify the number of threads for parallel execution
		//
)
public class Runner {

}
