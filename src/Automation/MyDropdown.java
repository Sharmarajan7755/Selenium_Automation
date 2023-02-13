package Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MyDropdown {

	
	@Test
	void testDropdown() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajan.sharma\\Documents\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select sel = new Select(element);
		sel.selectByVisibleText("Amazon Devices");
		
		WebElement freselect = sel.getFirstSelectedOption();
		System.out.println("first element ="+ freselect.getText());
		
		List<WebElement> list= sel.getOptions();
		for (WebElement webElement : list) {
			System.out.println("list option = "+ webElement.getText());
			
		}
		
	}

}
