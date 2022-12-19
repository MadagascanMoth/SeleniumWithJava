package newwindows;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		String password = "learning";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Comp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set <String> windows = driver.getWindowHandles();
		Iterator <String>it = windows.iterator();
		String parentTab = it.next();
		String childTab = it.next();	
		driver.switchTo().window(childTab);
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		String email = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentTab);
		driver.findElement(By.id("username")).sendKeys(email);
		
		
	}

}
