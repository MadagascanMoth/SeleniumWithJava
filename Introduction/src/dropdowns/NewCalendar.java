package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewCalendar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Comp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//input[@placeholder='Date of travel']")).click();
		List <WebElement> dates =  driver.findElements(By.xpath("//div[@class='dayContainer']"));
		int count = driver.findElements(By.xpath("//div[@class='dayContainer']")).size();
		for (int i = 0; i <count; i++) {
			String text = driver.findElements(By.xpath("//div[@class='dayContainer']")).get(i).getText();
			if(text.equalsIgnoreCase("25")) {
				driver.findElements(By.xpath("//div[@class='dayContainer']")).get(i).click();
				break;
			}
		
		}
				

	}

}
