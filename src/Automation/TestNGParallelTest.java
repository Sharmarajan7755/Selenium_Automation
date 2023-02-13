package Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGParallelTest {

	

	@BeforeClass
	void setupClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajan.sharma\\Documents\\chrome\\chromedriver.exe");

	}

	@Test
	void calcTest() {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		WebElement element = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		element.sendKeys("sqrt 16");
		element.submit();

		WebElement result = driver.findElement(By.xpath("//span[@id=\"cwos\"]"));
		AssertJUnit.assertEquals(result.getText(), "4");

	}

	@Test
	void searchTest() {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		WebElement element = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		element.sendKeys("Selenium Webdriver");
		element.submit();

		AssertJUnit.assertTrue(driver.getTitle().startsWith("Selenium Webdriver"));

	}

}
