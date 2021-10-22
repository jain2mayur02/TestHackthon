package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTest"
		//features =   "."
		,glue= {"stepDefinitions"},tags={"@WEBAPITEST"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" ,"json:target/cucumber.json" , "rerun:target/rerun.txt"}, 
        monochrome = true
                )
	
public class TestRunner {
   
}



/*package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/functionalTest"
,glue= {"stepDefinitions"}
)

public class TestRunner {

}*/


