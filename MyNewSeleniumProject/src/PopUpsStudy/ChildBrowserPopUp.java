package PopUpsStudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) 
	{

		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
			
	     WebDriver driver=new ChromeDriver();
			
		 driver.manage().window().maximize();
			
		 driver.get("https://skpatro.github.io/demo/links/");
		 
		 //TO handel child browser first we need to swith focus of selenium from main page to child page
		 
		 driver.findElement(By.name("NewWindow")).click();
		 
		 Set<String> allpageids = driver.getWindowHandles();
		 
		 System.out.println(allpageids);
		 
		 Iterator<String> it = allpageids.iterator();
		 
		 String mainpageid = it.next();
		 
		 String childpageid = it.next();
		 
		 driver.switchTo().window(childpageid);
		 
		 String MyText = driver.findElement(By.xpath("//h1[text()='About me']")).getText();
		 
		 System.out.println(" Child Page Text "+MyText);
		 
		 //switch selenium focus from child page to main page to take action on main page
		 
		 driver.switchTo().window(mainpageid);
		 
		 driver.findElement(By.name("NewTab")).click();
		 
		 //To handle new window open in new tab we need to switch focus
		 
		 Set<String> allids = driver.getWindowHandles();
		 
		 System.out.println(allids);
		 
		 Iterator<String> IT = allids.iterator();
		 
		 String Mid = IT.next();
		 
		 String CH1id = IT.next();
		 
		 String NewWindowid = IT.next();
		 
		 driver.switchTo().window(NewWindowid);
		 
	     String mytext = driver.findElement(By.xpath("//h3[text()='QA tools & automation testing techniques']")).getText();
	     
	     System.out.println("New Tab Text "+mytext);
	     
	     
		 
		 
		 
		 
		
		
		 

	}

}
