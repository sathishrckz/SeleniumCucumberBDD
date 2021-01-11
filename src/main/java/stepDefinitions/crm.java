package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDefinitions.baseclass;

public class crm extends baseclass {
	
	public crm() {
		super();
	}
	
	
	@Given("^deals page is opened$")
	public void deals_page_is_opened() {
		System.out.println("Given success");
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@When("^navigate to submenu$")
	public void navigate_to_submenu() {
		System.out.println("when success");
		driver.findElement(By.xpath("//*[@class='hm-icon-label' and text()='All']")).click();
		
	}
	
	@And("^click on todaysdeal$")
	public void click_on_todaysdeal() {
		System.out.println("and success");
		driver.findElement(By.xpath("//a[contains(text(),'Today')]")).click();
		
	}
	
	@Then("^Todays deal should be displayed$")
	public void Todays_deal_should_be_displayed() {
		System.out.println("then success");
		driver.close();
	}
	
	
	
}
