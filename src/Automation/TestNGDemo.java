package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Q. How to mark any method as part of test?
 * @Test:	Marks a class or a method as part of the test.
 * 
 * Q. Commonly used assert methods to assert the result?
 * Assert.assertEquals(actual, expected);
 * Assert.assertNotEquals(actual, expected);
 * Assert.assertTrue(condition);
 * Assert.assertFalse(condition);
 * Assert.assertNull(object);
 * Assert.assertNotNull(object);	
 */
public class TestNGDemo {
	
	@Test
	void calcTest() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajan.sharma\\Documents\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
        
		
		 WebElement element = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")); 
		 element.sendKeys("2 + 3");
		 element.submit();
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
		  WebElement result = driver.findElement(By.xpath("//span[@id=\"cwos\"]"));
		  Assert.assertEquals(result.getText(), "5");
		 
		  Thread.sleep(3000);
		  driver.close();
	
	}
}
