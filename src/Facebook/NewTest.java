package Facebook;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import TestUtils.*;

public class NewTest extends TestUtils {
	
	@BeforeTest
	public void setBaseUrl(){
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 5);
		driver.get(baseUrl);
	}
	
	@Test
  public void test1() {
	  	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		setFirstName("tester");
		setLastName("tester");
		setEmail("test@hotmail.com");
		setConfirmEmail("test@hotmail.com");
		setPassword("Password1!");
		setBirthMonth("Oct");
		setBirthDay("29");
		setBirthYear("1990");
		selectGender("Male");
		clickSignUpButton();
		waitForVisible(By.xpath("//*[@id='reg_error_inner']"));
		String actual = getErrorMsg();
		System.out.println("Actual:" + actual);
		Assert.assertEquals(actual, "The account that owns the email address you entered has been disabled.");
		driver.close();
  }
  
  @AfterTest
  public void endSession(){
	  driver.quit();
  }
  
}
