package Pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp {

	WebDriver driver;

	public SignUp(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div[class=\"css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73\"]")
	WebElement Signupbutton;

	@FindBy(xpath = "//div[@class='col-sm-4 mt-2 px-sm-4']//select[contains(@class,'form-control form-select')]")
	WebElement SelectTitle;

	@FindBy(css = " #first_name")
	WebElement EnterFirstName;

	@FindBy(css = "#last_name")
	WebElement EnterLastName;

	@FindBy(css = "select[class='form-control form-select']")
	WebElement SelectCountryDropdown;
	
	public WebElement getcountrycode(String code) {
		WebElement countrycode = driver.findElement(By.xpath("//span[normalize-space()='" + code + "']"));

		return countrycode;
	}

	@FindBy(css = "input[placeholder='+91 01234 56789']")
	WebElement EnterMobileNumber;

	@FindBy(css = "#email_id")
	WebElement EnterEmail;

	@FindBy(css = "img[alt='date']")
	WebElement SelectDateOfBirth;

	@FindBy(css = ".react-datepicker__year-select")
	WebElement Year;

	@FindBy(css = ".react-datepicker__month-select")
	WebElement Month;

	public WebElement getDate(String Day, String Month, String Year, String Date1) {

		WebElement Date = driver.findElement(
				By.className("div[aria-label='Choose " + Day + ", " + Month + " " + "Date1" + "th, " + Year + "']"));
		return Date;
	}

	@FindBy(css = " #new-password")
	WebElement EnterPassword;

	@FindBy(xpath = "//div[@class='col-sm-6 mt-30 px-sm-4']//div[1]//div[1]//a[1]//img[1]")
	WebElement ShowPass;

	@FindBy(css = "#c-password")
	WebElement ConfirmPassword;

	@FindBy(css = "#defaultCheck1")
	WebElement SelectTermsAndConditions;

	@FindBy(xpath = " //button[normalize-space()='Submit']")
	WebElement SubmitButton;

	@FindBy(xpath = "//body/div[@id='react-root']/div/div/div[@class='container']/div[@class='box-full']/div[@class='row']/div[@class='register-form col-12 col-xl-7 col-lg-8']/div[1]/div[1]/div[1]")
	WebElement ErrorMsg;

	@FindBy(xpath = "//a[normalize-space()='Log In']")
	WebElement AllreadyCustomer_Login;
	
	@FindBy(xpath="//label[normalize-space()='OTP Verification']")
	public
	WebElement OTPconfirmation;

	

	// Actions...........................//

	public void EnterTitle(String Title) {

		Select drop1 = new Select(SelectTitle);

		drop1.deselectByValue(Title);
	}

	public void EnterFnameAndLname(String fName, String lName) {

		EnterFirstName.sendKeys(fName);
		EnterLastName.sendKeys(lName);
	}

	public void SelectCountry(String Country) {

		Select country = new Select(SelectCountryDropdown);
		country.selectByValue(Country);
	}

	public void SelectDOB(String Year1, String month1, String day, String Date1) {

		SelectDateOfBirth.clear();

		Select yeard = new Select(Year);
		yeard.selectByValue(Year1);

		Select Monthd = new Select(Month);
		Monthd.selectByValue(month1);

		getDate(day, month1, Year1, Date1).click();

	}

	public void scroll() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", SubmitButton);
	}

	public void EnterContact(String Contact, String countrycode) {

		if (!EnterMobileNumber.getText().contains(countrycode)) {
			SelectCountryDropdown.click();
			getcountrycode(countrycode).click();
		}	
			EnterMobileNumber.sendKeys(Contact);
		
	}
	
	public void EnterEmail(String email) {
		
		EnterEmail.sendKeys(email);
	}
	
	public void EnterPasswordAndClickSubmit(String pass) {
		
		EnterPassword.sendKeys(pass);
		ConfirmPassword.sendKeys(pass);
		SelectTermsAndConditions.click();
		SubmitButton.click();
	}

	// Scroll down by javascript execitor...................
	// EnterPassword.sendKeys(contact);

}
