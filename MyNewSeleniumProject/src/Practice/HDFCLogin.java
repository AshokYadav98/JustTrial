package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCLogin {

	public static void main(String[] args) throws InterruptedException
	{
		
		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
				
	     driver.manage().window().maximize();
				
	     driver.get(("https://netbanking.hdfcbank.com/netbanking/"));
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	     
	     driver.findElement(By.xpath("fldCustIdDispId")).sendKeys("185611001");
	     
	     
		
	}

}
