package Pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {

	private WebDriver driver;

//
	public SignUp(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a[rel='noopener noreferrer'] div[class='css-76zvg2 r-jwli3a r-ubezar']")
	WebElement Signupbutton;

	@FindBy(xpath = "//div[@class='col-sm-4 mt-2 px-sm-4']//select[contains(@class,'form-control form-select')]")
	WebElement SelectTitle;

	@FindBy(css = " #first_name")
	WebElement EnterFirstName;

	@FindBy(css = "#last_name")
	WebElement EnterLastName;

	@FindBy(css = "select[class='form-control form-select']")
	WebElement SelectCountryDropdown;

	@FindBy(css = ".flag-dropdown.open")
	WebElement selectFlag;

	public WebElement getcountrycode(String code) {
		WebElement countrycode = driver.findElement(By.xpath("//span[normalize-space()='" + code + "']"));

		return countrycode;
	}

	@FindBy(css = "input[placeholder='+91 01234 56789']")
	WebElement EnterMobileNumber;

	@FindBy(css = "#email_id")
	public WebElement EnterEmail;

	@FindBy(css = "img[alt='date']")
	WebElement SelectDateOfBirth;

	@FindBy(css = ".react-datepicker__year-select")
	WebElement Year;

	@FindBy(css = ".react-datepicker__month-select")
	WebElement Month;

	String datevalue;

//	@FindBy(css= "datevalue")
//	WebElement Date;

	public WebElement getDate(String Day, String Month, String Year, String Date1) {

		WebElement Date = driver.findElement(
				By.cssSelector("div[aria-label='Choose " + Day + ", " + Month + " " + Date1 + "st, " + Year + "']"));
		return Date;
	}

	@FindBy(css = " #new-password")
	WebElement EnterPassword;

	@FindBy(xpath = "//div[@class='col-sm-6 mt-30	 px-sm-4']//div[1]//div[1]//a[1]//img[1]")
	WebElement ShowPass;

	@FindBy(css = "#c-password")
	WebElement ConfirmPassword;

	@FindBy(css = "#defaultCheck1")
	WebElement SelectTermsAndConditions;

	@FindBy(xpath = " //button[normalize-space()='Submit']")
	WebElement SubmitButton;

	@FindBy(xpath = "//body/div[@id='react-root']/div/div/div[@class='container']/div[@class='box-full']/div[@class='row']/div[@class='register-formcol-12 col-xl-7 col-lg-8']/div[1]/div[1]/div[1]")
	WebElement ErrorMsg;

	@FindBy(xpath = "//a[normalize-space()='Log In']")
	WebElement AllreadyCustomer_Login;

	@FindBy(xpath = "//label[normalize-space()='OTP Verification']")
	public WebElement OTPconfirmation;

	// Actions...........................//

	public void EnterTitle(String Title) {

		SelectTitle.click();
		Select drop1 = new Select(SelectTitle);
		drop1.selectByValue(Title);
	}

	public void EnterFnameAndLname(String fName, String lName) {

		EnterFirstName.sendKeys(fName);
		EnterLastName.sendKeys(lName);
	}

	public void SelectCountry(String Country) {

		Select country = new Select(SelectCountryDropdown);
		// country.selectByValue(Country);
		country.selectByVisibleText(Country);
	}

	public void SelectDOB(String day, String month1, String Year1, String Date1) {

		SelectDateOfBirth.click();
		Year.click();
		Select yeard = new Select(Year);
		yeard.selectByVisibleText(Year1);
		Month.click();
		Select Monthd = new Select(Month);
		Monthd.selectByVisibleText(month1);
		getDate(day, month1, Year1, Date1).click();
//		getDate(day, month1, Year1, Date1);
//		Date.click();

	}

	public void scroll() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", EnterEmail);
	}

	public void EnterContact(String Contact, String countrycode) {

		System.out.println(EnterMobileNumber.getText());

//		if (!EnterMobileNumber.getText().contains(countrycode)) {
//			selectFlag.click();
//			getcountrycode(countrycode).click();
//		}
		EnterMobileNumber.sendKeys(Contact);

	}

	public void enteremail(String email) {

		EnterEmail.sendKeys(email);
	}

	public void EnterPasswordAndClickSubmit(String pass) {

		EnterPassword.sendKeys(pass);
		ConfirmPassword.sendKeys(pass);
		SelectTermsAndConditions.click();
		SubmitButton.click();
	}

	public void clicksignup() throws InterruptedException {
		Signupbutton.click();
		Thread.sleep(5000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String ParentID = it.next();
		String childID = it.next();

		driver.switchTo().window(childID);

	}

	public void waituntil(WebElement ele, long sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email_id")));
	}

	// Scroll down by javascript execitor...................
	// EnterPassword.sendKeys(contact);

}
