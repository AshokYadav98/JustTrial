package dropDownStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//handel dropdown of birthday
		
		Thread.sleep(1000);
		
		WebElement DayDropdown = driver.findElement(By.id("day"));
		
		Select BS=new Select(DayDropdown);
		
		BS.selectByIndex(0);
		
		//Handle Dropdown of Birthday Month
		
		Thread.sleep(1000);
		
		WebElement MonthDropdown = driver.findElement(By.id("month"));
		
		Select MS=new Select(MonthDropdown);
		
		MS.selectByVisibleText("Oct");
		
		//Handel Dropdown of Year
		
		Thread.sleep(1000);
		
		WebElement YearDropdown = driver.findElement(By.id("year"));
		
		Select YS=new Select(YearDropdown);
		
		YS.selectByValue("1998");
		
	}

}
