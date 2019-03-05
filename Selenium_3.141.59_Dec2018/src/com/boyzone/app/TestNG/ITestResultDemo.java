package TestN;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class ITestResultDemo {
  @Test
  public void testMethod1() {
	  System.out.println("Running test -> TestMethod 1");
	  Assert.assertTrue(false);
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("Running test -> TestMethod 2");
	  Assert.assertTrue(true);
  }
  
  @AfterMethod
  public void afterMethod(ITestResult testResult) {
	  
	  if(testResult.getStatus()==ITestResult.FAILURE)
	  {
		  System.out.println("Failure: "+testResult.getMethod().getMethodName());
	  }
	  if(testResult.getStatus()==ITestResult.SUCCESS)
	  {
	  System.out.println("Success: "+testResult.getName());
	  }
  }

}
