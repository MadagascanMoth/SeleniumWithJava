package testpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdClass {
	
	@Test(dependsOnMethods= {"MobileLogin"})
	public void WebLogin() {
		System.out.println("Hello from WebLogin and first test");
		
	}
	@Parameters({"baseUrl"})
	@Test
	
	public void MobileLogin(String baseurl) {
		System.out.println("Bye from the WebLogin class and second test");
		System.out.println(baseurl);
		
	}
	
	@Test(groups = {"smoke"})
	public void LoginAPI() {
		System.out.println("Hello from WebLogin and login api test");
		
	}
	


}
