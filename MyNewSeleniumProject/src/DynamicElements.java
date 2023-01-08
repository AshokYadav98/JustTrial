import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicElements {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");

        WebElement searchbar = driver.findElement(By.name("q"));
       
        searchbar.sendKeys("Honda");
	
        Thread.sleep(1000);
       
	    driver.findElement(By.xpath("(//ul[@jsname='bw4e9b']//li)[7]")).click();
	    
	    
	 //   Actions act=new Actions(driver);
	    
//	    act.moveToElement(searchbar).sendKeys("Hero").build().perform();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.linkText("Images")).click();
	    
	    List<WebElement> amaze = driver.findElements(By.tagName("img"));
	    
	    System.out.println("Toal images present on webpage are "+amaze.size());
	    
//	    act.keyDown(searchbar, Keys.ARROW_DOWN).perform();
//	    Thread.sleep(1000);
//	    act.keyDown(searchbar, Keys.ARROW_DOWN).perform();
//	    Thread.sleep(1000);
//	    act.keyDown(searchbar, Keys.ARROW_DOWN).perform();
//	    Thread.sleep(1000);
   //     act.keyDown(searchbar, Keys.ARROW_DOWN).perform();
//	    act.keyDown(searchbar, Keys.ARROW_DOWN).perform();
//	    act.keyDown(searchbar, Keys.ARROW_DOWN).perform();
//	    act.keyDown(searchbar, Keys.ARROW_DOWN).perform();
//	    act.keyDown(searchbar, Keys.ARROW_DOWN).perform();
	    
	 //   act.keyDown(Keys.ENTER).perform();
//	    
//	    for(int i=1;i<=3;i++)
//	    {
//	    	 Thread.sleep(1000);
//	     act.keyDown(searchbar, Keys.ARROW_DOWN).perform();
//	 	   
//	    	
//	    }
//	    act.keyDown(Keys.ENTER).perform();
	    
	
	
	
	}

}
