package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class Login extends BaseClass {
	WebDriver driver;

	public Login(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "div[class=\\\"css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73\\\"]")
	WebElement Loginbutton;

	@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'][normalize-space()='Mobile Number'])[1]")
	WebElement Select_Mobile_Number;

	@FindBy(css = "//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'][normalize-space()='Email']")
	WebElement Select_Email;

}
