package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import BaseClass.BaseClass;
import Pages.SignUp;

public class Setup {

	WebDriver driver;
	BaseClass Bc;
	public SignUp signup;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser) throws InterruptedException {
		Bc = new BaseClass();
		driver=Bc.init_driver(browser);
		signup = new SignUp(driver);
	}
//	@AfterTest
//	public void teardown() {
//
//		driver.quit();
//	}
}
