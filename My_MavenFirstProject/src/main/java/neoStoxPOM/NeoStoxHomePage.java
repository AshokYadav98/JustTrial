package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class NeoStoxHomePage 
{
	@FindBy(xpath = "(//a[text()='OK'])[2]")private WebElement OkButton;
	
	@FindBy(xpath = "(//a[text()='Close'])[5]")private WebElement CloseButton;
	
	@FindBy(id = "lbl_username")private WebElement userName;
	
	@FindBy(id = "lbl_curbalancetop")private WebElement accBalance;
	
	@FindBy(xpath = "//span[text()='Logout']")private WebElement logOutButton;
	
	public NeoStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void HandelPopUp(WebDriver driver)
	{
		if(OkButton.isDisplayed())
		{
			UtilityProperties .Wait(driver, 1000);
			OkButton.click();
			Reporter.log("Clicking on ok button of popup", true);
			
			UtilityProperties .Wait(driver, 1000);
			CloseButton.click();
			Reporter.log("Clicking on close button of popup ", true);
			
		}
		else
		{
			Reporter.log("there is no popup", true);
			UtilityProperties .Wait(driver, 1000);
		}
		
		
	}
	
	public String getActualUserName(WebDriver driver)
	{  
		UtilityProperties .Wait(driver,1000);
		String ActualUsername = userName.getText();
		
		String Realusername = ActualUsername.substring(3);
	    Reporter.log("getting actual username", true);
	    Reporter.log("Actual username is "+Realusername, true);
		return Realusername;
	}
	
	public String getAccBalance(WebDriver driver)
	{
		UtilityProperties .Wait(driver,1000);
		String Accbalance = accBalance.getText();
		
		Reporter.log("getting Accbalance ", true);
		
		Reporter.log("My accbalance is "+Accbalance, true);
		
		return Accbalance;
	}
	
	public void logOut(WebDriver driver)
	{
		UtilityProperties .Wait(driver,1000);
		
		userName.click();
		UtilityProperties .Wait(driver,1000);
		
		Reporter.log("logging out from neostox ", true);
		logOutButton.click();
		
		
		
		
		
		
		
	}

}
