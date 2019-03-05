package TestN;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.TestngListeners.CustomListener1;


//@Listeners(CustomListener1.class)
public class ListenerClass1_demo {
	
	
  
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
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("Running test method 2");
  }
}
