package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest1 
{
  @Test
  public void A() 
  {
	  
	 // System.out.println("Test A running ");
	  
	  Reporter.log("Test A is Running", true);
  }
}
