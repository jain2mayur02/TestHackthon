package managers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import enums.DriverType;
import enums.EnvironmentType;

public class WebDriverManager {
	

	
	private WebDriver driver;
	private static DriverType driverType;
	private static EnvironmentType environmentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	
	public static final String AUTOMATE_USERNAME = "mayurjain5";
	  public static final String AUTOMATE_ACCESS_KEY = "okBBWsZanyMzKpyPDFmG";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  DesiredCapabilities caps = new DesiredCapabilities();

	public WebDriverManager() {
		
		environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		
	}

	public WebDriver getDriver() throws InterruptedException, MalformedURLException {
		if(driver == null) driver = createDriver();
		return driver;
	}

	private WebDriver createDriver() throws InterruptedException, MalformedURLException {
		   switch (environmentType) {	    
	        case LOCAL : driver = createLocalDriver();
	        	break;
	        case REMOTE : driver = createRemoteDriver();
	        	break;
		   }
		   return driver;
	}

	private WebDriver createRemoteDriver() throws MalformedURLException {

		    caps.setCapability("os_version", "10");
		    caps.setCapability("resolution", "1920x1080");
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "latest");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
		    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
		    driver = new RemoteWebDriver(new URL(URL), caps);
			return driver;
	}

	private WebDriver createLocalDriver() throws InterruptedException, MalformedURLException {
        switch (driverType) {	    
        case FIREFOX : driver = new FirefoxDriver();
	    	break;
        case CHROME : 
        	System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
        	driver = new ChromeDriver();
    		break;
        case INTERNETEXPLORER : driver = new InternetExplorerDriver();
    		break;
        case REMOTE : 
        	 caps.setCapability("os_version", "10");
 		    caps.setCapability("resolution", "1024x768");
 		    caps.setCapability("browser", "Chrome");
 		    caps.setCapability("browser_version", "latest");
 		    caps.setCapability("os", "Windows");
 		    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
 		    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
 		    driver = new RemoteWebDriver(new URL(URL), caps);
		break;	
    		
        }

        if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
        
		return driver;
	}	

	public void closeDriver() {
		driver.close();
		driver.quit();
	}

}