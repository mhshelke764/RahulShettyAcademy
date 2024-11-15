package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SignUpTest extends Setup {

	@Test
	public void SignUp() throws InterruptedException {
		signup.clicksignup();

		signup.EnterTitle("MR");
		signup.EnterFnameAndLname("Fname", "Lname");
		signup.SelectCountry("India");
		signup.SelectDOB("Friday","December","2000", "1");

		signup.scroll();

		signup.EnterContact("8000010000", "+91");
		
		//signup.waituntil(signup.EnterEmail, 10);
		Thread.sleep(5000);
		signup.EnterEmail.click();
		signup.enteremail("jshdbvkad000@gmail.com");
		
		signup.EnterPasswordAndClickSubmit("AA@jdh123");
		signup.OTPconfirmation.isDisplayed();
	}

	

}
