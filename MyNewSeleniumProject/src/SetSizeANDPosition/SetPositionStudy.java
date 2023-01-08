package SetSizeANDPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionStudy {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
			
		// driver.manage().window().maximize();
			
		driver.get("https://demoqa.com/nestedframes");
		
		Point defaultPosition = driver.manage().window().getPosition();
		
		System.out.println(defaultPosition);
		
		Point P=new Point(70, 9);
		
		driver.manage().window().setPosition(P);
	

	}

}
