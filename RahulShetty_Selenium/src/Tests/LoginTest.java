package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Setup {


	@Test
	public void Welcome_Onboard() {

		Assert.assertTrue(lpage.LogoDisplayed(), "WelcomeBoard Logo is not displayed");
	}

}
