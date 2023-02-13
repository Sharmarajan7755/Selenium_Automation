package co.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajan.sharma\\Documents\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.edureka.co");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//a[@class='dropdown-toggle hidden-xs hidden-sm ga_browse_top_cat']"))).build().perform();
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.xpath("//div[@class='dropdown dropdown_category_list']//a[@href='/software-testing-certification-courses']"));
		builder.moveToElement(link).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='dropdown dropdown_category_list']//a[@href='/software-testing-certification-courses']"));
		Thread.sleep(3000);
		
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
