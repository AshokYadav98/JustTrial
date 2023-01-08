package POMStudy_UpstoxWithExel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonlyUsedMethods.CommonMethods;

public class HomePage 
{
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement USERID;
	@FindBy(id = "funds")private WebElement MyFund;
	@FindBy(xpath = "//div[text()='Logout']")private WebElement LogOutButton;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void ValidateUserid()
	{
	    String ActualUserId = USERID.getText();
		
		String ExpectedUID ="Pravin P.";
		
		if(ActualUserId.equals(ExpectedUID))
		{
			System.out.println("Actual and Expected UID are matching TC is passed ");
			
		}
		else
		{
			System.out.println("Actual and Expected UID are not matching TC is failed");
		}
	}
	public void ClickOnFundButton()
	{
		MyFund.click();
	}
	
	public void LogOutUpstox() throws InterruptedException
	{
		 USERID.click();
		 Thread.sleep(1000);
		 LogOutButton.click();
	}
	
	public String getactualuserid() 
	{
		String ActualUID = USERID.getText();
		return ActualUID;
	}
	
	

}
