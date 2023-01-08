package AmazonTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmazonPOM.HomePage;
import AmazonPOM.ProductDetails;
import AmazonPOM.ResultPage;
import AmazonPOM.ShippingCartPage;

import neoStoxBase.BaseForAmazon;
import neoStoxUtilityMaven.UtilityPropertyAmazon;

@Listeners(listener.ListenerAmazon.class)
public class addToCart extends BaseForAmazon
{
	
	
	
	HomePage home;
	ResultPage Result;
	ProductDetails prod;
	ShippingCartPage ship;
	
	
  @BeforeClass
  
  public void launchingBrowser() throws InterruptedException, IOException
  {
	  Launchbrowser();
	  
	  home=new HomePage(driver);
	  
	  Result=new ResultPage(driver);
	  
	  prod=new ProductDetails(driver);
	  
	  ship=new ShippingCartPage(driver);
  }
  
  @BeforeMethod
  public void processOfAddToCart() throws InterruptedException, IOException
  {
	  home.enteringProduct("product1");
	  
	  UtilityPropertyAmazon.Wait(driver, 1000);
	  
	//  home.selectIphone13(driver);
	  
	  UtilityPropertyAmazon.Wait(driver, 1000);
	  
	  home.clickOnSearchBar();
	  
	  UtilityPropertyAmazon.Wait(driver, 1000);
	  
	  Result.clickOnProduct();
	  
	  UtilityPropertyAmazon.Wait(driver, 1000);
	  
	  prod.clickOnAddToCart();
	  prod.clickOnCartEnteringButton();
	  
	  UtilityPropertyAmazon.Wait(driver, 1000);
	  
	  ship.selectQauntityFromDropdown(driver);
	  
	  
  }
	
  @Test
  public void validateSubToatlAmount() throws IOException 
  {
	  UtilityPropertyAmazon.Wait(driver, 1000);
	  
	  Assert.assertEquals(ship.gettingSubTotalAmount(), UtilityPropertyAmazon.readDataFromPropertyFile("expsubtotal"));
	  
	  
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}
