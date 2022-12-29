package rahulshettyacademy.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
		
	public HomePage(WebDriver driver) {
		this.driver=driver;

	}
	
	private By formAuthenticationLink = By.linkText("Form Authentication");
	
	public LoginPage clickFormAuthentication() {
		driver.findElement(formAuthenticationLink).click();
		return new LoginPage(driver);
	}

	
}
