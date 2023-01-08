import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NPTLETestCase {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
			  
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nptel.ac.in/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[contains(@style,'margin: 0; font-size: 14')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='createAccount']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("UserId")).sendKeys("Ashok1133");
		Thread.sleep(1000);
		driver.findElement(By.id("newPassword")).sendKeys("Yadav@7448");
		Thread.sleep(1000);
		driver.findElement(By.id("reenterPassword")).sendKeys("Yadav@7448");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("ashokyadav9527@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("email_ver_input")).click();
		
		
	

	}

}
