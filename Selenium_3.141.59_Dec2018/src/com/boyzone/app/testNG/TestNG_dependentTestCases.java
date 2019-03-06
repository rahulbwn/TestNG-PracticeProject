package com.boyzone.app.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_dependentTestCases {
	SomeClasstoTest obj;

  @BeforeClass
  public void beforeClass() {
	  obj=new SomeClasstoTest();
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("");
  }
  
  @Test (dependsOnMethods={"TestMethod2"})
  public void TestMethod1() {
	  System.out.println("TestMethod1");
  }
  
  @Test
  public void TestMethod2() {
	  System.out.println("TestMethod2");
	  int result=obj.sum(2, 3);
	  Assert.assertEquals(result, 4);
  }
  @Test (dependsOnMethods={"TestMethod1"},alwaysRun=true)
  public void TestMethod3() {
	  System.out.println("TestMethod3");
  }
  
  @Test
  public void TestMethod4() {
	  System.out.println("TestMethod4");
  }

}
