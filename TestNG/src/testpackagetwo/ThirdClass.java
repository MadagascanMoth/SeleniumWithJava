package testpackagetwo;

import org.testng.annotations.Test;

public class ThirdClass {
	
	@Test
	public void WebLogin() {
		System.out.println("Hello from WebLogin and first test");
		
	}
	
	@Test
	
	public void MobileLogin() {
		System.out.println("Bye from the WebLogin class and second test");
	}
	
	@Test
	public void LoginAPI() {
		System.out.println("Hello from WebLogin and login api test");
		
	}
	


}
