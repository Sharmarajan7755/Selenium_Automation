package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajan.sharma\\Documents\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Knowledge shooter channel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		
		//driver.findElement(By.xpath("//yt-formatted-string[@id=\"text\"][@title=\"Bollywood Music\"]")).click();
		//*[@id="text"][text()="Music"]
		//yt-formatted-string[@title="Gaming"][text()="Gaming"]
		
	}

}
