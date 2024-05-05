package com.boyzone.app.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationsClass2  {
  @Test
  public void test1() {
	  System.out.println("class 2 -> test1 execution");
  }
  
  @Test
  public void test2() {
	  System.out.println("class 2 -> test2 execution");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("class 2 -> Before each Test Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("class 2 -> After each Test Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("class 2 -> Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("class 2 -> After Class");
  }

}
