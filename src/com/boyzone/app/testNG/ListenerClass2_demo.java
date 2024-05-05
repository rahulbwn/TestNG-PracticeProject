package com.boyzone.app.testNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.TestNGListeners.CustomListener2;




@Listeners(CustomListener2.class)
public class ListenerClass2_demo {
	
	
  
  @BeforeClass
  public void setUp() {
	  System.out.println("Running before Class method");
  }

  @AfterClass
  public void cleanUp() {
	  System.out.println("Running after Class method");
  }

  
  @Test
  public void testMethod1() {
	  System.out.println("Running test method 1");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("Running test method 2");
	  Assert.assertTrue(false);
  }
}
