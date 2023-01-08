package JavascriptExecutorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysANDClick {

	public static void main(String[] args) throws InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
			
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement TextBox = driver.findElement(By.id("autocomplete"));
		
		js.executeScript("arguments[0].scrollIntoView (true)", TextBox);
		
		Thread.sleep(1000);
		
        js.executeScript("arguments[0].value='Ashok'",TextBox);
        
        WebElement CheckBox = driver.findElement(By.id("checkBoxOption1"));
        
        Thread.sleep(1000);
        
        js.executeScript("arguments[0].click();",CheckBox);

	}

}
