package stepDefinitions;




import com.cucumber.listener.Reporter;



import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {


	@Before
	public void beforeScenario(Scenario scenario) {
		Reporter.assignAuthor("Mayur Jain");
		
		
	}


	
}