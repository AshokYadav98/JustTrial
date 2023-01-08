package CrossBrowserStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void LounchingFacebook() 
  {
	  System.setProperty("webdriver.gecko.driver", "F:\\MY DOCUMENTS\\my new selenium file\\GeckodriverFirefox\\geckodriver.exe");
	  
	  WebDriver driver=new FirefoxDriver();
	  
	  driver.get("https://www.amazon.in/");
  }
}
