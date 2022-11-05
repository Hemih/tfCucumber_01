package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElement list
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	public WebElement USERNAME_ELE;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	public WebElement PASSWORD_ELE;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	public WebElement SIGNIN_BUTTON;

	// Corresponding Methods
	public void insertUserName(String username) {
		USERNAME_ELE.sendKeys(username);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void insertPassword(String password) {
		PASSWORD_ELE.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickSignInButton() {
		SIGNIN_BUTTON.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getPageTitle() {
		return driver.getTitle();

	}

	public WebElement clickOnButton(WebElement ele) {
		ele.click();
		return ele;
	}

}
