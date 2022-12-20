package testpackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FourthClass {
	
	@Test(groups = {"smoke"})
	public void WebLoginHome() {
		System.out.println("Hello from WebLoginHome and first test");
		
	}
	
	@AfterSuite
	
	public void MobileLoginHome() {
		System.out.println("Bye from the WebLoginHome class and second test");
	}
	
	@AfterTest
	public void LoginAPIHome() {
		System.out.println("Hello from WebLoginHome and login api test, execute AfterTest");
		
	}
	


}
