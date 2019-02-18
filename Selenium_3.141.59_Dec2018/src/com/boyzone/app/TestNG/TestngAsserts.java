package TestN;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestngAsserts {
	
  @Test
  public void SumTest() 
  {
	  SomeClasstoTest obj=new SomeClasstoTest();
	  int result=obj.sum(2, 3);
	  Assert.assertEquals(result, 5);
  }
  
  @Test
  public void StringTest()
  {
	  SomeClasstoTest obj=new SomeClasstoTest();
	  String result=obj.ConcatString("Hello","World");
	  String ExpectedString="Hello World";
	  Assert.assertEquals(result, ExpectedString);
  }
  
  @Test
  public void ArrayTest()
  {
	  SomeClasstoTest obj=new SomeClasstoTest();
	  int[] result=obj.SampleArray();
	  int[] expectedArray={1,2,3};
	  
	  Assert.assertEquals(result, expectedArray);
	 
  }
}
