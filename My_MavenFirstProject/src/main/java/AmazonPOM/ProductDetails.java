package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetails
{
	
	@FindBy(id = "add-to-cart-button")private WebElement addToCart;
	
	@FindBy(xpath = "(//a[@class='a-button-text'])[3]")private WebElement cartOpenButton;
	
	public ProductDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddToCart()
	{
		addToCart.click();
	}
	
	public void clickOnCartEnteringButton()
	{
		cartOpenButton.click();
	}
}
