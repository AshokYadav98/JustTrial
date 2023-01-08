package AmazonPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxPOM.UtilityProperties;

public class HomePage
{
	
	@FindBy(id = "twotabsearchtextbox")private WebElement searchbar;
	
//	@FindBy(xpath = "(//div[@class='nav-issFlyout nav-flyout']//div)[15]")private WebElement Iphone;
	
	@FindBy (id = "nav-search-submit-button")private WebElement searchButton;
	
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enteringProduct(String key) throws IOException
	{
		 searchbar.sendKeys(AmazonUtility.readDataFromPropertyFile(key));
		 
		 Reporter.log("entring product "+key+" ",true);
	}
	
//	public void selectIphone13(WebDriver driver)
//	{
//		UtilityProperties.Wait(driver, 1000);
//		Iphone.click();
//		
//		Reporter.log("selecting i phone 13 from list", true);
//	}
	
	public void clickOnSearchBar()
	{
		searchButton.click();
		
		Reporter.log("clicking on search button", true);
	}


}
