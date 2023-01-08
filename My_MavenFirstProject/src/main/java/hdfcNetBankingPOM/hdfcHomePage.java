package hdfcNetBankingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class hdfcHomePage 
{
	@FindBy(xpath = "//span[@id='SavingTotalSummary']")private WebElement myAccBalance;
	
	
	public hdfcHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getAccBalnce()
	{
		String ActualBalance = myAccBalance.getText();
		
		Reporter.log("getting account balance", true);
		
		return ActualBalance;
		
	}
	

}
