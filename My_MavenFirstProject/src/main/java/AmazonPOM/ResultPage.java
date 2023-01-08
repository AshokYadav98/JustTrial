package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ResultPage 
{
	@FindBy(xpath = "(//img[@class='s-image'])[4]")private WebElement searchProduct;
	
	
	public ResultPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnProduct()
	{
		 searchProduct.click();
		 
		 Reporter.log("clicking on product", true);
	}
	
	

	
}
