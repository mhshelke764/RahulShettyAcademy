package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseClass.BaseClass;

public class LandingPage extends BaseClass {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
	
		this.driver = driver;
	}

	@FindBy(css="div[class='css-1dbjc4n r-1loqt21 r-13awgt0 r-1mlwlqe r-1udh08x r-1otgn73 r-1lgpqti'] img[class='css-9pa8cd']")
	WebElement logo;
	
	@FindBy(css="div[class=\"css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73\"]")
	WebElement Filghts_tab; 

	@FindBy(css="div[class=\"css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73\"]")
	WebElement Hotels_tab;
	
	@FindBy(css="div[class=\"css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-779j7e r-1f1sjgu r-1otgn73\"]")
	WebElement FightStatus_tab;
	
	@FindBy(css=".css-76zvg2.r-qsz3a2.r-2t9rge.r-adyw6z.r-1kfrs79")
	WebElement Welecome_Onboard;

	@FindBy(css=".css-76zvg2.r-qsz3a2.r-2t9rge.r-adyw6z.r-1kfrs79")
	WebElement Manage_Booking;
	
	
	
	
	// Test Actions.......................//
	
	public boolean LogoDisplayed() {
		return logo.isDisplayed();
	}

}
