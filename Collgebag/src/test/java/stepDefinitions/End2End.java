package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class End2End {
	
	WebDriver  driver;
	
	@Given("^User navigating to Collegebag application$")
	public void usernavigatingtoCollegebagapplication() throws Throwable {
	    // Write cod here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hhaneef\\Documents\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.shop.demoqa.com");
	}

	@When("^User enters admin credentials$")
	public void userentersadmincredentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
	}

	@When("^click on login$")
	public void clickonlogin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("")).click();
	    
	}

	@Then("^User is navigated to Admin Homepage$")
	public void user_is_navigated_to_Admin_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		String a = driver.getTitle();
		System.out.println(a);
		
		
	}

}
