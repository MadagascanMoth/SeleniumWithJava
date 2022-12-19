package newwindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Comp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		driver.findElement(By.tagName("iframe")).getSize();
		driver.findElement(By.id("draggable")).click();
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("iframe.demo-frame"));
		WebElement target = driver.findElement(By.id("droppable"));
		action.dragAndDrop(source, target);
		driver.switchTo().defaultContent();
		

	}

}
