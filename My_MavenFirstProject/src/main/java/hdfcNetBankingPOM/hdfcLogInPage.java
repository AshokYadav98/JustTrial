package hdfcNetBankingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxPOM.UtilityProperties;

public class hdfcLogInPage 
{
	@FindBy(xpath = "//input[@type='text']")private WebElement userid;
//	@FindBy(xpath = "//a[text()='CONTINUE']")private WebElement continueButton;
//	@FindBy(name = "fldPassword")private WebElement password;
//	@FindBy(xpath = "//a[contains(text(),'LOGIN')]")private WebElement loginButton;
//	
	public hdfcLogInPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserId(WebDriver driver,String user)
	{
		UtilityProperties.Wait(driver, 1000);
		userid.sendKeys(user);
		Reporter.log("entering userid", true);
	}
//	
//	public void continuebutton(WebDriver driver)
//	{
//		UtilityProperties.Wait(driver, 1000);
//		continueButton.click();
//		Reporter.log("clicking on continue button", true);
//	}
//	public void enterpassword(WebDriver driver,String pass)
//	{
//		UtilityProperties.Wait(driver, 1000);
//		password.sendKeys(pass);
//		Reporter.log("entering password ", true);
//	}
//	
//	public void clickonloginbutton(WebDriver driver)
//	{
//		UtilityProperties.Wait(driver, 1000);
//		loginButton.click();
//		Reporter.log("clicking on login button ", true);
//	}

}
