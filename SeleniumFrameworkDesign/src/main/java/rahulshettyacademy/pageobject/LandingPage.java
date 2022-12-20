package rahulshettyacademy.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.abstractcomponents.AbstractComponent;


public class LandingPage extends AbstractComponent {
	
	WebDriver driver;
	
	
	
	public LandingPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement userEmail = driver.findElement(By.id("userEmail")); -- one way
	
	@FindBy(id="userEmail")   // second way
	WebElement userEmail;
	
	@FindBy(id="userPassword")   // second way
	WebElement password;
	
	@FindBy(id="login")   // second way
	WebElement submit;
	
	public void loginApplication(String email, String passwordData) {
		userEmail.sendKeys(email);
		password.sendKeys(passwordData);
		submit.click();
		
	}
	
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	

}
