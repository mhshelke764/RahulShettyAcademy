package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LandingPage;

public class LoginTest {
	WebDriver driver;
	@Test
	public void Welcome_Onboard() {
		LandingPage lp = new LandingPage(driver);
		
		Assert.assertTrue(lp.LogoDisplayed(), "WelcomeBoard Logo is not displayed"); 
	}

}
