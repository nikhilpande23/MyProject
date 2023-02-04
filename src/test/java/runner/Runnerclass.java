package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions	(


		features	= "src/test/resources/Features/Login.feature" ,
		glue		= {"step_defination"} ,
//		plugin 		= {"pretty","html:target/Cucumber-Reports/new-report.html"},
		
//		2. for extent report
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} ,
		
		monochrome 	= true,

//		tags 		= "@bug" ,

		dryRun 		= false


		)



public class Runnerclass  {

}
