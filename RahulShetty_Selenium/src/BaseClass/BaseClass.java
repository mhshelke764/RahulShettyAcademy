package BaseClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Pages.SignUp;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;


	
	public WebDriver init_driver(String browser) throws InterruptedException {

		DriverSetup(browser);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		return driver;
	}

	public void DriverSetup(String browser) throws InterruptedException {

		if (browser.equalsIgnoreCase("CHROME")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("FIREFOX")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("EDGE")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

	}

	
}
