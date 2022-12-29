package rahulshettyacademy.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import rahulshettyacademy.pageobject.HomePage;

public class BaseTest {
	
	public WebDriver driver;
	protected HomePage homePage;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Comp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://the-internet.herokuapp.com/");
		homePage = new HomePage(driver);
		
		
		driver.quit();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	

}
