package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		
	}
	// WebElement List 
	@FindBy(how = How.XPATH,using = "//*[@id=\"side-menu\"]/li[10]/a")
	public WebElement BANK_CASH_BUTTON ;
	@FindBy(how = How.XPATH,using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	public WebElement NEW_ACCOUNT_BUTTON ;
	
	
	// Corresponding Methods
	public void clickBankCashButton() {
		BANK_CASH_BUTTON.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}public void clickNewAccountButton() {
		NEW_ACCOUNT_BUTTON.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
