package POMStudy_FacebookExel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_TestClassExel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
				
	     driver.manage().window().maximize();
				
	     driver.get("https://www.facebook.com/");
	     
	     File myfile=new File("F:\\MY DOCUMENTS\\my new selenium file\\ExelReaderSetup\\poi-bin-5.2.3\\MyExelWork.xlsx");
	     
	     Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet7");
	    
	     String userid = mysheet.getRow(1).getCell(0).getStringCellValue();
	   
	     LogInPage login=new LogInPage (driver);
	     
	     login.EnterUserid(userid);
	     
	     Thread.sleep(500);
	     
	     login.EnterPassword(mysheet.getRow(1).getCell(1).getStringCellValue());
	     
	     Thread.sleep(500);
	     
	     login.ClickOnLogInButton();
	    

	}

}
