package testpackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstClass {
	
	@BeforeTest
	public void Demo1() {
		System.out.println("Hello from FirstClass and first test and I come as BeforeTest");
		
	}
	
    @BeforeSuite	
	public void Demo2() {
		System.out.println("Bye from the FirstClass and second test, but I come the first from all of you");
	}
	

}
