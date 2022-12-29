package rahulshettyacademy.login;



import org.testng.Assert;
import org.testng.annotations.Test;

import rahulshettyacademy.pageobject.LoginPage;
import rahulshettyacademy.pageobject.SecureAreaPage;
import rahulshettyacademy.tests.BaseTest;

public class LoginTests extends BaseTest{
	
	@Test
	public void testSuccesfulLogin() {
		homePage.clickFormAuthentication();
		LoginPage loginPage = homePage.clickFormAuthentication();
		loginPage.setUserName("tomsmith");
		loginPage.setPassword("SuperSecretPassword!");
		SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
		secureAreaPage.getAlertText();
		Assert.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));
		
	}

}
