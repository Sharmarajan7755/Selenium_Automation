package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExample {

	public String url = "https://www.edureka.co";
	String driverpath = "C:\\Users\\rajan.sharma\\Documents\\chrome\\chromedriver.exe";
	public WebDriver driver;

	@Test
	public void verifyHomePageTitle() {

		System.out.println("Launching browser");
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(url);
		String basetitle = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		String title = driver.getTitle();

		Assert.assertEquals(title, basetitle);

		driver.close();

	}

}
