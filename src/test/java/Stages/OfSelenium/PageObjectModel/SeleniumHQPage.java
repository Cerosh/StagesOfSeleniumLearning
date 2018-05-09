package Stages.OfSelenium.PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHQPage extends POM {
	protected WebDriver driver;
	
	public SeleniumHQPage(WebDriver driver) {
		this.driver = driver;
		driver.get(baseUrl + "/");
	}

	public DocumentationPage clickDocumentation() {
		driver.findElement(By.linkText("Documentation")).click();
		return new DocumentationPage(driver);
	}
}
