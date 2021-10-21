package managers;

import org.openqa.selenium.WebDriver;

import comman.BaseClass;

import pageObjects.HomePage;



public class PageObjectManager {

	private WebDriver driver;

	private BaseClass baseclass;
	private HomePage homePage;
	


	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}
	

	


	public BaseClass getBaseClass() {

		return (baseclass == null) ? baseclass = new BaseClass(driver) : baseclass;
	}

	public HomePage getHomePage() {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}

	
	

}