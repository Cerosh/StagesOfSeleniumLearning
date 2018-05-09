package Stages.OfSelenium.FirstStage;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicProgram {
	public static void main (String args[]) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "/Users/ceroshjacob/Downloads/PageObjectModel/Browserdrivers/chromedriver");	
	driver = new ChromeDriver();
	driver.get("http://www.seleniumhq.org");
	driver.findElement(By.linkText("Documentation")).click();
    driver.findElement(By.linkText("Selenium WebDriver")).click();
    assertEquals("Selenium WebDriver — Selenium Documentation", driver.getTitle());
    driver.quit();
	}

}
