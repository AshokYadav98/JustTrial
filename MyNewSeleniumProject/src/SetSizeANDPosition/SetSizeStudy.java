package SetSizeANDPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
			
		// driver.manage().window().maximize();
			
		 driver.get("https://demoqa.com/nestedframes");
		 
		 Dimension defaultsize = driver.manage().window().getSize();
		 
		 System.out.println(defaultsize);
		 
		 Dimension D=new Dimension(1250, 950);
		 
		 Thread.sleep(1000);
		 
		 driver.manage().window().setSize(D);
		

	}

}
