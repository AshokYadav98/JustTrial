package multiSelectDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Exa1 {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement MultiSelectDr = driver.findElement(By.name("cars"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(MultiSelectDr);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Select MS=new Select(MultiSelectDr);
		
		MS.selectByIndex(1);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		MS.selectByValue("audi");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		MS.selectByVisibleText("Volvo");
		

	}

}
