package stepDefinitions;

import contextmanager.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.HomePage;

public class HomePageSteps {
	
	TestContext testContext;
	HomePage homePage;
	
	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}
	
	
	@Given("^user navigate to youtube$")
	public void user_navigate_to_youtube() throws InterruptedException{
		homePage.navigateTo_Youtube();
		
	}
	
	
	@Then("^user go to epam systems global channel and navigate to video section$")
	public void user_go_to_epam_systems_global_channel_and_navigate_to_video_section() throws InterruptedException{
		homePage.goto_Epam_Channel();
	}
	
	@And("^get all views one year ago$")
	public void get_all_views_one_year_ago() throws InterruptedException{
		homePage.getallvediodetails();
	}
	
	
	@And("^generate fibonacci number$")
	public void generate_fibonacci_number() throws InterruptedException{
		homePage.getfabonaci();
	}
	
	@And("^pick vedio from fabinacci random even number$")
	public void  And_pick_vedio_from_fabinacci_random_even_number() throws InterruptedException{
		homePage.pickvedio();
	}
	
	
	
	

}