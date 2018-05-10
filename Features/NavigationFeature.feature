Feature: contains various scenarios to navigate through the SeleniumHQ site

  Scenario: Verify WebDriver documentation
    Given that seleniumhq.org is available
    And  I navigated to documentation page
    When I read the WebDriver documentation 
    Then I should see the title "Test Design Considerations — Selenium Documentation" 
