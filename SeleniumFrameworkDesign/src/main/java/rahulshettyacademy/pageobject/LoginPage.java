package rahulshettyacademy.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	private By userNameField = By.id("username");
	private By passwordField = By.id("password");
	private By loginBtn = By.cssSelector("#login button");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;

	}
	public void setUserName(String userName) {
		driver.findElement(userNameField).sendKeys(userName);
	}
	public void setPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	public SecureAreaPage clickLoginButton() {
		driver.findElement(loginBtn).click();
		return new SecureAreaPage(driver);
	}
	
	
	
	

}
