package StepDefinitions;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class LoginSteps_POM {
	
	WebDriver driver;
	loginPage login;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step1");
		System.setProperty("webdriver.chrome.driver", "CucumberJava\\src\\main\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://example.testproject.io/web/");
		
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		login=new loginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		Thread.sleep(5000);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		login.clickLogin();
		
		
	}

	@Then("user is naviagaed to the home page")
	public void user_is_naviagaed_to_the_home_page() {
		System.out.println("Inside Step4");
		
	}


}
