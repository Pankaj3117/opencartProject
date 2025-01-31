package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbase.Basepage;

public class homepage extends Basepage {
	public homepage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement linkaccount;
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement linkregister;
	
	
	public void clickmyaccount() {
		linkaccount.click();
	}
		public void clickregister() {
			linkregister.click();
	}
}
