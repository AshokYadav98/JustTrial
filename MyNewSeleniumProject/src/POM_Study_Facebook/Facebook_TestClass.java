package POM_Study_Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_TestClass {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
				
	     driver.manage().window().maximize();
				
	     driver.get("https://www.facebook.com/");
	     
	     LoginPage login=new LoginPage (driver);
	     
	     login.EnterUserid();
	     Thread.sleep(500);
	     login.EnterPassword();
	     Thread.sleep(500);
	     login.ClickOnLogInButton();
	   
	}

}
