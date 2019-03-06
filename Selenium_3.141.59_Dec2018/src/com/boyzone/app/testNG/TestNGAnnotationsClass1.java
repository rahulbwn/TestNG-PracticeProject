package com.boyzone.app.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseSuiteClass;

public class TestNGAnnotationsClass1 extends BaseSuiteClass {
  @Test
  public void test1() {
	  System.out.println("Class 1 -> test1 execution");
  }
  
  @Test
  public void test2() {
	  System.out.println("Class 1 -> test2 execution");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Class 1 -> Before each Test Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Class 1 -> After each Test Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Class 1 -> Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Class 1 -> After Class");
  }

}
