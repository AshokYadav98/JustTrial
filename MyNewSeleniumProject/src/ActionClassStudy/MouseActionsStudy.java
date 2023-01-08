package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsStudy {

	public static void main(String[] args) throws InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
			
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//1.MoveToElement action
		
		Actions act=new Actions(driver);
		
		WebElement SalesText = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		
        act.moveToElement(SalesText).perform();
		
		//2.click -->mouse action
		
		WebElement ClickMe = driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[2]"));
		
//		act.moveToElement(ClickMe).perform();
//		
//		act.click().perform();
//		
 //   	act.moveToElement(ClickMe).click().build().perform();
		
	//	act.click(ClickMe).perform();
		
		//3.Drag And Drop
		
		
		
		WebElement Source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement Target = driver.findElement(By.id("amt8"));
		
		act.moveToElement(Source).clickAndHold().release(Target).build().perform();
		
		Thread.sleep(1000);
		
	//	WebElement Src = driver.findElement(By.xpath("//a[text()='-5000 ']"));
		
		WebElement Source1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement Target3 = driver.findElement(By.id("amt7"));
		
	//	WebElement Target2 = driver.findElement(By.id("bank"));
		
		act.moveToElement(Source1).clickAndHold().release(Target3).build().perform();
		
		

	}

}
