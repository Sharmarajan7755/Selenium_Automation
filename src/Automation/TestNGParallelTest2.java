package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGParallelTest2 {

	@BeforeClass
	void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajan.sharma\\Documents\\chrome\\chromedriver.exe");
	}

	@Test
	void calctest() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		WebElement element = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		element.sendKeys("Selenium Webdriver");
		element.submit();

		AssertJUnit.assertTrue(driver.getTitle().startsWith("Selenium Webdriver"));

	}
}
