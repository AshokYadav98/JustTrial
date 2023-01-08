package IframStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
			
		 driver.manage().window().maximize();
			
		 driver.get("https://demoqa.com/nestedframes");
		 
		 String MainpageText = driver.findElement(By.xpath("//div[text()='Nested Frames']")).getText();
		 
		 System.out.println("Main Page Text Is "+MainpageText);
		 
		 driver.switchTo().frame("frame1");
		 
		 String Iframe1Text = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		
		 System.out.println("First iframe Text "+Iframe1Text);
		
		 WebElement Iframe2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		
		 driver.switchTo().frame(Iframe2);
		 
		 Thread.sleep(1000);
		 
		 String Iframe2Text = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		 
		 System.out.println("Text From Child Page "+Iframe2Text);
		 
		
		 
		 
		 
		 
		
		 
		 

	}

}
