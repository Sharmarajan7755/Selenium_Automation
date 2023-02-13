package co.automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlerts_01 {

	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajan.sharma\\Documents\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		Robot robot = new Robot();
		robot.mouseMove(760, 170);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		driver.quit();

	}

}
