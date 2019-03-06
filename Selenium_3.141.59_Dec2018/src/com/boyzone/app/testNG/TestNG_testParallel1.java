package com.boyzone.app.testNG;

import org.testng.annotations.Test;

public class TestNG_testParallel1 {
  @Test
  public void testMethod1() throws InterruptedException {
	  System.out.println("TestNG_testParallel1 - > test method 1");
	  Thread.sleep(6000);
	  System.out.println("TestNG_testParallel1 - > test method 1 -> More steps");
  }
  
  @Test
  public void testMethod2() throws InterruptedException {
	  System.out.println("TestNG_testParallel1 - > test method 2");
	  Thread.sleep(6000);
	  System.out.println("TestNG_testParallel1 - > test method 2 -> More steps");
  }
}
