package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {
  @Test
  public void MyTest1() 
  {
	  Reporter.log("Hi This Is MyTest1", true);
  }
  @BeforeMethod
  public void beforemethod()
  {
	  Reporter.log("before method is running", true);
  }
  @BeforeClass
  public void Beforeclas()
  {
	  Reporter.log("before class is running", true);
  }
  @AfterMethod
  public void aftermethod()
  {
	  Reporter.log("after method is running", true);
  }
  @AfterClass
  public void afterclass()
  {
	  Reporter.log("after class is running", true);
  }
  
  
}
