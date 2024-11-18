package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import BaseClass.BaseClass;
import Pages.LandingPage;
import Pages.Login;
import Pages.SignUp;

public class Setup {

	WebDriver driver;
	BaseClass Bc;
	public SignUp signup;
	public Login login;
	public LandingPage lpage;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser) throws InterruptedException {
		Bc = new BaseClass();
		driver=Bc.init_driver(browser);
		signup = new SignUp(driver);
		login = new Login(driver);
		lpage = new LandingPage(driver);
	}
//	@AfterTest
//	public void teardown() {
//
//		driver.quit();
//	}
}
