package POMStudy_UpstoxWithExel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasscodePage
{
	@FindBy(id = "yob") private WebElement BirthYear;
	
	public PasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterBirthYear(String BYear)
	{
		BirthYear.sendKeys(BYear);
	}

}
