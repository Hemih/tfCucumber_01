package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TestBase;

public class TechFiosLoginStepDefinitions extends TestBase {

	LoginPage loginPage;
	DashboardPage dashboardPage;

	@Before
	public void starter() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);

	}

	@Given("^User is on the techfios login page$")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");

	}

	@When("^User enters the password as \"([^\"]*)\"$")
	public void user_enters_the_password_as(String password) {
		loginPage.insertPassword(password);
	}

	@When("^User enters the username as \"([^\"]*)\"$")
	public void user_enters_the_username_as(String username) {
		loginPage.insertUserName(username);
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() {
		loginPage.clickSignInButton();
	}

	@When("^User enters the \"([^\"]*)\" in \"([^\"]*)\" feild$")
	public void user_enters_the_in_feild(String loginData, String feild) throws Throwable {

		if (loginData.equalsIgnoreCase("Username")) {
			loginPage.insertUserName(loginData);
			;
			System.out.println("UserName:" + loginData);
		} else if (loginData.equalsIgnoreCase("Password")) {
			loginPage.insertPassword(loginData);
			;
			System.out.println("Password:" + loginData);
		} else {
			System.out.println("Unable to enter login data:" + loginData);
		}
	}

	@Then("^User clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String buttonOrLink) {
		switch (buttonOrLink) {
		case "login":
			loginPage.clickOnButton(loginPage.SIGNIN_BUTTON);
			break;
		case "bankCash":
			dashboardPage.clickBankCashButton();
			;
			break;
		default:
			System.out.println("Unable to click button or link data:" + buttonOrLink);
			break;
		}

	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() {
		String expTitle = "Dashboard- iBilling";
		String expectedTitle = expTitle.trim();
		String actualTitle = loginPage.getPageTitle().trim();
		Assert.assertEquals("Eureka! Page titles are NOT Matching! ", expectedTitle, actualTitle);
		takeScreenshot(driver);
		
	}

	@Then("^User should not land on Dashboard page$")
	public void user_should_not_land_on_Dashboard_page() {
		String expTitle = "Login - iBilling";
		String expectedTitle = expTitle.trim();
		String actualTitle = loginPage.getPageTitle().trim();
		Assert.assertEquals("Eureka! Page titles are NOT Matching! ", expectedTitle, actualTitle);
		
	}

	@Then("^User enters\"([^\"]*)\"in accounts page$")
	public void user_enters_in_accounts_page(String arg1) {

	}

	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully() {

	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
