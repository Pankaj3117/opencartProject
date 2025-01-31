package testcase;

import java.sql.Driver;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;
import pageobject.AccountRegistration;
import pageobject.homepage;

public class TC0001_AccountRegistertationTest {
	public WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://localhost/opencart/upload/index.php?route=common/home&language=en-gb");
	}

	@AfterClass
	public void teardown() {
driver.close();
	}

	@Test
	public void verify_account_registration() throws InterruptedException {
		homepage hp = new homepage(driver);
		hp.clickmyaccount();
		hp.clickregister();
		AccountRegistration ar = new AccountRegistration(driver);
		ar.setfirstname1(randomdata());
		ar.setlastname(randomdata());
		ar.setemail(randomdata()+"@yopmail.com");
		ar.setpassword(randomdata()+randomdata1());
		ar.checkboxx();
		Thread.sleep(3000);
		ar.checkboxxx();
		ar.button();
		String cnf = ar.confirmationess();
		Assert.assertEquals(cnf, "Your Account Has Been Created!");
		Thread.sleep(3000);

	}

	public String randomdata() {
		String generated = RandomStringUtils.randomAlphabetic(5);
		return generated;
	}
	public String randomdata1() {
		String generated = RandomStringUtils.randomNumeric(5);
		return generated;
	}
}
