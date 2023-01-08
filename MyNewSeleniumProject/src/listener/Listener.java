package listener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBase.BaseProperties;
import neoStoxUtility.Utility;
import neoStoxUtility.UtilityProperties;


public class Listener extends BaseProperties  implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String methodname = result.getName();
		
		Reporter.log("TC "+methodname+" is failed please try again", true);
		
//		try {
//			Utility.Screenshot(driver, methodname);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		Reporter.log("TC "+result.getName()+" is passed successfully", true);
		
		try {
			UtilityProperties.Screenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC "+result.getName()+" is skipped please check ", true);
		
	}
	
}
