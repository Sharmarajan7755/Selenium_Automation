package Automation;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Excercise2 {
	
	WebDriver driver;
	
	
	@BeforeMethod
	void setupMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajan.sharma\\Documents\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
	}
	
	@Test
	void loginTest() {
		driver.get("https://artsandculture.google.com/?pli=1");
		driver.findElement(By.linkText("Sign in")).click();
		
		Set<String> tabs = driver.getWindowHandles();
		for(String tab: tabs) {
			driver.switchTo().window(tab);
			if(driver.getTitle().equals("Sign in - Google Accounts")) {
				break;
			}
		}
		driver.findElement(By.id("identifierId")).sendKeys("rajansharma7273");
		driver.findElement(By.id("identifierNext")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("identifierNext")));	
		
		
		driver.findElement(By.id("password")).sendKeys("@@@@@@@@");
		driver.findElement(By.id("identifierNext")).click();
	}
	

}
