package TestUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtils {
	
	protected String baseUrl = "https://www.facebook.com/?_rd";
	protected WebDriver driver;
	protected WebElement el;
	protected WebDriverWait wait;
	
	 public void setFirstName(String firstName){
			el = driver.findElement(By.xpath(".//*[@id='u_0_b']"));
			el.clear();
			el.sendKeys(firstName);
		}
		 
		 public void setLastName(String lastName){
				el = driver.findElement(By.xpath(".//*[@id='u_0_d']"));
				el.clear();
				el.sendKeys(lastName);
		 }
		 
		 public void setEmail(String email){
			 el = driver.findElement(By.xpath(".//*[@id='u_0_f']"));
			 el.clear();
			 el.sendKeys(email);
		 }
		 
		 public void setConfirmEmail(String email){
			 el = driver.findElement(By.xpath(".//*[@id='u_0_i']"));
			 el.clear();
			 el.sendKeys(email);
		 }
		 
		 public void setPassword(String password){
			 el = driver.findElement(By.xpath(".//*[@id='u_0_k']"));
			 el.clear();
			 el.sendKeys(password);
		 }
		 
		 public void setBirthMonth(String month){
			 el = driver.findElement(By.xpath(".//*[@id='month']/option[.='"+ month +"']"));
			 el.click();
		 }
		 
		 public void setBirthDay(String day){
			 el = driver.findElement(By.xpath(".//*[@id='day']/option[.='"+ day +"']"));
			 el.click();
		 }
		 
		 public void setBirthYear(String year){
			 el = driver.findElement(By.xpath(".//*[@id='year']/option[.='"+ year +"']"));
			 el.click();
		 }
		 
		 public void selectGender(String gender){
			 el = driver.findElement(By.xpath(".//*[@name='sex']/../label[.='"+ gender +"']/../input"));
			 el.click();
		 }
		 
		 public void clickSignUpButton(){
			 el = driver.findElement(By.xpath(".//*[@id='u_0_s']"));
			 el.click();
		 }
		 
		 public String getErrorMsg(){
			 el = driver.findElement(By.xpath("//*[@id='reg_error_inner']"));
			 return el.getText();
		 }
		 
		 public void waitForVisible(By locator){
			 wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 }
}
