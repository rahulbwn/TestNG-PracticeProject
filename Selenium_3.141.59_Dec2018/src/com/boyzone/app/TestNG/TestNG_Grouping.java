package TestN;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_Grouping {
	
  @Test (groups={"car","hetchback"})
  public void i20Test() {
	  System.out.println("i20Test");
  }
  
  @Test (groups={"car","suv"})
  public void breezaTest() {
	  System.out.println("breezaTest");
  }
  
  @Test (groups={"car","hetchback"})
  public void swiftTest() {
	  System.out.println("swiftTest");
  }
  
  @Test (groups={"bikes"})
  public void pulserTest() {
	  System.out.println("pulserTest");
  }
  
  @Test (groups={"bikes"})
  public void splenderTest() {
	 System.out.println("splenderTest");
  }
  
  @BeforeClass (alwaysRun=true)
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass (alwaysRun=true)
  public void afterClass() {
	  System.out.println("After Class");
  }

}
