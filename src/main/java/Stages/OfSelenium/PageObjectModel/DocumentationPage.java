package Stages.OfSelenium.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DocumentationPage extends POMTest {
	protected WebDriver driver;
	
	public DocumentationPage(WebDriver driver) {
		this.driver = driver;
	}

	public SeleniumWebDriverPage navigateToWebDriverDocumentation() {
		driver.findElement(By.linkText("Selenium WebDriver")).click();
		return new SeleniumWebDriverPage(driver);
	}

}
