package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.openqa.selenium.support.locators.RelativeLocator.*;;

public class RelativeLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Comp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		//driver.findElement(By.tagName("label")).above(nameEditBox).getText();
		WebElement dateOfBirth = driver.findElement(By.cssSelector("[for='daetofBirth']"));
		//driver.findElement(By.tagName("input")).below("dateofBirth").click();
		WebElement iceCreamLabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		//driver.findElement(By.tagName("input")).toLeftTo(iceCreamLabel);
		WebElement radioButton = driver.findElement(By.id("inlineRadio1"));
		//driver.findElement(By.tagName("label")).toRightTo(radioButton);
		

	}

}
