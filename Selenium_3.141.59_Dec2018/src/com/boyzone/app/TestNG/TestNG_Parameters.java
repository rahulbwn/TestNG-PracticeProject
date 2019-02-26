package TestN;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters {

	@BeforeClass
	@Parameters({"browser","platform"})  // Read values of parameters from .xml file
	public void setUp(String browser, String platform) {
		System.out.println("Browser Parameter value is: "+browser);
		System.out.println("Operating System parameters is :"+platform);
	}

	@Test
	@Parameters({"response"})
	public void test(String response) {
		String[] strArray=response.split(",");
		System.out.println("Response parameter value is :"+response);
		System.out.println("strArray 1st value is :"+strArray[0]);
		System.out.println("strArray 2nd value is :"+strArray[1]);
	}
	
	

}


