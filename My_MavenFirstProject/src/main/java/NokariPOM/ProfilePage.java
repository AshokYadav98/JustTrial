package NokariPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ProfilePage 
{
	@FindBy(xpath = "//span[@name='Mobile']")private WebElement mobNumber;
	
	@FindBy(xpath = "//span[@name='Email']")private WebElement emailId;
	
	
	public ProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver ,this);
	}
	
	public String getMobNumber()
	{
		String ActualMobNumber = mobNumber.getText();
		Reporter.log("returning actual mobile number");
		return ActualMobNumber;
	}
	
	public String getEmailId()
	{
		String actualEmailId = emailId.getText();
		Reporter.log("returning email id");
		return actualEmailId;
	}

}
