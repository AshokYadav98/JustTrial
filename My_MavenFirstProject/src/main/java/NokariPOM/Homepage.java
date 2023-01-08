package NokariPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Homepage 
{

	@FindBy(xpath = "//div[text()='UPDATE PROFILE']")private WebElement updateProfile;
	
	
	public Homepage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnUpdateProfileButton()
	{
		updateProfile.click();
		
		Reporter.log("clicking on update profile button");
	}
}
