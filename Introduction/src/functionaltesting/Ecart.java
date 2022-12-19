package functionaltesting;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecart {

	public static void main(String[] args) {
		
		int j =0;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Comp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String [] veggies = {"Cucumber","Brocolli" , "Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
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

