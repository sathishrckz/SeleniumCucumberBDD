package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public static WebDriver driver;
	public baseclass() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\Mytestcrm\\src\\chromedriver.exe");
		
	 
	driver = new ChromeDriver();
	}

}
