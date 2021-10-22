package pageObjects;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HomePage {
	static AppiumDriver<MobileElement> driver;

public static void openapp() throws Exception

{
	
	DesiredCapabilities caps = new DesiredCapabilities();
	
	caps.setCapability("deviceName", "pixel_2");
	caps.setCapability("udid", "emulator-5554");
	
	//caps.setCapability("udid", "d1a4416");
	caps.setCapability("platformName", "Android");
	caps.setCapability("platformVersion", "8.0.0");
	caps.setCapability("AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS",true);
	caps.setCapability("autoGrantPermissions", "true"); 
	caps.setCapability("autoAcceptAlerts", "true");
	caps.setCapability("app", "C:/Users/Micky/Desktop/Eclips/ZoodMall3.2.20-beta04-uat.apk");
	caps.setCapability("appPackage", "com.zoodel.kz");
	caps.setCapability("appActivity", "com.zoodel.kz.activities.ActivitySplash");
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver = new AppiumDriver<MobileElement>(url, caps);
	
	System.out.println("Appliation Started ...");
	driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
	
	driver.close();
/*	
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout")).click();
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[2]")).click();
	driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Account']/android.widget.ImageView")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();
	driver.findElement(By.id("com.zoodel.kz:id/edittext_email")).sendKeys("testappium01@yopmail.com");
	driver.findElement(By.id("com.zoodel.kz:id/edittext_mobile")).sendKeys("586945885");
	driver.findElement(By.id("com.zoodel.kz:id/edittext_old_password")).sendKeys("test@1234");
	driver.findElement(By.id("com.zoodel.kz:id/edittext_confirm_password")).sendKeys("test@1234");
	driver.findElement(By.id("com.zoodel.kz:id/button_signup")).click();
	
	System.out.println("Register Successfully..");*/
	
}

}

 


