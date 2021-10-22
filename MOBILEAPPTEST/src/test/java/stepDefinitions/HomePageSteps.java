package stepDefinitions;

import cucumber.api.java.en.Given;
import pageObjects.HomePage;

public class HomePageSteps {
	
	
	HomePage homePage = new HomePage();
	
	@Given("^user able to lunch application$")
	public void user_able_to_lunch_application() throws Exception{
		try {
		HomePage.openapp();
		}
		catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			
		}
		
	}
	


}