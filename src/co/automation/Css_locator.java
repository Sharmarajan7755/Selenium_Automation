package co.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajan.sharma\\Documents\\chrome\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//img[contains(@src,'nAIAAOSwsBtaDeZL')]")).click();
		
		Thread.sleep(4000);
		driver.close();
	
	
	}
	
}
