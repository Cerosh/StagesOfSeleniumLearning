package BDDStepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Stages.OfSelenium.PageObjectModel.DocumentationPage;
import Stages.OfSelenium.PageObjectModel.SeleniumHQPage;
import Stages.OfSelenium.PageObjectModel.SeleniumWebDriverPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	private WebDriver driver;
	protected String baseUrl = "http://www.seleniumhq.org";
	protected SeleniumHQPage seleniumHQ;
	protected DocumentationPage documentationPage;
	protected SeleniumWebDriverPage selWDpg;
	
	@Given("^that seleniumhq\\.org is available$")
	public void that_seleniumhq_org_is_available() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"/Users/ceroshjacob/Downloads/PageObjectModel/Browserdrivers/chromedriver");
		driver = new ChromeDriver();
		seleniumHQ = new SeleniumHQPage(driver);
	}

	@Given("^I navigated to documentation page$")
	public void i_navigated_to_documentation_page() throws Throwable {
		documentationPage = seleniumHQ.clickDocumentation();
	}

	@When("^I read the WebDriver documentation$")
	public void i_read_the_WebDriver_documentation() throws Throwable {
		selWDpg = documentationPage.navigateToWebDriverDocumentation();
	}

	@Then("^I should see the title \"([^\"]*)\"$")
	public void i_should_see_the_title(String arg1) throws Throwable {
		assertEquals(selWDpg.expectedTitle, selWDpg.getPageTitle());
		driver.quit();
	}


}
