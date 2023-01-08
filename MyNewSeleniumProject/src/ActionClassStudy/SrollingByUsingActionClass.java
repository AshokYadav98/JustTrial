package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SrollingByUsingActionClass {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
				
	     driver.manage().window().maximize();
				
	     driver.get("https://vctcpune.com/");
	     
	     Actions act=new Actions(driver);
	     
	     //1.Scrolling BY Amount
	     
	     Thread.sleep(500);
	     
	     act.scrollByAmount(0, 100).perform();
	     
	     WebElement Text = driver.findElement(By.xpath("//h2[text()='Start Practicing Now']"));
	    
	     Thread.sleep(1000);
	    
	     act.scrollToElement(Text).perform();
	     

	}

}
