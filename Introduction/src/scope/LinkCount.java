package scope;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Comp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerLinks = driver.findElement(By.id("gf-BIG"));
		System.out.print(footerLinks.findElements(By.tagName("a")).size());
		WebElement columnFooter = footerLinks.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnFooter.findElements(By.tagName("a")).size());
		for (int i = 1; i < columnFooter.findElements(By.tagName("a")).size();i++) {
			 String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);	
			 columnFooter.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			 Thread.sleep(5000);
			
				 
		}
		
		 Set<String> windows = driver.getWindowHandles();
		 Iterator<String> it = windows.iterator();
		 while(it.hasNext()) {
			 driver.switchTo().window(it.next());
			 System.out.println(driver.getTitle()); 
			 
		}
		

	}

}
