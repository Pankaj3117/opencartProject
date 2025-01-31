package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import testbase.Basepage;

public class AccountRegistration extends Basepage {
	WebDriver driver;
	public AccountRegistration(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement firstname;
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement lastname;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
	@FindBy(xpath = "//input[@id='input-newsletter']")
	WebElement checkbox;
	@FindBy(xpath = "//input[@name='agree']")
	WebElement checkbox1;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement click;

	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement confirmation;
	
	public void setfirstname1(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void setlastname(String lname) {
		lastname.sendKeys(lname);
	}
	
	public void setemail(String email1) {
		email.sendKeys(email1);
	}
	
	public void setpassword(String pass) {
		password.sendKeys(pass);
	}
	
	
	public void checkboxx() {
Actions act=new Actions(driver);
act.moveToElement(checkbox).click().perform();
}
	
	
	public void checkboxxx() {
		Actions act=new Actions(driver);
		act.moveToElement(checkbox1).click().perform();
	}
	
	public void button() {
		click.click();
	}
	
	public String confirmationess() {
		return confirmation.getText();
		
	}
	
}
