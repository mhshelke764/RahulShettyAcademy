package Tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import DriverSetup.DriverSetup;

public class SignUpTest extends Pages.SignUp {

	WebDriver driver;

	public SignUpTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void SignUp() {

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String ParentID = it.next();
		String childID = it.next();

		driver.switchTo().window(childID);

		Pages.SignUp su = new Pages.SignUp(driver);

		su.EnterTitle("");
		su.EnterFnameAndLname("", "");
		su.SelectCountry("");
		su.SelectDOB("", "", "", "");

		su.scroll();

		su.EnterContact("", "");

		su.EnterEmail("");
		su.EnterPasswordAndClickSubmit("");
		su.OTPconfirmation.isDisplayed();
	}

}
