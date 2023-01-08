package PopUpsStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenBrowserPopUp {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
			
	     WebDriver driver=new ChromeDriver();
			
		 driver.manage().window().maximize();
			
		 driver.get("https://www.flipkart.com/");
		 
		// Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		 driver.findElement(By.name("q")).sendKeys("I phone 14 pro max ");
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		
		
	

	}

}
