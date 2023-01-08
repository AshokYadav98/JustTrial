package POMStudy_UpstoxWithExel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{
	@FindBy(id = "userCode") private WebElement UsreId;
	@FindBy(name = "password") private WebElement Password;
	@FindBy(xpath = "//div[text()='Sign into Upstox']")private WebElement SignUpButton;
	
	public LogInPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserId(String userid)
	{
		 UsreId.sendKeys(userid);
	}
	public void EnterPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void ClickOnSignInButton()
	{
		SignUpButton.click();
	}

}
