package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Q. What is a dynamic element on the web page? A dynamic element is an element
 * which has 'dynamic attributes' and/or 'dynamic location' on the web page.
 * 
 * Q. How to locate the dynamic elements on the web page? We can locate dynamic
 * elements using: 
 * (a) Absolute XPath
 * /html[1]/body[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/li[1]
 * 
 * (b) Relative XPath using Functions and Axes (refer: https://developer.mozilla.org/en-US/docs/Web/XPath)
 *  (i) XPath Functions
 *  //a[starts-with(@href, "https://play.google.com/")]
 *  //a[contains(@href,"play.google.com/")]
 *  //span[text() = "Play"]
 *  (ii) XPath Axes //span[text() ="Play"]/preceding-sibling::span
 *   //a[starts-with(@href,"https://play.google.com/")]/parent::li
 * 
 * (c) CSS (refer:https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors)
 *  (i) Simple selectors with Wildcards a[href^="https://play.google.com/"]
 *  a[href*="play.google.com"] a[href$="hl=en&tab=w8"] (ii) Multiple selectors
 * [class="gb_O"][data-pid="78"] (iii) Combinators Child combinator(A > B)
 * a[href*="play.google"]>span.gb_W Descendant combinator(A B) ul.gb_da.gb_6
 * a[href*="play.google"] Adjacent sibling combinator(A + B) ul.gb_da.gb_6+a
 * General sibling combinator(A ~ B) ul.gb_da.gb_6~ul ul.gb_da.gb_6~a.gb_fa
 *
 */
public class LocateDynamicWebElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajan.sharma\\Documents\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		driver.findElement(By.cssSelector("a[title='Google apps']")).click();
		driver.findElement(By.cssSelector("a[href*='play.google.com']")).click();

		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'play.google.com')]")).click();
	}
}
