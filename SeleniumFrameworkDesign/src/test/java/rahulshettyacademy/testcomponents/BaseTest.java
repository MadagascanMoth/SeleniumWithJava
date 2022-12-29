package rahulshettyacademy.testcomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.pageobject.LandingPage;

public class BaseTest  {
	
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		
	
		    Properties prop = new Properties();
		    FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +"\\src\\main\\java\\rahulshettyacademy\\resources\\GlobalData.properties");
		    prop.load(fis);String browserName = prop.getProperty("browser");
		    if(browserName.equalsIgnoreCase("chrome)")) {
		    	WebDriverManager.chromedriver().setup();
		    	 driver = new ChromeDriver();
				
		    }
		    else if(browserName.equalsIgnoreCase("firefox)")) {
		    	
		    	System.setProperty("webdriver.edge.driver","C:\\Users\\Comp\\Downloads\\edgedriver_win64\\geckodriver.exe");
		    	 driver = new FirefoxDriver();
		    
		    	
		    }else if(browserName.equalsIgnoreCase("edge)")) {
		    	System.setProperty("webdriver.edge.driver","C:\\Users\\Comp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		    	driver = new EdgeDriver();
		    
		   
		    }
		    
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();  
			return driver;
			
		}
	
	
	
	public void launchApplication() throws IOException {
		
		driver = initializeDriver();
		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo();
	//	return landingPage();
	}
	
		
		

}


