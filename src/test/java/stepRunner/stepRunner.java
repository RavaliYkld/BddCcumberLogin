package stepRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(   //features={".//Features"},
					features={".//Features/Login.feature"},
					//features= {".//Features/Login.feature",".//Features/xyz.feature"},
					glue="stepDefinitions",
					dryRun=false		
		
		)
public class stepRunner {
	
	

}
