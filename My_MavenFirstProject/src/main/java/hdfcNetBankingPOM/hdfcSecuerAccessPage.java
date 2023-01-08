package hdfcNetBankingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class hdfcSecuerAccessPage 

{
	@FindBy(xpath = "//a[@title='Register Later']")private WebElement resisterlaterButton;
	
	public hdfcSecuerAccessPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnResisterlaterButton()
	{
		resisterlaterButton.click();
		Reporter.log("clicking on resisterlater button", true);
	}

}
