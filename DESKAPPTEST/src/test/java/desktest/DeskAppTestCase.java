package desktest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class DeskAppTestCase {
	
	public static void main(String arg[]) throws MalformedURLException{
		
		DesktopOptions option = new DesktopOptions();
		
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		
		WiniumDriver driver =new WiniumDriver(new URL("http://localhost:9999"),option);
		
		
		
	}

}
