package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxPOM.UtilityProperties;

public class ShippingCartPage
{
	@FindBy(id = "a-autoid-0-announce")private WebElement Dropdown;
	@FindBy(xpath = "(//div[@class='a-popover-inner']//li)[5]")private WebElement selectquantityDropdown;
	
	@FindBy(xpath = "((//div[@class='a-cardui-body a-scroller-none'])[1]//div//span)[5]")private WebElement subToatl;
	
	
	public ShippingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectQauntityFromDropdown(WebDriver driver) throws InterruptedException
	{
		UtilityProperties.Wait(driver, 1000);
		
		Dropdown.click();
		
		Thread.sleep(1000);
		UtilityProperties.Wait(driver, 1000);
		selectquantityDropdown.click();
		
		Reporter.log("selecting quantity from dropdown", true);
	}
	
	public String gettingSubTotalAmount()
	{
		String ActualSubTotal = subToatl.getText();
		
		String realsubtotal = ActualSubTotal.substring(3);
		
		Reporter.log("getting actual sub total of product as per quantity", true);
		
		System.out.println("Actual sub total is "+realsubtotal);
		
		return realsubtotal;
	}

}
