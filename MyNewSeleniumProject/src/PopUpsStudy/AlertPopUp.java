package PopUpsStudy;

import java.time.Duration;
import java.util.concurrent.locks.Condition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
			
	     WebDriver driver=new ChromeDriver();
			
		 driver.manage().window().maximize();
			
		 driver.get("https://demoqa.com/alerts");
		 
		 WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(1000));
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("alertButton")).click();
		 
		 Alert alt = driver.switchTo().alert();
		 
		 Thread.sleep(1500);
		 
		 alt.accept();
		
	}

}
