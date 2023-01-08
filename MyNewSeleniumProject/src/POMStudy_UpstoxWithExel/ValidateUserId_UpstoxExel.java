package POMStudy_UpstoxWithExel;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CommonlyUsedMethods.CommonMethods;

public class ValidateUserId_UpstoxExel 
{
	  WebDriver driver;
	  File myfile;
	   Sheet mysheet;
	   LogInPage login;
	   PasscodePage passcode;
	   HomePage HP;
	   CommonlyUsedMethods CO;
	   @FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement USERID;

	   
	
	@BeforeClass
	public void LounchBrowser() throws EncryptedDocumentException, IOException
	{

	   System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		  
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://login-v2.upstox.com/");
	   
	   myfile=new File("F:\\MY DOCUMENTS\\my new selenium file\\ExelReaderSetup\\poi-bin-5.2.3\\MyExelWork.xlsx");
	   mysheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
	   
	   login=new LogInPage (driver);
	   passcode=new PasscodePage(driver);
	   HP=new HomePage(driver);
	   CO=new CommonlyUsedMethods ();
	   
	   
	}
	@BeforeMethod
	public void Upstox_LogIn()
	{
		login.EnterUserId(mysheet.getRow(1).getCell(0).getStringCellValue());

        login.EnterPassword(mysheet.getRow(1).getCell(1).getStringCellValue());
		
		login.ClickOnSignInButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		passcode.EnterBirthYear(mysheet.getRow(1).getCell(2).getStringCellValue());
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
   @Test
    public void ValidateUpstoxUserId() throws IOException 
    {
	  String ExpectedUID = mysheet.getRow(1).getCell(3).getStringCellValue();
	  String ActualUID = HP.getactualuserid();
	  CO.Scrolling(driver, USERID);
	  CO.TakeScreenshot(driver, "Pravin P.");
	  Assert.assertEquals(ActualUID, ExpectedUID,"TC fail Actual and expected userid not matching");
	   
	  
    }
   @AfterMethod
   public void LogOutUpstox() throws InterruptedException
   {
	   HP.LogOutUpstox();
	   
	   
   }
   @AfterClass
   public void CloseUpstox()
   {
	   driver.close();
   }
}
