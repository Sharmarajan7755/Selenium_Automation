package co.automation;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {

	public static void main(String aargs[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajan.sharma\\Documents\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("hello");
		
		
		try {
			driver.findElement(By.name("fake")).click();

		} catch (NoSuchElementException e) {

			System.out.println("afdgavf");
			throw (e);

		}

	}

}
