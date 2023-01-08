package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class SignUppage 
{
	@FindBy(linkText = "Sign In")private WebElement LogInButton;
	
	public SignUppage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  ClickonLoginbutton(WebDriver driver)
	{
		UtilityProperties .Wait(driver, 1000);
		LogInButton.click();
		Reporter.log("Clicking on sign in button", true);
		
	}
			
		
		

}
