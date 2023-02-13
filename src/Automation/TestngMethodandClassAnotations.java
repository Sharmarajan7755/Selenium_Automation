package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngMethodandClassAnotations {

	WebDriver driver;
	
	@BeforeClass
	void setupClass () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajan.sharma\\Documents\\chrome\\chromedriver.exe");

	}
	@BeforeMethod
	void setup() {
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}

	@Test
	void calcTest() {
		
		WebElement element = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		element.sendKeys("2 + 3");
		element.submit();

		WebElement result = driver.findElement(By.xpath("//span[@id=\"cwos\"]"));
		Assert.assertEquals(result.getText(), "5");

	}

	@Test
	void calcTest2() {
		
		WebElement element = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		element.sendKeys("sqrt 16");
		element.submit();

		WebElement result = driver.findElement(By.xpath("//span[@id=\"cwos\"]"));
		Assert.assertEquals(result.getText(), "4");

	}

	@AfterMethod
	void endup() {
		driver.close();
	
	}
}
