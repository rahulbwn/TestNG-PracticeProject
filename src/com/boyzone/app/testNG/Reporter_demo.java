package com.boyzone.app.testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Reporter_demo {
 
  @BeforeClass
  public void beforeClass() {
	  Reporter.log("This will run before class", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("This will run after class", true);
  }
  
  @Test
  public void testMethod1() {
	  
	  Reporter.log("Running TestMethod 1", true);
  }
  
  @Test
  public void testMethod2() {
	  Reporter.log("Running TestMethod 2", true);
	  Assert.assertTrue(false);
  }
  
  @Test (dependsOnMethods={"testMethod2"})
  public void testMethod3()  {
	  Reporter.log("Running TestMethod 3", true);
  }

}
