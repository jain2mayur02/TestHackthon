package pageObjects;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	static WebDriver driver;
	public static Properties properties;
	List<String> videoLists = null;
	int randamindex;
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	@FindBy(xpath = "//*[@id='search' and @name ='search_query']")
	private WebElement searchtextbox;
	
	
	@FindBy(xpath = "//*[@id='search-icon-legacy' and @class ='style-scope ytd-searchbox']")
	private WebElement clicksearch;
	
	
	
	@FindBy(xpath = "//*[@id='text' and text() ='EPAM Systems Global']")
	private WebElement clickonepamsys;
	
	@FindBy(xpath = "//*[@id='tabsContent']/tp-yt-paper-tab[2]/div")
	private WebElement clickonvideos;

	
	
	
	@FindBy(xpath = "//ytd-two-column-browse-results-renderer//*[@id='contents']//*[@id='items']//*[@id='dismissible']//*[@id='metadata-line']/span[2]")
	List<WebElement> viewlist;
	
	@FindBy(xpath = "//ytd-two-column-browse-results-renderer//*[@id='contents']//*[@id='items']//*[@id='dismissible']//h3//a")
	List<WebElement> viewvediotitle;
	
	@FindBy(xpath = "//ytd-two-column-browse-results-renderer//*[@id='contents']//*[@id='items']//*[@id='dismissible']")
			List<WebElement> commandvediodetails;
	
	
	
	@FindBy(xpath = "//ytd-two-column-browse-results-renderer//*[@id='contents']//*[@id='items']//*[@id='dismissible']//*[@id='metadata-line']/span[2]")
	List<WebElement> uploadTimeStamp;

	
	@FindBy(xpath = "//ytd-two-column-browse-results-renderer//*[@id='contents']//*[@id='items']//*[@id='dismissible']//h3/a")
	List<WebElement> videoNameElement;

	
	
	
	public void navigateTo_Youtube() throws InterruptedException {
		
		driver.get("https://www.youtube.com/");
		

	}
	
public void goto_Epam_Channel() throws InterruptedException {
	Thread.sleep(2000);
	searchtextbox.sendKeys("Epam Systems Global channel ");
	Thread.sleep(2000);
	clicksearch.click();
	Thread.sleep(2000);
	clickonepamsys.click();
	Thread.sleep(2000);
	clickonvideos.click();
	Thread.sleep(2000);

	}
	
public void getallvediodetails() throws InterruptedException {

	
	videoLists = new ArrayList<String>();
		
		System.out.println("Count " + commandvediodetails.size());
		
		for(int j=0; j<commandvediodetails.size(); j++) {
		
		System.out.println( "Month" + uploadTimeStamp.get(j).getText());
		System.out.println( "Name" + videoNameElement.get(j).getText());
	
		if(uploadTimeStamp.get(j).getText().contains("month") && uploadTimeStamp.get(j).getText().contains("weeks") && uploadTimeStamp.get(j).getText().contains("1 year")) {
		
			String videoName = videoNameElement.get(j).getText();
		videoLists.add(videoName);
		
		System.out.println("List =>" + videoLists);
		System.out.println("List =>" + videoLists.add(videoName));
	

		}
		}
		Collections.sort(videoLists);
	
}

public int getfabonaci() throws InterruptedException {
	
	List<Integer> givefaban = new ArrayList<Integer>();
	int n = 40, f1 = 0, f2 = 1;
	while (f1 <= n) {
		int fibonacci = f1 + f2;
		givefaban.add(f1);
		f1 = f2;
		f2 = fibonacci;

		}
	
	//List<Integer> even=new ArrayList<Integer>();
	java.util.Iterator<Integer> it = givefaban.iterator();
	while(it.hasNext()){
	Integer number= it.next();
	if(!((number % 2 )==0)){
	it.remove();
	}
	}
	//System.out.println(even);
	Random rand = new Random();
	randamindex = givefaban.get(rand.nextInt(givefaban.size())).intValue();
	System.out.println( "Random ==>" + randamindex);
	
	return (givefaban.get(rand.nextInt(givefaban.size())).intValue());
	
	
}


public void pickvedio()  {
	System.out.println( "VedioList ==>" + videoLists.get(randamindex));
	
	driver.findElement(By.xpath("//ytd-two-column-browse-results-renderer//*[@id='contents']//*[@id='items']//*[@id='dismissible']//h3/a[@title="+videoLists.get(randamindex-1)+"]")).click();
	

	

}


}