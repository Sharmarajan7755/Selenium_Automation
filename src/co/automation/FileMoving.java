package co.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileMoving {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajan.sharma\\Documents\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement Dragable = driver.findElement(By.id("draggable"));
		WebElement Dropable = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
	//	action.dragAndDrop(Dragable, Dropable).build().perform();

		action.clickAndHold(Dragable).moveToElement(Dropable).release().build().perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
