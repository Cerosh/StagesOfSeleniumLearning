package Stages.OfSelenium.PageObjectModel;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POMTest {
	private WebDriver driver;
	protected String baseUrl = "http://www.seleniumhq.org";
	protected SeleniumHQPage seleniumHQ;
	protected DocumentationPage documentationPage;
	protected SeleniumWebDriverPage selWDpg;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/ceroshjacob/Downloads/PageObjectModel/Browserdrivers/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void testVerifyTitle_WebDriverDocumentation() throws Exception {
		seleniumHQ = new SeleniumHQPage(driver);
		documentationPage = seleniumHQ.clickDocumentation();
		selWDpg = documentationPage.navigateToWebDriverDocumentation();
		assertEquals(selWDpg.expectedTitle, selWDpg.getPageTitle());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
