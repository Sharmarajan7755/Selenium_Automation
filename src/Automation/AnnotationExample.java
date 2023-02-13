package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample {

	public String url = "https://www.edureka.co";
	String driverpath = "C:\\Users\\rajan.sharma\\Documents\\chrome\\chromedriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void launchingBrowser() {
		System.out.println("Launching browser");
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();

	}

	@Test
	public void verifyHomeTitle() {
		driver.get(url);
		String basetitle = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		String title = driver.getTitle();

		Assert.assertEquals(title, basetitle);

	}

	@AfterTest
	public void closeBrowser() {

		driver.close();
	}

}
