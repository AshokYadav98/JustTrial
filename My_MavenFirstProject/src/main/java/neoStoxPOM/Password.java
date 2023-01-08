package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class Password 
{
	@FindBy(id = "txt_accesspin")private WebElement Enter4digitpin;
	@FindBy(xpath = "//a[text()='Submit']")private WebElement submitbutton;
	
	public  Password (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enter4digitpin(WebDriver driver,String pin)
	{
		UtilityProperties .Wait(driver, 1000);
		 Enter4digitpin.sendKeys(pin);
		 
		 Reporter.log("Entering password ", true);
	}
	public void Clickonsubmitbutton(WebDriver driver)
	{
		UtilityProperties .Wait(driver, 1000);
		submitbutton.click();
		Reporter.log("clicking on submit button", true);
	}

}
