package VerificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing {
  @Test
  public void VerifyCheckBoxStatus() 
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
	  WebDriver driver=new ChromeDriver();
			
	  driver.manage().window().maximize();
			
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  
	  WebElement CheckBox1 = driver.findElement(By.id("checkBoxOption1"));
	  
//	  if(CheckBox1.isSelected())
//	  {
//		  Reporter.log(" check box is selected TC pased ", true);
//	  }
//	  else
//	  {
//		  Reporter.log(" check box is not selected TC fail", true);
//	  }
	  
	  CheckBox1.click();
//	  
	  Assert.assertTrue(CheckBox1.isSelected(), "Checkbox is not selected TC is failed");
	  
	  
	
	  
	  
  }
}
