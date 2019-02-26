package TestN;

import org.testng.annotations.Test;

public class TestNG_dataProvider {
	
  @Test (dataProvider="inputs", dataProviderClass=getTestData.class)
  public void testMethod(String input1, String input2) {
	  System.out.println("Input 1 is :"+input1);
	  System.out.println("Input 2 is :"+input2);
  }
}
