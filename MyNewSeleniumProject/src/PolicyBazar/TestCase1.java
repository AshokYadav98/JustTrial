package PolicyBazar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
			  
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9822378459");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("Maroti@9422");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[text()='Family Health']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("submitButton")).click();
		
		Thread.sleep(1000);
		
		WebElement dropdown = driver.findElement(By.id("Self"));
		
		Select s=new Select(dropdown);
		
		s.selectByValue("24");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("//span[text()='Pune']")).click();
		   


	}

}
