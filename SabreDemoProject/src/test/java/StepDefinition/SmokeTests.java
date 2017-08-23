package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTests {
	WebDriver driver;
	
	@Given("^Open firefox and start application$")
	public void open_Chrome_and_start_application() throws Throwable {
	  driver = new FirefoxDriver();
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\sg0939137\\Desktop\\Ruchi\\IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		Thread.sleep(5000);
	  driver.manage().window().maximize();
	  driver.get("https://www.google.co.in");
	}

	@When("I enter search Text")
	public void i_enter_valid_username_and_valid_password() throws Throwable {

		driver.findElement(By.id("lst-ib")).sendKeys("CucumberFramework");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		//driver.findElement(By.cssSelector("[value='Google Search')")).click();
	}

	@Then("Search results should display successfully")
	public void user_should_be_able_to_login_successfully() throws Throwable {
    Assert.assertTrue(driver.findElement(By.id("resultStats")).isDisplayed());
	}


}
