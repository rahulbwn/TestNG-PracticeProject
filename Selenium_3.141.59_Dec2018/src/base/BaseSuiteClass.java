package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseSuiteClass {
 
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BaseSuiteClass -> Before Class");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("BaseSuiteClass -> After Test");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("BaseSuiteClass -> Before Test");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("BaseSuiteClass -> After Class");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BaseSuiteClass -> Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("BaseSuiteClass -> After Suite");
  }

}
