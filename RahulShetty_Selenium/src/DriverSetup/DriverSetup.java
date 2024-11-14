package DriverSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Pages.SignUp;

public class DriverSetup {
	
	 static WebDriver driver;
	
	protected DriverSetup(WebDriver driver){
		this.driver = driver;
	}
	
	@BeforeClass
	public  void DriverSetup() throws InterruptedException {
		
		
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		 driver.get("https://spicejet.com");
		 driver.manage().window().maximize();
		 driver.navigate().to("https://indigo.com");
		 
		 SignUp sp = new SignUp(driver);
		 Thread.sleep(5000);
}
	@AfterClass
	public void teardown() {

		driver.close();
}
}
