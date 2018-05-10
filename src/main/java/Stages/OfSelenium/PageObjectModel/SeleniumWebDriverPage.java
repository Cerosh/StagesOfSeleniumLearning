package Stages.OfSelenium.PageObjectModel;

import org.openqa.selenium.WebDriver;

public class SeleniumWebDriverPage extends POMTest {
	protected WebDriver driver;
	protected String actualTitle;
	public String expectedTitle = "Selenium WebDriver — Selenium Documentation";

	public SeleniumWebDriverPage(WebDriver driver) {
		this.driver = driver;
		
	}

	public String getPageTitle() {
		actualTitle = driver.getTitle();
		return actualTitle;
	}
}
