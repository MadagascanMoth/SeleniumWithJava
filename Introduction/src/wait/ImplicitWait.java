package wait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ImplicitWait {


	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Comp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String [] veggies = {"Cucumber","Brocolli" , "Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		addProducts(driver,veggies);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		Assert.assertEquals(driver.findElement(By.className("promoInfo")).getText(), "Code applied ..!");
		
		

	}
	public static void addProducts(WebDriver driver, String [] veggies) {
		int j =0;
		List <WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i = 0; i<products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim();
			List<String> veggieList = Arrays.asList(veggies);
			if(veggieList.contains(formatedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if(j == veggies.length) {
					break;
				}
					
			}
		}
	}

}
