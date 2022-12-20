package testpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondClass {
	@BeforeMethod
	public void Demo3() {
		System.out.println("Hello from SecondClass and first test and come first as a method in a class");
		
	}
	
	@Test(groups = {"smoke"})
	
	public void Demo4() {
		System.out.println("Bye from the SecondClass and second test");
	}
	@Parameters({"baseUrl", "apiKey"})
	@Test
	public void WebLogin(String baseUrl) {
		System.out.println("Hello from WebLogin and first test");
		
	}
	
	@Test(dataProvider = "getData")
	public void MobileLogin() {
		System.out.println("Bye from the WebLogin class and second test");
	}
	
	@AfterMethod
	public void LoginAPI() {
		System.out.println("Hello from WebLogin and login api test I will come after every method in a class");
		
	}
	
	@DataProvider
	
	public Object[][] getData() {
		
		Object [] [] data = new Object [3] [2];
		data[0][0] = "firstUserName";
		data[0][1] = "firstPassword";
		
		data[1][0] = "secondUserName";
		data[1][1] = "secondPassword";
		
		data[2][0] = "ThirdUserName";
		data[2][1] = "thirdPassword";
		
		return data;
		
		
	}

}
