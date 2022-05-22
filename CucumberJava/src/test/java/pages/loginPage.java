package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class loginPage {
	
	WebDriver driver;
	
	private By txt_username=By.id("name");
	private By txt_password=By.id("password");
	
	private By login_btn=By.id("login");
	
	public loginPage(WebDriver driver){
		this.driver=driver;
		
		if (!driver.getTitle().equals("TestProject Demo")) {
			
			throw new IllegalStateException("This is not the correct page");
		}
	}
	
	public void enter_username(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enter_password(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin() {
		
		driver.findElement(login_btn).click();
		
	}
	
	public void login(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(login_btn).click();
	}
}
